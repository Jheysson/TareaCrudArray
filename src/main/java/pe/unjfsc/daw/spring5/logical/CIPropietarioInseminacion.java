package pe.unjfsc.daw.spring5.logical;

import java.util.ArrayList;

import pe.unjfsc.daw.spring5.entity.CENatalidad;
import pe.unjfsc.daw.spring5.entity.CEPropietarioInseminacion;

public interface CIPropietarioInseminacion {
	public void savePropiInseminacion(CEPropietarioInseminacion poCEPropiInseminacion);
	public void updatePropiInseminacion(CEPropietarioInseminacion poCEPropiInseminacion);
	public void deletePropiInseminacion(int codigo);
	public ArrayList<CEPropietarioInseminacion> showAll();
	public CEPropietarioInseminacion showBycodigo(int codigo);
}
