package pe.unjfsc.daw.logical;

import java.util.LinkedHashSet;

import pe.unjfsc.daw.entity.CEGanadoVacuno;


public interface CIGanadoVacuno {
	public void saveGanadoVacuno(CEGanadoVacuno poCEGanadoVacuno);
	public void updateGanadoVacuno(CEGanadoVacuno poCEGanadoVacuno);
	public void deleteGanadoVacuno(int CUIA);
	public  LinkedHashSet<CEGanadoVacuno> consultaAll();
	public CEGanadoVacuno showByCUIA(int CUIA);
}
