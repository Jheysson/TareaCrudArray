package pe.unjfsc.daw.spring5.logical.impl;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
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
	
	String Etapa = "";
	
	LocalDate fechaNac = LocalDate.of(2016, 3, 7);
	LocalDate ahora = LocalDate.now();
	
	public CMGanadoVacuno() {
		arrayGanadoVacuno = new ArrayList<CEGanadoVacuno>();
		arrayGanadoVacuno.add(new CEGanadoVacuno(2001, "Kent", "Macho", fechaNac, calcularEdad(fechaNac), asignarEtapa(calcularEdad(fechaNac))));
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
	
	
	protected int calcularEdad(LocalDate fechaNaci) {		
		int edad = (int) ChronoUnit.MONTHS.between(fechaNaci, ahora);
		return edad;
	}
	protected String asignarEtapa(int edad) {
					
		if(edad <= 4) {
			Etapa = "Ternero";
		}else if(edad > 4 && edad <=12) {
			Etapa = "Destete";
		}else if(edad > 12 && edad <=24) {
			Etapa = "Becerro";
		}else if(edad >= 24) {
			Etapa = "Adulto";
		}
		return Etapa;
	}	
	
	public void setoCEGanadoVacunoResponse(CEGanadoVacuno oCEGanadoVacunoResponse) {
		this.oCEGanadoVacunoResponse = oCEGanadoVacunoResponse;
	}

}
