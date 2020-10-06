package pe.unjfsc.daw.spring5.view;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CENatalidad;
import pe.unjfsc.daw.spring5.logical.impl.CMANatalidad;

public class CVANatalidad {
	private static final Logger log = LoggerFactory.getLogger("CVNatalidad");
	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-Natalidad.xml");
		
		log.info("Context: {}",oCntx);
		CMANatalidad oCMNatalidad = (CMANatalidad) oCntx.getBean("idCMANatalidad");
		
		//Mostrar registros actuales
		log.info("Todos los registros: {}", oCMNatalidad.showAll());
		
		
		//Actualizar un registro según su CUIA
		//CENatalidad oCENatalidad = new CENatalidad(2002, "Macho editada", "LocalDate.of(2020, 7, 4)", "Criollo editada ", 20.00, 2020, "N.O", 1);
		//oCMNatalidad.updateNatalidad(oCENatalidad);
		
		//Mostramos los registros para verificar el cambio
		//log.info("Verificar actualización: {}",oCMNatalidad.showAll());
		
		//Buscamos solo un registro por el CUIA
		//int cuia = 2002;
		//log.info("Buscando registro con el CUIA "+cuia+" :{} ",oCMNatalidad.showByCUIA(cuia));
		
		//Agregamos un nuevo registro
		//CENatalidad oCENatalidad2 = new CENatalidad(2004, "Hembra", LocalDate.of(2020, 7, 4), "Criollo", 20.00, 2020, "N.O", 1);
		//oCMNatalidad.saveNatalidad(oCENatalidad2);
		
		//Verificamos el último registro
		//log.info("Verificar último registro: {}",oCMNatalidad.showAll());
		
		//Eliminamos un registro por su cuia
		//oCMNatalidad.deleteNatalidad(2001);
		
		//Verificamos si se eliminó
		//log.info("Verificar la eliminación: {}",oCMNatalidad.showAll());
		
		((ConfigurableApplicationContext) oCntx).close();

	}

}
