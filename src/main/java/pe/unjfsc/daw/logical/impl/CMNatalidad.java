package pe.unjfsc.daw.logical.impl;

import java.util.Iterator;
import java.util.LinkedHashSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import pe.unjfsc.daw.entity.CENatalidad;
import pe.unjfsc.daw.logical.CINatalidad;

@Component
public class CMNatalidad implements CINatalidad {
	private static final Logger log = LoggerFactory.getLogger("CMNatalidad");
	
	private LinkedHashSet<CENatalidad> oListaFinal;
	private CENatalidad moCENatalidad;
	private CENatalidad oCENatalidadResponse;
	public CMNatalidad() {
		oListaFinal = new LinkedHashSet<CENatalidad>();
		
		oListaFinal.add(new CENatalidad(2001, "2018, 3, 7", 60, "Criollo", "Hembra", 1701, 1702, "N.O", 1));
		oListaFinal.add(new CENatalidad(2002, "2018, 3, 7", 60, "Criollo", "Hembra", 1701, 1702, "N.O", 1));
		oListaFinal.add(new CENatalidad(2003, "2018, 3, 7", 60, "Criollo", "Hembra", 1701, 1702, "N.O", 1));
		oListaFinal.add(new CENatalidad(2004, "2018, 3, 7", 60, "Criollo", "Hembra", 1701, 1702, "N.O", 1));
		oListaFinal.add(new CENatalidad(2005, "2018, 3, 7", 60, "Criollo", "Hembra", 1701, 1702, "N.O", 1));
		oListaFinal.add(new CENatalidad(2006, "2018, 3, 7", 60, "Criollo", "Hembra", 1701, 1702, "N.O", 1));
	}
	public void saveNatalidad(CENatalidad pCENatalidad) {
		log.info("GUARDANDO EN EL REGISTRO CON EL CUIA "+ pCENatalidad.getCUIA());
		oListaFinal.add(pCENatalidad);
		
	}
	public void updateNatalidad(CENatalidad pCENatalidad) {
		Iterator<CENatalidad> it = oListaFinal.iterator();
		
		while (it.hasNext()) {
			moCENatalidad = it.next();
			if (moCENatalidad.getCUIA() == pCENatalidad.getCUIA()) {
				log.info("ACTUALIZANDO EL REGISTRO CON EL CUIA "+pCENatalidad.getCUIA()+"...");
				
				moCENatalidad.setCUIA(pCENatalidad.getCUIA());
				moCENatalidad.setFechNacimiento(pCENatalidad.getFechNacimiento());
				moCENatalidad.setPeso(pCENatalidad.getPeso());
				moCENatalidad.setGenotipo(pCENatalidad.getGenotipo());
				moCENatalidad.setSexo(pCENatalidad.getSexo());
				moCENatalidad.setCUIAmadre(pCENatalidad.getCUIAmadre());
				moCENatalidad.setCUIApadre(pCENatalidad.getCUIApadre());
				moCENatalidad.setObservacion(pCENatalidad.getObservacion());
				moCENatalidad.setEstado(pCENatalidad.getEstado());
			}
			log.info("Registro Actualizado"+moCENatalidad);
		}
		
	}
	public void deleteNatalidad(int pCUIA) {
		Iterator<CENatalidad> it = oListaFinal.iterator();
		
		while (it.hasNext()) {
			moCENatalidad = it.next();
			if (moCENatalidad.getCUIA() == pCUIA) {
				oListaFinal.remove(moCENatalidad);
				break;
			}
			
		}
		
	}
	public LinkedHashSet<CENatalidad> consultAllRetiros() {
		return oListaFinal;
	}
	public CENatalidad consultByIdCUIA(int pCUIA) {
		log.info("MOSTRANDO EL REGISTRO CON EL CUIA "+pCUIA+"...");
		Iterator<CENatalidad> it = oListaFinal.iterator();
		while (it.hasNext()){
			moCENatalidad = it.next();
			if (moCENatalidad.getCUIA() == pCUIA) {
				oCENatalidadResponse = moCENatalidad;
				log.info("REGISTRO CON EL CUIA "+oCENatalidadResponse);
				break;
			}
			
		}
		return oCENatalidadResponse;
	}
	public void setoCENatalidadResponse(CENatalidad oCENatalidadResponse) {
		this.oCENatalidadResponse = oCENatalidadResponse;
	}

}
