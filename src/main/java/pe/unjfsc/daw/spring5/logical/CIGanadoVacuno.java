package pe.unjfsc.daw.spring5.logical;

import java.util.ArrayList;

import pe.unjfsc.daw.spring5.entity.CEGanadoVacuno;

public interface CIGanadoVacuno {
	public void saveGanadoVacuno(CEGanadoVacuno poCEGanadoVacuno);
	public void updateGanadoVacuno(CEGanadoVacuno poCEGanadoVacuno);
	public void deleteGanadoVacuno(int CUIA);
	public ArrayList<CEGanadoVacuno> showAll();
	public CEGanadoVacuno showByCUIA(int CUIA);
}
