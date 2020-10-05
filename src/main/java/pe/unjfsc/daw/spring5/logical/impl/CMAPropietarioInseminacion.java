package pe.unjfsc.daw.spring5.logical.impl;

import java.util.ArrayList;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.daw.spring5.entity.CEPropietarioInseminacion;
import pe.unjfsc.daw.spring5.logical.CAPropietarioInseminacion;

public class CMAPropietarioInseminacion extends CAPropietarioInseminacion{
	
private static final Logger log = LoggerFactory.getLogger("CMAPropietarioInseminacion");
	
	private CEPropietarioInseminacion moCEPropietarioInse;
	private ArrayList<CEPropietarioInseminacion> arrayPropietarioInseminacion;
	private CEPropietarioInseminacion oCEPropietarioInseResponse;
	
	public CMAPropietarioInseminacion() {
		arrayPropietarioInseminacion = new ArrayList<CEPropietarioInseminacion>();
		arrayPropietarioInseminacion.add(new CEPropietarioInseminacion(120, 620.00, 1.61, "Establo 1", 20.00, "30/09/2020", 1, "Hereford","N/O"));
		arrayPropietarioInseminacion.add(new CEPropietarioInseminacion(220, 600.00, 1.63, "Establo 2", 24.00, "02/10/2020", 1, "Charolais","N/O"));
		arrayPropietarioInseminacion.add(new CEPropietarioInseminacion(320, 618.00, 1.54, "Establo 3", 18.00, "03/10/2020", 1, "Brahman","N/O"));
		arrayPropietarioInseminacion.add(new CEPropietarioInseminacion(420, 578.00, 1.72, "Establo 4", 22.00, "04/10/2020", 1, "Lomousin","N/O"));
		arrayPropietarioInseminacion.add(new CEPropietarioInseminacion(520, 588.00, 1.68, "Establo 5", 25.00, "04/10/2020", 1, "Gyrolando","N/O"));
		}
	
	@Override
	public void savePropiInseminacion(CEPropietarioInseminacion poCEPropietarioInse) {
		log.info("GUARDANDO EN EL REGISTRO CON EL CODIGO "+poCEPropietarioInse.getcodigo());
		//Salvar
		arrayPropietarioInseminacion.add(poCEPropietarioInse);
	}

	@Override
	public void updatePropiInseminacion(CEPropietarioInseminacion poCEPropiInseminacion) {
		
		Iterator<CEPropietarioInseminacion> it = arrayPropietarioInseminacion.iterator();
		
		while (it.hasNext()) {
			moCEPropietarioInse = it.next();
			if (moCEPropietarioInse.getcodigo() == poCEPropiInseminacion.getcodigo()) {
				log.info("ACTUALIZANDO EL REGISTRO CON EL CODIGO "+poCEPropiInseminacion.getcodigo()+"...");
				
				moCEPropietarioInse.setcodigo(poCEPropiInseminacion.getcodigo());
				moCEPropietarioInse.setPeso(poCEPropiInseminacion.getPeso());
				moCEPropietarioInse.setTalla(poCEPropiInseminacion.getTalla());
				moCEPropietarioInse.setLugar(poCEPropiInseminacion.getLugar());
				moCEPropietarioInse.setPrecio(poCEPropiInseminacion.getPrecio());
				moCEPropietarioInse.setFechcompra(poCEPropiInseminacion.getFechcompra());
				moCEPropietarioInse.setEstado(poCEPropiInseminacion.getEstado());
				moCEPropietarioInse.setGenotipo(poCEPropiInseminacion.getGenotipo());
			}
			
		}
	}

	@Override
	public void deletePropiInseminacion(int codigo) {
		Iterator<CEPropietarioInseminacion> it = arrayPropietarioInseminacion.iterator();
		
		while (it.hasNext()) {
			moCEPropietarioInse = it.next();
			if (moCEPropietarioInse.getcodigo() == codigo) {
				arrayPropietarioInseminacion.remove(moCEPropietarioInse);
				break;
			}
			
		}
		
	}
	

	@Override
	public ArrayList<CEPropietarioInseminacion> showAll() {
		log.info("MOSTRANDO REGISTROS EXISTENTES...");
		return arrayPropietarioInseminacion;
	}

	@Override
	public CEPropietarioInseminacion showBycodigo(int codigo) {
		log.info("MOSTRANDO EL REGISTRO CON EL CODIGO "+codigo+"...");
		Iterator<CEPropietarioInseminacion> it = arrayPropietarioInseminacion.iterator();
		while (it.hasNext()){
			moCEPropietarioInse = it.next();
			if (moCEPropietarioInse.getcodigo() == codigo) {
				oCEPropietarioInseResponse = moCEPropietarioInse;
				break;
			}
			
		}
		return oCEPropietarioInseResponse;
	}
	

	public void setoCEPropietarioInseResponse(CEPropietarioInseminacion oCEPropietarioInseResponse) {
		this.oCEPropietarioInseResponse = oCEPropietarioInseResponse;
	}

	


	

}
