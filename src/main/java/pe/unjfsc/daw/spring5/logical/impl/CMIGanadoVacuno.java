package pe.unjfsc.daw.spring5.logical.impl;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CEGanadoVacuno;
import pe.unjfsc.daw.spring5.logical.CIGanadoVacuno;

public class CMIGanadoVacuno implements CIGanadoVacuno{
	
private static final Logger log = LoggerFactory.getLogger("CMGanadoVacuno");
	
	private CEGanadoVacuno moCEGanadoVacuno;
	private ArrayList<CEGanadoVacuno> arrayGanadoVacuno;
	private CEGanadoVacuno oCEGanadoVacunoResponse;
	private CEGanadoVacuno oCEGanadoVacunoRequest;
	
	private String etapa = "";
	private LocalDate fechActual = LocalDate.now();
	
	
	public CMIGanadoVacuno() {
		arrayGanadoVacuno = new ArrayList<CEGanadoVacuno>();
		arrayGanadoVacuno.add(new CEGanadoVacuno(2001,"Maria", LocalDate.of(2017, 3, 7), "Hembra", 2, "Adulto", 430.0, 1.4, "Producción", "Normal", "Heredord", "Leche", "Autoctono", 0, 0));
		arrayGanadoVacuno.add(new CEGanadoVacuno(2002, "Juana", LocalDate.of(2017, 3, 5), "Hembra", 2, "Adulto", 450.0, 1.5, "Producción", "Normal", "Hereford", "Leche", "Comprado", 0, 0));
	}

	@Override
	public void saveGanadoVacuno(CEGanadoVacuno poCEGanadoGacuno) {
		log.info("GUARDANDO REGISTRO CON EL CUIA "+poCEGanadoGacuno.getCuia());
		oCEGanadoVacunoRequest.setCuia(poCEGanadoGacuno.getCuia());
		oCEGanadoVacunoRequest.setAliasGanadoVacuno(poCEGanadoGacuno.getAliasGanadoVacuno());
		oCEGanadoVacunoRequest.setCuiaMadre(poCEGanadoGacuno.getCuiaMadre());
		oCEGanadoVacunoRequest.setCuiaPadre(poCEGanadoGacuno.getCuiaPadre());
		oCEGanadoVacunoRequest.setEdad(calcularEdad(poCEGanadoGacuno.getFecha_nacimiento()));
		oCEGanadoVacunoRequest.setEstaActivo(poCEGanadoGacuno.getEstaActivo());
		oCEGanadoVacunoRequest.setEstaAnim(poCEGanadoGacuno.getEstaAnim());
		oCEGanadoVacunoRequest.setFecha_nacimiento(poCEGanadoGacuno.getFecha_nacimiento());
		oCEGanadoVacunoRequest.setEtapa(asignarEtapa(calcularEdad(poCEGanadoGacuno.getFecha_nacimiento())));
		oCEGanadoVacunoRequest.setGenotipo(poCEGanadoGacuno.getGenotipo());
		oCEGanadoVacunoRequest.setOrigen(poCEGanadoGacuno.getOrigen());
		arrayGanadoVacuno.add(oCEGanadoVacunoRequest);
		
	}

	@Override
	public void updateGanadoVacuno(CEGanadoVacuno poCEGanadoVacuno) {
		Iterator<CEGanadoVacuno> it = arrayGanadoVacuno.iterator();

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
		log.info("Verificar actualización: {}",showAll());
		
	}

	@Override
	public void deleteGanadoVacuno(int CUIA) {
		Iterator<CEGanadoVacuno> it = arrayGanadoVacuno.iterator();
		
		while(it.hasNext()) {
			moCEGanadoVacuno = it.next();
			
			if (moCEGanadoVacuno.getCuia() == CUIA) {
				arrayGanadoVacuno.remove(moCEGanadoVacuno);
				break;
			}
		}
		
	}

	@Override
	public ArrayList<CEGanadoVacuno> showAll() {
		return arrayGanadoVacuno;
	}

	@Override
	public CEGanadoVacuno showByCUIA(int CUIA) {
		log.info("BUSCANDO REGISTRO CON EL CUIA "+CUIA+":");
		Iterator<CEGanadoVacuno> it = arrayGanadoVacuno.iterator();
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
			etapa = "Ternero";
		}else if(edad > 4 && edad <=12) {
			etapa = "Destete";
		}else if(edad > 12 && edad <=24) {
			etapa = "Becerro";
		}else if(edad >= 24) {
			etapa = "Adulto";
		}
		return etapa;
	}

	public void setoCEGanadoVacunoResponse(CEGanadoVacuno oCEGanadoVacunoResponse) {
		this.oCEGanadoVacunoResponse = oCEGanadoVacunoResponse;
	}

	public void setoCEGanadoVacunoRequest(CEGanadoVacuno oCEGanadoVacunoRequest) {
		this.oCEGanadoVacunoRequest = oCEGanadoVacunoRequest;
	}
	
	

}
