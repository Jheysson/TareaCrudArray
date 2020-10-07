package pe.unjfsc.daw.spring5.view;

import java.time.LocalDate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.logical.impl.CMIGanadoEnfermo;

public class CVIGanadoEnfermo {

private static final Logger Log = LoggerFactory.getLogger("CVGanadoEnfermo");

public static void main (String[] args) {
	ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-ganadoEnfermo.xml");
	
	Log.info("[EVL] Context: {}",oCntx);
	CMIGanadoEnfermo oCMIGanadoEnfermo= (CMIGanadoEnfermo) oCntx.getBean("idCMIGanadoEnfermo");
	
			//CEGanadoEnfermo oCEGanadoEnfermo = new CEGanadoEnfermo(2020,"Mastitis", LocalDate.of(2020, 9, 1),"Mejora considerable", 1);
			//log.info("[EVL] Todos los registros : {}" , oCMIGanadoEnfermo.consultaAll());
			//log.info("[EVL] Solo un registro : {}" , oCMIGanadoEnfermo.consultarByCuia(2002));
			//oCMIGanadoEnfermo.updateGanadoEnfermo(oCEGanadoEnfermo);
			Log.info("[EVL] Todos los registros : {}" , oCMIGanadoEnfermo.consultaAll());
			//oCMIGanadoEnfermo.deleteGanadoEnfermo(2002);
			//log.info("[EVL] Todos los registros : {}" , oCMIGanadoEnfermo.consultarByCuia(2001));
			//oCMIGanadoEnfermo.deleteGanadoEnfermo(2002);
			//log.info("[EVL] Todos los registros : {}" , oCMIGanadoEnfermo.consultaAll());
			//oCMIGanadoEnfermo.updateGanadoEnfermo(oCEGanadoEnfermo);
			//oCMIGanadoEnfermo.saveGanadoEnfermo(oCEGanadoEnfermo);
			//log.info("[EVL] Todos los registros : {}" , oCMIGanadoEnfermo.consultaAll());
			((ConfigurableApplicationContext) oCntx).close();

		}

	}
