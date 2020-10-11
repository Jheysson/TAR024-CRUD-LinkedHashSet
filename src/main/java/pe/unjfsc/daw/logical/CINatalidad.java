package pe.unjfsc.daw.logical;

import java.util.LinkedHashSet;

import pe.unjfsc.daw.entity.CENatalidad;

public interface CINatalidad {
	
	public void saveNatalidad(CENatalidad pCENatalidad);
	public void updateNatalidad(CENatalidad pCENatalidad);
	public void deleteNatalidad(int pCUIA);	
	public LinkedHashSet<CENatalidad> consultAllRetiros();
	public CENatalidad consultByIdCUIA(int pCUIA);
}
