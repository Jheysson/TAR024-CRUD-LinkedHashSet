package pe.unjfsc.daw.logical.impl;

import java.util.Iterator;
import java.util.LinkedHashSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import pe.unjfsc.daw.entity.CELecheProducidaDia;
import pe.unjfsc.daw.logical.CILecheProducidaDia;

@Component
public class CMLecheProducidaDia implements CILecheProducidaDia {

	private static final Logger log = LoggerFactory.getLogger("CMLecheProducidaDia");
	private CELecheProducidaDia moCELecheProducidaDia;
	private CELecheProducidaDia oCELecheProducidaDiaRequest;
	private CELecheProducidaDia oCELecheProducidaDiaResponse;

	private LinkedHashSet<CELecheProducidaDia> moHashCELecheProducidaDia;

	public CMLecheProducidaDia() {
		moHashCELecheProducidaDia = new LinkedHashSet<CELecheProducidaDia>();
		moHashCELecheProducidaDia.add(new CELecheProducidaDia(1, 20.5, "3/10/2020", 4012));
		moHashCELecheProducidaDia.add(new CELecheProducidaDia(2, 21.5, "4/10/2020", 4013));
		moHashCELecheProducidaDia.add(new CELecheProducidaDia(3, 22.5, "5/10/2020", 4014));
		
	}

	@Override
	public void saveLecheProducidaDia(CELecheProducidaDia pCELecheProducidaDia) {
		log.info("GUARDANDO EL REGISTRO CON EL ID " + pCELecheProducidaDia.getIdLechProd() + "...");
		moHashCELecheProducidaDia.add(pCELecheProducidaDia);

	}

	@Override
	public void updateLecheProducidaDia(CELecheProducidaDia pCELecheProducidaDia) {
		log.info("ACTUALIZANDO EL REGISTRO CON EL ID " + pCELecheProducidaDia.getIdLechProd() + "...");
		Iterator<CELecheProducidaDia> it = moHashCELecheProducidaDia.iterator();
		while (it.hasNext()) {
			moCELecheProducidaDia = it.next();
			if (moCELecheProducidaDia.getIdLechProd() == pCELecheProducidaDia.getIdLechProd()) {
				moCELecheProducidaDia.setIdLechProd(pCELecheProducidaDia.getIdLechProd());
				moCELecheProducidaDia.setCantLitrLechProd(pCELecheProducidaDia.getCantLitrLechProd());
				moCELecheProducidaDia.setFechLechProd(pCELecheProducidaDia.getFechLechProd());
				moCELecheProducidaDia.setVacaProducion(pCELecheProducidaDia.getVacaProducion());
			}
		}

	}

	
	@Override
	public void deleteLecheProducidaDia(int id) {
		log.info("ELIMINANDO EL REGISTRO CON EL ID " + id + "...");
		Iterator<CELecheProducidaDia> it = moHashCELecheProducidaDia.iterator();
		while (it.hasNext()) {
			moCELecheProducidaDia = it.next();
			if (moCELecheProducidaDia.getIdLechProd() == id) {
				moHashCELecheProducidaDia.remove(moCELecheProducidaDia);
				break;
			}
		}

	}

	@Override
	public LinkedHashSet<CELecheProducidaDia> consultaAll() {
		log.info("MOSTRANDO REGISTROS EXISTENTES");
		return moHashCELecheProducidaDia;
	}

	@Override
	public CELecheProducidaDia consultarById(int id) {
		log.info("MOSTRANDO EL REGISTRO " + id + "......");
		Iterator<CELecheProducidaDia> it = moHashCELecheProducidaDia.iterator();
		while (it.hasNext()) {
			moCELecheProducidaDia = it.next();
			if (moCELecheProducidaDia.getIdLechProd() == id) {
				oCELecheProducidaDiaResponse = moCELecheProducidaDia;
				break;
			}
		}
		return oCELecheProducidaDiaResponse;
	}

	public void setoCELecheProducidaDiaRequest(CELecheProducidaDia oCELecheProducidaDiaRequest) {
		this.oCELecheProducidaDiaRequest = oCELecheProducidaDiaRequest;
	}

	public void setoCELecheProducidaDiaResponse(CELecheProducidaDia oCELecheProducidaDiaResponse) {
		this.oCELecheProducidaDiaResponse = oCELecheProducidaDiaResponse;
	}
}
