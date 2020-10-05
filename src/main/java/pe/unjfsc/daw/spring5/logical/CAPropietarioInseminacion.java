package pe.unjfsc.daw.spring5.logical;

import java.util.ArrayList;

import pe.unjfsc.daw.spring5.entity.CEPropietarioInseminacion;


public abstract class CAPropietarioInseminacion {

	public abstract void savePropiInseminacion(CEPropietarioInseminacion poCEPropiInseminacion);
	public abstract void updatePropiInseminacion(CEPropietarioInseminacion poCEPropiInseminacion);
	public abstract void deletePropiInseminacion(int codigo);
	public abstract ArrayList<CEPropietarioInseminacion> showAll();
	public abstract CEPropietarioInseminacion showBycodigo(int codigo);
}
