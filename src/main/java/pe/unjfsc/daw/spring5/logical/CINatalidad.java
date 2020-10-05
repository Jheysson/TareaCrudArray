package pe.unjfsc.daw.spring5.logical;

import java.util.ArrayList;

import pe.unjfsc.daw.spring5.entity.CENatalidad;

public interface CINatalidad {
	public void saveNatalidad(CENatalidad poCENatalidad);
	public void updateNatalidad(CENatalidad poCENatalidad);
	public void deleteNatalidad(int CUIA);
	public ArrayList<CENatalidad> showAll();
	public CENatalidad showByCUIA(int CUIA);
}
