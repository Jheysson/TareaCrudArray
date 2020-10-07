package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CELecheProducidaDia;
import pe.unjfsc.daw.spring5.logical.impl.CMALecheProducidaDia;


public class CVALecheProducidaDia {
	private static final Logger log = LoggerFactory.getLogger("CVALecheProducidaDia");
	
	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-LecheProducidaDia.xml");
		
		CMALecheProducidaDia oCMALecheProducidaDia = (CMALecheProducidaDia) oCntx.getBean("idCMALecheProducidaDia");
		CELecheProducidaDia oCELecheProducidaDia = new CELecheProducidaDia(1, 10.00, "1/10/2020", 4012);
		
		log.info("[EVL] Todos los registros : {}" , oCMALecheProducidaDia.ShowAll());
		//log.info("[EVL] Solo un registro : {}" , oCMALecheProducidaDia.consultarById(4001));
		//oCMALecheProducidaDia.updateLecheProducidaDia(oCELecheProducidaDia);
		//log.info("[EVL] Todos los registros : {}" , oCMALecheProducidaDia.consultaAll());
		//oCMALecheProducidaDia.deleteLecheProducidaDia(4002);
		//log.info("[EVL] Todos los registros : {}" , oCMALecheProducidaDia.consultarById(4002));
	     //oCMALecheProducidaDia.deleteLecheProducidaDia(1);
		//log.info("[EVL] Todos los registros : {}" , oCMALecheProducidaDia.ShowAll());
		//oCMALecheProducidaDia.updateLecheProducidaDia(oCELecheProducidaDia);
		//oCMALecheProducidaDia.saveLecheProducidaDia(oCELecheProducidaDia);
		log.info("[EVL] Todos los registros : {}" , oCMALecheProducidaDia.ShowAll());
		((ConfigurableApplicationContext) oCntx).close();

	}

}
