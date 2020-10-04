package pe.unjfsc.daw.spring5.logical.impl;

import java.util.ArrayList;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CEGanadoVacuno;
import pe.unjfsc.daw.spring5.logical.CAGanadoVacuno;

public class CMGanadoVacuno extends CAGanadoVacuno {

	private static final Logger log = LoggerFactory.getLogger("CAGanadoVacuno");
	
	private CEGanadoVacuno moCEGanadoVacuno;
	private ArrayList<CEGanadoVacuno> arrayGanadoVacuno;
	private CEGanadoVacuno oCEGanadoVacunoResponse;
	
	public CMGanadoVacuno() {
		arrayGanadoVacuno = new ArrayList<CEGanadoVacuno>();
		arrayGanadoVacuno.add(new CEGanadoVacuno(2001, "Maria", "Hembra"));
		arrayGanadoVacuno.add(new CEGanadoVacuno(2002, "José", "Macho"));
		arrayGanadoVacuno.add(new CEGanadoVacuno(2003, "Alixon", "Hembra"));
		arrayGanadoVacuno.add(new CEGanadoVacuno(2004, "Alicia", "Hembra"));
	}
	
	@Override
	public void saveGanadoVacuno(CEGanadoVacuno poCEGanadoGacuno) {
		log.info("GUARDANDO EN EL REGISTRO CON EL CUIA "+poCEGanadoGacuno.getCuia());
		//Salvar
		arrayGanadoVacuno.add(poCEGanadoGacuno);
	}

	@Override
	public void updateGanadoVacuno(CEGanadoVacuno poCEGanadoVacuno) {
		
		Iterator<CEGanadoVacuno> it = arrayGanadoVacuno.iterator();
		
		while (it.hasNext()) {
			moCEGanadoVacuno = it.next();
			if (moCEGanadoVacuno.getCuia() == poCEGanadoVacuno.getCuia()) {
				log.info("ACTUALIZANDO EL REGISTRO CON EL CUIA "+poCEGanadoVacuno.getCuia()+"...");
				
				moCEGanadoVacuno.setCuia(poCEGanadoVacuno.getCuia());
				moCEGanadoVacuno.setAliasGanadoVacuno(poCEGanadoVacuno.getAliasGanadoVacuno());
				moCEGanadoVacuno.setSexo(poCEGanadoVacuno.getSexo());
			}
			
		}
	}

	@Override
	public void deleteGanadoVacuno(int CUIA) {
		
		Iterator<CEGanadoVacuno> it = arrayGanadoVacuno.iterator();
		
		while (it.hasNext()) {
			moCEGanadoVacuno = it.next();
			if (moCEGanadoVacuno.getCuia() == CUIA) {
				arrayGanadoVacuno.remove(moCEGanadoVacuno);
				break;
			}
			
		}
	}

	@Override
	public ArrayList<CEGanadoVacuno> showAll() {
		log.info("MOSTRANDO REGISTROS EXISTENTES...");
		return arrayGanadoVacuno;
	}

	@Override
	public CEGanadoVacuno showByCUIA(int CUIA) {
		log.info("MOSTRANDO EL REGISTRO CON EL CUIA "+CUIA+"...");
		Iterator<CEGanadoVacuno> it = arrayGanadoVacuno.iterator();
		while (it.hasNext()){
			moCEGanadoVacuno = it.next();
			if (moCEGanadoVacuno.getCuia() == CUIA) {
				oCEGanadoVacunoResponse = moCEGanadoVacuno;
				break;
			}
			
		}
		return oCEGanadoVacunoResponse;
	}

	public void setoCEGanadoVacunoResponse(CEGanadoVacuno oCEGanadoVacunoResponse) {
		this.oCEGanadoVacunoResponse = oCEGanadoVacunoResponse;
	}

	
}
