package pe.unjfsc.daw.spring5.logical.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CELecheProducidaDia;
import pe.unjfsc.daw.spring5.logical.CILecheProducidaDia;

public class CMILecheProducidaDia implements CILecheProducidaDia  {

	private static final Logger log = LoggerFactory.getLogger("CMALecheProducidaDia");
	
	private CELecheProducidaDia moCELecheProducidaDia;
	private ArrayList<CELecheProducidaDia> arrayLecheProducidaDia;
	private CELecheProducidaDia oCELecheProducidaDiaRequest;
	private CELecheProducidaDia oCELecheProducidaDiaResponse;

	public CMILecheProducidaDia() {
		arrayLecheProducidaDia = new ArrayList<CELecheProducidaDia>();
		arrayLecheProducidaDia.add(new CELecheProducidaDia(1, 20.5, "3/10/2020", 4012));
		arrayLecheProducidaDia.add(new CELecheProducidaDia(2, 21.5, "4/10/2020", 4013));
		arrayLecheProducidaDia.add(new CELecheProducidaDia(3, 22.5, "5/10/2020", 4014));
		arrayLecheProducidaDia.add(new CELecheProducidaDia(4, 23.5, "6/10/2020", 4015));
		arrayLecheProducidaDia.add(new CELecheProducidaDia(5, 24.5, "7/10/2020", 4016));
		arrayLecheProducidaDia.add(new CELecheProducidaDia(6, 25.5, "8/10/2020", 4017));
		arrayLecheProducidaDia.add(new CELecheProducidaDia(7, 26.5, "9/10/2020", 4018));

	}
	
	@Override
	public void saveLecheProducidaDia(CELecheProducidaDia pCELecheProducidaDia) {
		log.info("GUARDANDO EL REGISTRO CON EL ID " + pCELecheProducidaDia.getIdLechProd() + "...");
		arrayLecheProducidaDia.add(pCELecheProducidaDia);

		
	}

	@Override
	public void updateLecheProducidaDia(CELecheProducidaDia pCELecheProducidaDia) {
		log.info("ACTUALIZANDO EL REGISTRO CON EL ID " + pCELecheProducidaDia.getIdLechProd() + "...");
		Iterator<CELecheProducidaDia> it = arrayLecheProducidaDia.iterator();
		while (it.hasNext()) {
			moCELecheProducidaDia = it.next();
			if (moCELecheProducidaDia.getIdLechProd() == pCELecheProducidaDia.getIdLechProd()) {
				moCELecheProducidaDia.setIdLechProd(pCELecheProducidaDia.getIdLechProd());
				;
				moCELecheProducidaDia.setCantLitrLechProd(pCELecheProducidaDia.getCantLitrLechProd());
				moCELecheProducidaDia.setFechLechProd(pCELecheProducidaDia.getFechLechProd());
				moCELecheProducidaDia.setVacaProducion(pCELecheProducidaDia.getVacaProducion());
			}
		}
	}

	@Override
	public void deleteLecheProducidaDia(int id) {
		log.info("ELIMINANDO EL REGISTRO CON EL ID " + id + "...");
		Iterator<CELecheProducidaDia> it = arrayLecheProducidaDia.iterator();
		while (it.hasNext()) {
			// moCENatalidad = new CENatalidad();
			moCELecheProducidaDia = it.next();
			if (moCELecheProducidaDia.getIdLechProd() == id) {
				arrayLecheProducidaDia.remove(moCELecheProducidaDia);
				break;
			}
		}
	}

	@Override
	public ArrayList<CELecheProducidaDia> consultaAll(){ 
		log.info("MOSTRANDO REGISTROS EXISTENTES");
		return arrayLecheProducidaDia;
	}

	@Override
	public CELecheProducidaDia consultarById(int id) {
		log.info("MOSTRANDO EL REGISTRO " + id + "......");

		// CENatalidad moCENatalidadResult = new CENatalidad();

		Iterator<CELecheProducidaDia> it = arrayLecheProducidaDia.iterator();
		while (it.hasNext()) {
			// moCENatalidad = new CENatalidad();
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
