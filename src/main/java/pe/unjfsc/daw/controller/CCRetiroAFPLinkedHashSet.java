package pe.unjfsc.daw.controller;


import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pe.unjfsc.daw.entity.CENatalidad;
import pe.unjfsc.daw.logical.impl.CMLecheProducidaDia;
import pe.unjfsc.daw.logical.impl.CMNatalidad;

@Controller
public class CCRetiroAFPLinkedHashSet {
	private static final Logger log = LoggerFactory.getLogger("CMNatalidad");
	private LinkedHashSet<CENatalidad> oListaFinal;

	@Autowired
	private CMNatalidad oCMNatalidad;
	
	@RequestMapping(value = "ListadoNatalidad.lhs")
	public ModelAndView linkedHashSetConsulta() {
		String lArchivoRealJsp="jspNatalidad";
		String lFechaSistema=(new Date().toString());		
		oListaFinal = new LinkedHashSet<CENatalidad>();	
		oListaFinal = oCMNatalidad.consultAllRetiros();		
		Map<String, Object> myModel = new HashMap<String,Object>();
		myModel.put("now", lFechaSistema);
		myModel.put("listNatalidad", oListaFinal);
		return new ModelAndView(lArchivoRealJsp,"model",myModel);
	}
	
	@RequestMapping(value="agregarNatalidad.lhs", method=RequestMethod.GET)
	public ModelAndView addNatalidad() {
		ModelAndView model = new ModelAndView();
		CENatalidad pCENatalidad = new CENatalidad();
		model.addObject("natalidadForm", pCENatalidad);
		model.setViewName("natalidadForm");
		return model;
	}
	
	@RequestMapping(value="save.lhs", method=RequestMethod.POST)
	public ModelAndView saveNatalidad(@ModelAttribute("natalidadForm") CENatalidad pCENatalidad) {
		String lArchivoRealJsp="jspNatalidad";
		oCMNatalidad.saveNatalidad(pCENatalidad);
		oListaFinal = new LinkedHashSet<CENatalidad>();		
		oListaFinal = oCMNatalidad.consultAllRetiros();		
		Map<String, Object> myModel = new HashMap<String,Object>();
		myModel.put("listNatalidad", oListaFinal);
		log.info("Registro en controller" + pCENatalidad);
		return new ModelAndView(lArchivoRealJsp,"model",myModel);
	}
	@RequestMapping(value="updateNatalidad.lhs/{CUIA}.lhs", method=RequestMethod.GET)
	public ModelAndView updateNatalidad(@PathVariable int CUIA,CENatalidad pCeNatalidad) {
		ModelAndView model = new ModelAndView();
		CENatalidad pCENatalidad = oCMNatalidad.consultByIdCUIA(CUIA);
		model.addObject("natalidadFormUpdate", pCENatalidad);
		model.setViewName("natalidadFormUpdate");
		return model;
	}
	/*@RequestMapping(value="updateNatalidad.lhs/{CUIA}", method=RequestMethod.GET)
	public ModelAndView updateNatalidad(@PathVariable int CUIA,HttpServletRequest request,HttpServletResponse response) {
		ModelAndView model = new ModelAndView();
		CENatalidad pCENatalidad = oCMNatalidad.consultByIdCUIA(CUIA);
		log.info("registro encontrado" + pCENatalidad);
		model.addObject("natalidadFormUpdate", pCENatalidad);
		model.setViewName("natalidadFormUpdate");
		return model;
	}*/
	
	@RequestMapping(value = "update.lhs", method=RequestMethod.POST)
	public ModelAndView updateNatalidad(@ModelAttribute("natalidadFormUpdate") CENatalidad pCENatalidad) {
		String lArchivoRealJsp="jspNatalidad";
		oCMNatalidad.updateNatalidad(pCENatalidad);
		oListaFinal = new LinkedHashSet<CENatalidad>();		
		oListaFinal = oCMNatalidad.consultAllRetiros();		
		Map<String, Object> myModel = new HashMap<String,Object>();
		myModel.put("listNatalidad", oListaFinal);
		log.info("Update en controller" + pCENatalidad);
		return new ModelAndView(lArchivoRealJsp,"model",myModel);
	}
	
	/*@RequestMapping(value = "eliminarNatalidad.lhs", method=RequestMethod.GET)
	public ModelAndView deleteNatalidad(@PathVariable("CUIA") int CUIA) {
		String lArchivoRealJsp="jspNatalidad";
		oCMNatalidad.deleteNatalidad(CUIA);
		oListaFinal = new LinkedHashSet<>();		
		oListaFinal = oCMNatalidad.consultAllRetiros();		
		Map<String, Object> myModel = new HashMap<String,Object>();
		myModel.put("listNatalidad", oListaFinal);
		return new ModelAndView(lArchivoRealJsp,"model",myModel);
	}*/
	@RequestMapping(value = "eliminarNatalidad.lhs/{CUIA}.lhs", method=RequestMethod.GET)
	public ModelAndView deleteNatalidad(@PathVariable int CUIA, CENatalidad pCeNatalidad) {
		String lArchivoRealJsp="jspNatalidad";
		oCMNatalidad.deleteNatalidad(CUIA);
		oListaFinal = new LinkedHashSet<CENatalidad>();		
		oListaFinal = oCMNatalidad.consultAllRetiros();		
		Map<String, Object> myModel = new HashMap<String,Object>();
		myModel.put("listNatalidad", oListaFinal);
		return new ModelAndView(lArchivoRealJsp,"model",myModel);
	}
	
	//START => REGISTRO DE PRODUCCION DE LECHE
	
	
	@Autowired
	private CMLecheProducidaDia oCMLecheProducidaDia;
	
	@RequestMapping(value = "ListadoNatalidad.lhs")
	public ModelAndView linkedHashSetConsultaProducionLeche() {
		String lArchivoRealJsp="jspNatalidad";
		String lFechaSistema=(new Date().toString());		
		oListaFinal = new LinkedHashSet<CENatalidad>();	
		oListaFinal = oCMNatalidad.consultAllRetiros();		
		Map<String, Object> myModel = new HashMap<String,Object>();
		myModel.put("now", lFechaSistema);
		myModel.put("listNatalidad", oListaFinal);
		return new ModelAndView(lArchivoRealJsp,"model",myModel);
	}
	
	@RequestMapping(value="agregarNatalidad.lhs", method=RequestMethod.GET)
	public ModelAndView addProduccionLeche() {
		ModelAndView model = new ModelAndView();
		CENatalidad pCENatalidad = new CENatalidad();
		model.addObject("natalidadForm", pCENatalidad);
		model.setViewName("natalidadForm");
		return model;
	}
	
	@RequestMapping(value="save.lhs", method=RequestMethod.POST)
	public ModelAndView saveProduccionLeche(@ModelAttribute("natalidadForm") CENatalidad pCENatalidad) {
		String lArchivoRealJsp="jspNatalidad";
		oCMNatalidad.saveNatalidad(pCENatalidad);
		oListaFinal = new LinkedHashSet<CENatalidad>();		
		oListaFinal = oCMNatalidad.consultAllRetiros();		
		Map<String, Object> myModel = new HashMap<String,Object>();
		myModel.put("listNatalidad", oListaFinal);
		log.info("Registro en controller" + pCENatalidad);
		return new ModelAndView(lArchivoRealJsp,"model",myModel);
	}
	@RequestMapping(value="updateNatalidad.lhs/{CUIA}.lhs", method=RequestMethod.GET)
	public ModelAndView updateProduccionLeche(@PathVariable int CUIA,CENatalidad pCeNatalidad) {
		ModelAndView model = new ModelAndView();
		CENatalidad pCENatalidad = oCMNatalidad.consultByIdCUIA(CUIA);
		model.addObject("natalidadFormUpdate", pCENatalidad);
		model.setViewName("natalidadFormUpdate");
		return model;
	}
	
	@RequestMapping(value = "update.lhs", method=RequestMethod.POST)
	public ModelAndView updateProduccionLeche(@ModelAttribute("natalidadFormUpdate") CENatalidad pCENatalidad) {
		String lArchivoRealJsp="jspNatalidad";
		oCMNatalidad.updateNatalidad(pCENatalidad);
		oListaFinal = new LinkedHashSet<CENatalidad>();		
		oListaFinal = oCMNatalidad.consultAllRetiros();		
		Map<String, Object> myModel = new HashMap<String,Object>();
		myModel.put("listNatalidad", oListaFinal);
		log.info("Update en controller" + pCENatalidad);
		return new ModelAndView(lArchivoRealJsp,"model",myModel);
	}
	
	@RequestMapping(value = "eliminarNatalidad.lhs/{CUIA}.lhs", method=RequestMethod.GET)
	public ModelAndView deleteProduccionLeche(@PathVariable int CUIA, CENatalidad pCeNatalidad) {
		String lArchivoRealJsp="jspNatalidad";
		oCMNatalidad.deleteNatalidad(CUIA);
		oListaFinal = new LinkedHashSet<CENatalidad>();		
		oListaFinal = oCMNatalidad.consultAllRetiros();		
		Map<String, Object> myModel = new HashMap<String,Object>();
		myModel.put("listNatalidad", oListaFinal);
		return new ModelAndView(lArchivoRealJsp,"model",myModel);
	}
	
	
	//END <= REGISTRO DE PRODUCCION DE LECHE
	
	
	
	
	
	
	
	
	
	
	
	
}
