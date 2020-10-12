package pe.unjfsc.daw.logical.impl;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.entity.CEGanadoVacuno;
import pe.unjfsc.daw.logical.CIGanadoVacuno;

public class CMGanadoVacuno implements CIGanadoVacuno{
	
private static final Logger log = LoggerFactory.getLogger("CMGanadoVacuno");
	
	private CEGanadoVacuno moCEGanadoVacuno;
	private LinkedHashSet<CEGanadoVacuno> linkedHashSetGanadoVacuno;
	private CEGanadoVacuno oCEGanadoVacunoResponse;
	private CEGanadoVacuno oCEGanadoVacunoRequest;
	
	private String etapa = "";
	private LocalDate fechActual = LocalDate.now();

	public CMGanadoVacuno() {
		linkedHashSetGanadoVacuno = new LinkedHashSet<CEGanadoVacuno>();
		linkedHashSetGanadoVacuno.add(new CEGanadoVacuno(2001,"Maria", LocalDate.of(2017, 3, 7), "Hembra",
				2, "Adulto", 430.0, 1.4, "Producción", "Normal", "Heredord",
				"Leche", "Autoctono", 0, 0));
		linkedHashSetGanadoVacuno.add(new CEGanadoVacuno(2002, "Juana", LocalDate.of(2017, 3, 5), "Hembra",
				2, "Adulto", 450.0, 1.5, "Producción", "Normal", "Hereford", 
				"Leche", "Comprado", 0, 0));
	} 
	
	public void saveGanadoVacuno(CEGanadoVacuno poCEGanadoVacuno) {
		boolean madreApta = buscarMadre(poCEGanadoVacuno);
		boolean verifExistente = verificarExiste(poCEGanadoVacuno);
		if (madreApta && verifExistente) {
			oCEGanadoVacunoRequest.setCuia(poCEGanadoVacuno.getCuia());
			oCEGanadoVacunoRequest.setAliasGanadoVacuno(poCEGanadoVacuno.getAliasGanadoVacuno());
			oCEGanadoVacunoRequest.setCuiaMadre(poCEGanadoVacuno.getCuiaMadre());
			oCEGanadoVacunoRequest.setCuiaPadre(poCEGanadoVacuno.getCuiaPadre());
			oCEGanadoVacunoRequest.setEdad(calcularEdad(poCEGanadoVacuno.getFecha_nacimiento()));
			oCEGanadoVacunoRequest.setEstaActivo(poCEGanadoVacuno.getEstaActivo());
			oCEGanadoVacunoRequest.setEstaAnim(poCEGanadoVacuno.getEstaAnim());
			oCEGanadoVacunoRequest.setFecha_nacimiento(poCEGanadoVacuno.getFecha_nacimiento());
			oCEGanadoVacunoRequest.setEtapa(asignarEtapa(calcularEdad(poCEGanadoVacuno.getFecha_nacimiento())));
			oCEGanadoVacunoRequest.setGenotipo(poCEGanadoVacuno.getGenotipo());
			oCEGanadoVacunoRequest.setOrigen(poCEGanadoVacuno.getOrigen());
			moCEGanadoVacuno.setPeso(poCEGanadoVacuno.getPeso());
			moCEGanadoVacuno.setSexo(poCEGanadoVacuno.getSexo());
			moCEGanadoVacuno.setTalla(poCEGanadoVacuno.getTalla());
			moCEGanadoVacuno.setTipoGana(poCEGanadoVacuno.getTipoGana());
			linkedHashSetGanadoVacuno.add(oCEGanadoVacunoRequest);
			log.info("GUARDANDO REGISTRO CON EL CUIA "+poCEGanadoVacuno.getCuia());
		}else {
			log.info("NO SE PUDO REGISTRAR");
		}
		
	}

	public void updateGanadoVacuno(CEGanadoVacuno poCEGanadoVacuno) {
Iterator<CEGanadoVacuno> it = linkedHashSetGanadoVacuno.iterator();
		
		while(it.hasNext()) {
			moCEGanadoVacuno = it.next();
			if (moCEGanadoVacuno.getCuia() == poCEGanadoVacuno.getCuia()) {
				log.info("ACTUALIZANDO EL REGISTRO CON EL CUIA "+poCEGanadoVacuno.getCuia()+"...");
				
				moCEGanadoVacuno.setAliasGanadoVacuno(poCEGanadoVacuno.getAliasGanadoVacuno());
				moCEGanadoVacuno.setCuiaMadre(poCEGanadoVacuno.getCuiaMadre());
				moCEGanadoVacuno.setCuiaPadre(poCEGanadoVacuno.getCuiaPadre());
				moCEGanadoVacuno.setEdad(calcularEdad(poCEGanadoVacuno.getFecha_nacimiento()));
				moCEGanadoVacuno.setEstaActivo(poCEGanadoVacuno.getEstaActivo());
				moCEGanadoVacuno.setEstaAnim(poCEGanadoVacuno.getEstaAnim());
				moCEGanadoVacuno.setFecha_nacimiento(poCEGanadoVacuno.getFecha_nacimiento());
				moCEGanadoVacuno.setEtapa(asignarEtapa(calcularEdad(poCEGanadoVacuno.getFecha_nacimiento())));
				moCEGanadoVacuno.setGenotipo(poCEGanadoVacuno.getGenotipo());
				moCEGanadoVacuno.setOrigen(poCEGanadoVacuno.getOrigen());
				
				
			}
		}
		log.info("Verificar actualización: {}",consultaAll());
		
	}

	public void deleteGanadoVacuno(int CUIA) {
		Iterator<CEGanadoVacuno> it = linkedHashSetGanadoVacuno.iterator();
		
		while(it.hasNext()) {
			moCEGanadoVacuno = it.next();
			
			if (moCEGanadoVacuno.getCuia() == CUIA) {
				linkedHashSetGanadoVacuno.remove(moCEGanadoVacuno);
				break;
			}
		}
		
	}

	public LinkedHashSet<CEGanadoVacuno> consultaAll() {
		return linkedHashSetGanadoVacuno;
	}

	public CEGanadoVacuno showByCUIA(int CUIA) {
		log.info("BUSCANDO REGISTRO CON EL CUIA "+CUIA+":");
		Iterator<CEGanadoVacuno> it = linkedHashSetGanadoVacuno.iterator();
		
		while(it.hasNext()) {
			moCEGanadoVacuno = it.next();
			if (moCEGanadoVacuno.getCuia() == CUIA) {
				oCEGanadoVacunoResponse = moCEGanadoVacuno;
				break;
			}
		}
		log.info("{}",oCEGanadoVacunoResponse);
		return oCEGanadoVacunoResponse;
	}
	protected int calcularEdad(LocalDate fechaNaci) {		
		int edad = (int) ChronoUnit.MONTHS.between(fechaNaci, fechActual);
		return edad;
	}
	protected String asignarEtapa(int edad) {
					
		if(edad <= 4) {
			etapa = "Ternero(a)";
		}else if(edad > 4 && edad <=12) {
			etapa = "Destete";
		}else if(edad > 12 && edad <=24) {
			etapa = "Becerro(a)";
		}else if(edad >= 24) {
			etapa = "Adulto";
		}
		return etapa;
		
	}protected boolean buscarMadre(CEGanadoVacuno oCEGanadoVacuno) {
		boolean rpta = false;
		log.info("VERIFICANDO EL CUIA DE MADRE "+oCEGanadoVacuno.getCuiaMadre()+" EN LOS REGISTROS");
		if (oCEGanadoVacuno.getCuiaMadre() !=0) {
			Iterator<CEGanadoVacuno> it = linkedHashSetGanadoVacuno.iterator();
			while(it.hasNext()) {
				moCEGanadoVacuno = it.next();

					if (moCEGanadoVacuno.getCuia() == oCEGanadoVacuno.getCuiaMadre()) {
						log.info("SE ENCONTRÓ EL CUIA INGRESADO DE LA MADRE EN LOS REGISTROS ACTUALES");
						if (moCEGanadoVacuno.getSexo().equals("Hembra") && moCEGanadoVacuno.getEdad()>18) {
							log.info("SE VALIDÓ COMO HEMBRA APTA");
							rpta = true;
							break;
						}else {
							log.info("EL CUIA DE LA MADRE INGRESADO ES DE UNA BOVINA NO APTA PARA SER MADRE");
							rpta = false;
							break;
						}
					}else {
						//No se encuentra el registro de la madre
						rpta = false;
					}
				
			}
		}else {
			rpta = true;
		}
		
		return rpta;
		
	}protected boolean verificarExiste(CEGanadoVacuno oCEGanadoVacuno) {
		boolean rpta = false;
		
		Iterator<CEGanadoVacuno> it = linkedHashSetGanadoVacuno.iterator();
		
		while(it.hasNext()) {
			moCEGanadoVacuno = it.next();

				if (moCEGanadoVacuno.getCuia() == oCEGanadoVacuno.getCuia()) {
					log.info("EL CUIA QUE SE INTENTA REGISTRAR YA EXISTE");
					rpta = false;
					break;
				}else {
					rpta = true;
				}
			
		}
		return rpta;
	}
	
	
	public void setoCEGanadoVacunoResponse(CEGanadoVacuno oCEGanadoVacunoResponse) {
		this.oCEGanadoVacunoResponse = oCEGanadoVacunoResponse;
	}
	public void setoCEGanadoVacunoRequest(CEGanadoVacuno oCEGanadoVacunoRequest) {
		this.oCEGanadoVacunoRequest = oCEGanadoVacunoRequest;
	}

}
