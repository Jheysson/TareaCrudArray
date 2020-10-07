package pe.unjfsc.daw.spring5.logical;

import java.util.ArrayList;

import pe.unjfsc.daw.spring5.entity.CELecheProducidaDia;

public interface CILecheProducidaDia {

	public void saveLecheProducidaDia(CELecheProducidaDia pCELecheProducidaDia);
	public void updateLecheProducidaDia(CELecheProducidaDia pCELecheProducidaDia);
	public void deleteLecheProducidaDia(int id);
	
	public ArrayList<CELecheProducidaDia> consultaAll();
	public CELecheProducidaDia consultarById(int id);
	
}
