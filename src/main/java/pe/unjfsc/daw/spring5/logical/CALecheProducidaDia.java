package pe.unjfsc.daw.spring5.logical;

import java.util.ArrayList;

import pe.unjfsc.daw.spring5.entity.CELecheProducidaDia;

public abstract class CALecheProducidaDia {

	public abstract void saveLecheProducidaDia(CELecheProducidaDia pCELecheProducidaDia);
	public abstract void updateLecheProducidaDia(CELecheProducidaDia pCELecheProducidaDia);
	public abstract void deleteLecheProducidaDia(int id);
	
	public abstract  ArrayList<CELecheProducidaDia> ShowAll();
	public abstract  CELecheProducidaDia consultarById(int id);
}
