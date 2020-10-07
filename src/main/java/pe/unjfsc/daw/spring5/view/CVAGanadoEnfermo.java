package pe.unjfsc.daw.spring5.view;

import java.time.LocalDate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.logical.impl.CMAGanadoEnfermo;

public class CVAGanadoEnfermo {
	private static final Logger Log = LoggerFactory.getLogger("CVGanadoEnfermo");

	public static void main (String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-ganadoEnfermo.xml");
		
		Log.info("[EVL] Context: {}",oCntx);
		CMAGanadoEnfermo oCMAGanadoEnfermo= (CMAGanadoEnfermo) oCntx.getBean("idCMAGanadoEnfermo");
		
				//CEGanadoEnfermo oCEGanadoEnfermo = new CEGanadoEnfermo(2020,"Mastitis", LocalDate.of(2020, 9, 1),"Mejora considerable", 1);
				//log.info("[EVL] Todos los registros : {}" , oCMAGanadoEnfermo.consultaAll());
				//log.info("[EVL] Solo un registro : {}" , oCMAGanadoEnfermo.consultarByCuia(2002));
				//oCMAGanadoEnfermo.updateGanadoEnfermo(oCEGanadoEnfermo);
				Log.info("[EVL] Todos los registros : {}" , oCMAGanadoEnfermo.consultaAll());
				//oCMAGanadoEnfermo.deleteGanadoEnfermo(2002);
				//log.info("[EVL] Todos los registros : {}" , oCMAGanadoEnfermo.consultarByCuia(2001));
				//oCMAGanadoEnfermo.deleteGanadoEnfermo(2002);
				//log.info("[EVL] Todos los registros : {}" , oCMAGanadoEnfermo.consultaAll());
				//oCMAGanadoEnfermo.updateGanadoEnfermo(oCEGanadoEnfermo);
				//oCMAGanadoEnfermo.saveGanadoEnfermo(oCEGanadoEnfermo);
				//log.info("[EVL] Todos los registros : {}" , oCMAGanadoEnfermo.consultaAll());
				((ConfigurableApplicationContext) oCntx).close();

			}

		}
