package pe.unjfsc.daw.spring5.logical;

import java.util.ArrayList;

import pe.unjfsc.daw.spring5.entity.CENatalidad;

public abstract class CANatalidad {
	public abstract void saveNatalidad(CENatalidad poCENatalidad);
	public abstract void updateNatalidad(CENatalidad poCENatalidad);
	public abstract void deleteNatalidad(int CUIA);
	public abstract ArrayList<CENatalidad> showAll();
	public abstract CENatalidad showByCUIA(int CUIA);
}
