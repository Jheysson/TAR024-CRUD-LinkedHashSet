package pe.unjfsc.daw.logical;

import java.util.LinkedHashSet;

import pe.unjfsc.daw.entity.CELecheProducidaDia;


public interface CILecheProducidaDia {

	public void saveLecheProducidaDia(CELecheProducidaDia pCELecheProducidaDia);
	public void updateLecheProducidaDia(CELecheProducidaDia pCELecheProducidaDia);
	public void deleteLecheProducidaDia(int id);
	
	public LinkedHashSet<CELecheProducidaDia> consultaAll();
	public CELecheProducidaDia consultarById(int id);
	
}
