package pe.unjfsc.daw.spring5.view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CEGanadoVacuno;
import pe.unjfsc.daw.spring5.logical.impl.CMGanadoVacuno;

public class CVGanadoVacuno {
	private static final Logger log = LoggerFactory.getLogger("CVGanadoVacuno");
	
	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-ganadoVacuno.xml");
		
		log.info("Context: {}",oCntx);
		CMGanadoVacuno oCMGanadoVacuno = (CMGanadoVacuno) oCntx.getBean("idCMGanadoVacuno");
		
		//Mostrar registros actuales
		log.info("Todos los registros: {}", oCMGanadoVacuno.showAll());
		
		
		//Actualizar un registro según su CUIA
		//CEGanadoVacuno oCEGanadoVacuno = new CEGanadoVacuno(2001,"Julia Editado","Hembra Editado",fechaNac,10,"a");
		//oCMGanadoVacuno.updateGanadoVacuno(oCEGanadoVacuno);
		
		//Mostramos los registros para verificar el cambio
		//log.info("Verificar actualización: {}",oCMGanadoVacuno.showAll());
		
		//Buscamos solo un registro por el CUIA
		//int cuia = 2003;
		//log.info("Buscando registro con el CUIA "+cuia+" :{} ",oCMGanadoVacuno.showByCUIA(cuia));
		
		//Agregamos un nuevo registro
		//CEGanadoVacuno oCEGanadoVacuno2 = new CEGanadoVacuno(2004,"Nuevo José","Nuevo Macho",fechaNac,10,"a");
		//oCMGanadoVacuno.saveGanadoVacuno(oCEGanadoVacuno2);
		
		//Verificamos el último registro
		//log.info("Verificar último registro: {}",oCMGanadoVacuno.showAll());
		
		//Eliminamos un registro por su cuia
		//oCMGanadoVacuno.deleteGanadoVacuno(2001);
		
		//Verificamos si se eliminó
		//log.info("Verificar la eliminación: {}",oCMGanadoVacuno.showAll());
		
		((ConfigurableApplicationContext) oCntx).close();
	}
}
