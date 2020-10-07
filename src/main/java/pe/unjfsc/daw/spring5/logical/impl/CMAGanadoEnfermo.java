package pe.unjfsc.daw.spring5.logical.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CEGanadoEnfermo;
import pe.unjfsc.daw.spring5.logical.CAGanadoEnfermo;

public class CMAGanadoEnfermo extends CAGanadoEnfermo {
	private static final Logger Log = LoggerFactory.getLogger("CMGanadoVacuno");
	
	private CEGanadoEnfermo moCEGanadoEnfermo;
	private ArrayList<CEGanadoEnfermo> arrayCEGanadoEnfermo;
	private CEGanadoEnfermo oCEGanadoEnfermoRequest;
	private CEGanadoEnfermo oCEGanadoEnfermoResponse;
	public CMAGanadoEnfermo() {
		arrayCEGanadoEnfermo = new ArrayList<CEGanadoEnfermo> ();
		
		arrayCEGanadoEnfermo.add (new CEGanadoEnfermo(2001,"Mastitis",LocalDate.of(2020, 9, 25), "Mejora en proceso lento", 1));
		arrayCEGanadoEnfermo.add (new CEGanadoEnfermo(2002,"Hemolactea",LocalDate.of(2020, 9, 20), "Cuidad intensivo", 1));
		
	}
	
	
	@Override
	public void saveGanadoEnfermo(CEGanadoEnfermo pCEGanadoEnfermo) {
		Log.info("GUARDANDO EL REGISTRO CON EL CUIA"+ pCEGanadoEnfermo.getCUIA()+"...");
		arrayCEGanadoEnfermo.add(pCEGanadoEnfermo);
		
	}

	@Override
	public void updateGanadoEnfermo(CEGanadoEnfermo pCEGanadoEnfermo) {
		
		Iterator<CEGanadoEnfermo> it = arrayCEGanadoEnfermo.iterator();
		while (it.hasNext()) {
			moCEGanadoEnfermo = it.next();
			
			if(moCEGanadoEnfermo.getCUIA() == pCEGanadoEnfermo.getCUIA()) {
				Log.info("ACTUALIZANDO EL REGISTRO CON EL CUIA"+ pCEGanadoEnfermo.getCUIA()+"..." );
				moCEGanadoEnfermo.setCUIA(pCEGanadoEnfermo.getCUIA());
				moCEGanadoEnfermo.setEnfermedad(pCEGanadoEnfermo.getEnfermedad());
				moCEGanadoEnfermo.setFechIngreso(pCEGanadoEnfermo.getFechIngreso());
				moCEGanadoEnfermo.setObservacion(pCEGanadoEnfermo.getObservacion());
				moCEGanadoEnfermo.setEstado(pCEGanadoEnfermo.getEstado());
			}
			
			
		}
		
	}

	@Override
	public void deleteGanadoEnfermo(int CUIA) {
		Log.info("ELIMINANDO EL REGISTRO CON EL CUIA"+CUIA+"...");
		Iterator<CEGanadoEnfermo> it = arrayCEGanadoEnfermo.iterator();
		while(it.hasNext()) {
			moCEGanadoEnfermo = it.next();
			if(moCEGanadoEnfermo.getCUIA() == CUIA) {
				arrayCEGanadoEnfermo.remove(moCEGanadoEnfermo);
				break;
			}
		}
		
	}

	@Override
	public ArrayList<CEGanadoEnfermo> consultaAll() {
		Log.info("MOSTRANDO REGISTROS EXISTENTES");
		return arrayCEGanadoEnfermo;
	}
	@Override
	public CEGanadoEnfermo consultarByCuia(int CUIA) {
		Log.info("MOSTRANDO EL REGISTRO"+ CUIA + "...");
		Iterator<CEGanadoEnfermo> it = arrayCEGanadoEnfermo.iterator();
		while(it.hasNext()) {
			moCEGanadoEnfermo = it.next();
			if(moCEGanadoEnfermo.getCUIA() == CUIA) {
				oCEGanadoEnfermoResponse = moCEGanadoEnfermo;
				break;
			}
		}
		
		return oCEGanadoEnfermoResponse;
	}
	public void setoCEGanadoEnfermoRequest (CEGanadoEnfermo oCECeGanadoEnfermoRequest) {
		this.oCEGanadoEnfermoRequest = oCECeGanadoEnfermoRequest;
	}
	public void setoCEGanadoEnfermoResponse (CEGanadoEnfermo oCEGanadoEnfermoResponse) {
		this.oCEGanadoEnfermoResponse = oCEGanadoEnfermoResponse;
	}
	}
