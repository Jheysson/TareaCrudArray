package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.logical.impl.CMANatalidad;
import pe.unjfsc.daw.spring5.logical.impl.CMINatalidad;

public class CVINatalidad {
	private static final Logger log = LoggerFactory.getLogger("CVNatalidad");
	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-Natalidad.xml");
		
		log.info("Context: {}",oCntx);
		CMINatalidad oCMINatalidad = (CMINatalidad) oCntx.getBean("idCMINatalidad");
		
		//Mostrar registros actuales
		log.info("Todos los registros: {}", oCMINatalidad.showAll());
		
		
		//Actualizar un registro según su CUIA
		//CENatalidad oCENatalidad = new CENatalidad(2002, "Macho editada", "LocalDate.of(2020, 7, 4)", "Criollo editada ", 20.00, 2020, "N.O", 1);
		//oCMINatalidad.updateNatalidad(oCENatalidad);
		
		//Mostramos los registros para verificar el cambio
		//log.info("Verificar actualización: {}",oCMINatalidad.showAll());
		
		//Buscamos solo un registro por el CUIA
		//int cuia = 2002;
		//log.info("Buscando registro con el CUIA "+cuia+" :{} ",oCMINatalidad.showByCUIA(cuia));
		
		//Agregamos un nuevo registro
		//CENatalidad oCENatalidad2 = new CENatalidad(2004, "Hembra", LocalDate.of(2020, 7, 4), "Criollo", 20.00, 2020, "N.O", 1);
		//oCMINatalidad.saveNatalidad(oCENatalidad2);
		
		//Verificamos el último registro
		//log.info("Verificar último registro: {}",oCMINatalidad.showAll());
		
		//Eliminamos un registro por su cuia
		//oCMINatalidad.deleteNatalidad(2001);
		
		//Verificamos si se eliminó
		//log.info("Verificar la eliminación: {}",oCMINatalidad.showAll());
		
		((ConfigurableApplicationContext) oCntx).close();

	}

}
