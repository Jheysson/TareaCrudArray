package pe.unjfsc.daw.spring5.logical;



import java.util.ArrayList;

import pe.unjfsc.daw.spring5.entity.CEGanadoEnfermo;

public interface CIGanadoEnfermo {
	public void saveGanadoEnfermo (CEGanadoEnfermo pCEGanadoEnfermo);
	public void updateGanadoEnfermo (CEGanadoEnfermo pCEGanadoEnfermo);
	public void deleteGanadoEnfermo (int CUIA);
	
	public ArrayList<CEGanadoEnfermo> consultaAll();
	public CEGanadoEnfermo consultarByCuia (int CUIA);
}
