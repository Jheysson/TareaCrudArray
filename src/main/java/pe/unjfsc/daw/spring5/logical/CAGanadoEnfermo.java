package pe.unjfsc.daw.spring5.logical;

import java.util.ArrayList;

import pe.unjfsc.daw.spring5.entity.CEGanadoEnfermo;

public abstract class CAGanadoEnfermo {
	public abstract void saveGanadoEnfermo (CEGanadoEnfermo pCEGanadoEnfermo);
	public abstract void updateGanadoEnfermo (CEGanadoEnfermo pCEGanadoEnfermo);
	public abstract void deleteGanadoEnfermo (int CUIA);
	
	public abstract ArrayList<CEGanadoEnfermo> consultaAll();
	public abstract CEGanadoEnfermo consultarByCuia (int CUIA);
}
