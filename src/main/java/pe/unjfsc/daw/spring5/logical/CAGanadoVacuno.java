package pe.unjfsc.daw.spring5.logical;

import java.util.ArrayList;

import pe.unjfsc.daw.spring5.entity.CEGanadoVacuno;

public abstract class CAGanadoVacuno {
	public abstract void saveGanadoVacuno(CEGanadoVacuno poCEGanadoGacuno);
	public abstract void updateGanadoVacuno(CEGanadoVacuno poCEGanadoVacuno);
	public abstract void deleteGanadoVacuno(int CUIA);
	public abstract ArrayList<CEGanadoVacuno> showAll();
	public abstract CEGanadoVacuno showByCUIA(int CUIA);
	
}
