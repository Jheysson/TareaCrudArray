package pe.unjfsc.daw.spring5.logical.impl;

import java.util.ArrayList;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CENatalidad;
import pe.unjfsc.daw.spring5.logical.CANatalidad;

public class CMNatalidad extends CANatalidad{
private static final Logger log = LoggerFactory.getLogger("CMGanadoVacuno");
	
	private CENatalidad moCENatalidad;
	private ArrayList<CENatalidad> arrayNatalidad;
	private CENatalidad oCENatalidadResponse;
	
	public CMNatalidad() {
		arrayNatalidad = new ArrayList<CENatalidad>();
		arrayNatalidad.add(new CENatalidad(2001, "Macho", "04/10/2020", "Criollo", 20.00, 2020, "N.O", 1));
		arrayNatalidad.add(new CENatalidad(2002, "Hembra", "04/10/2020", "Criollo", 20.00, 2020, "N.O", 1));
	}
	@Override
	public void saveNatalidad(CENatalidad poCENatalidad) {
		log.info("GUARDANDO EN EL REGISTRO CON EL CUIA "+ poCENatalidad.getCuia());
		//Salvar
		arrayNatalidad.add(poCENatalidad);
		
	}

	@Override
	public void updateNatalidad(CENatalidad poCENatalidad) {
		Iterator<CENatalidad> it = arrayNatalidad.iterator();
		
		while (it.hasNext()) {
			moCENatalidad = it.next();
			if (moCENatalidad.getCuia() == poCENatalidad.getCuia()) {
				log.info("ACTUALIZANDO EL REGISTRO CON EL CUIA "+poCENatalidad.getCuia()+"...");
				
				moCENatalidad.setCuia(poCENatalidad.getCuia());
				moCENatalidad.setSexo(poCENatalidad.getSexo());
				moCENatalidad.setFecha_nacimiento(poCENatalidad.getFecha_nacimiento());
				moCENatalidad.setGenotipo(poCENatalidad.getGenotipo());
				moCENatalidad.setPeso(poCENatalidad.getPeso());
				moCENatalidad.setCuiaGanado(poCENatalidad.getCuiaGanado());
				moCENatalidad.setObservacion(poCENatalidad.getObservacion());
				moCENatalidad.setEstado(poCENatalidad.getEstado());
			}
			
		}
		
	}

	@Override
	public void deleteNatalidad(int CUIA) {
		Iterator<CENatalidad> it = arrayNatalidad.iterator();
		
		while (it.hasNext()) {
			moCENatalidad = it.next();
			if (moCENatalidad.getCuia() == CUIA) {
				arrayNatalidad.remove(moCENatalidad);
				break;
			}
			
		}
		
	}

	@Override
	public ArrayList<CENatalidad> showAll() {
		log.info("MOSTRANDO REGISTROS EXISTENTES...");
		return arrayNatalidad;
	}

	@Override
	public CENatalidad showByCUIA(int CUIA) {
		log.info("MOSTRANDO EL REGISTRO CON EL CUIA "+CUIA+"...");
		Iterator<CENatalidad> it = arrayNatalidad.iterator();
		while (it.hasNext()){
			moCENatalidad = it.next();
			if (moCENatalidad.getCuia() == CUIA) {
				oCENatalidadResponse = moCENatalidad;
				break;
			}
			
		}
		return oCENatalidadResponse;
	}
	public void setoCENatalidadResponse(CENatalidad oCENatalidadResponse) {
		this.oCENatalidadResponse = oCENatalidadResponse;
	}

}
