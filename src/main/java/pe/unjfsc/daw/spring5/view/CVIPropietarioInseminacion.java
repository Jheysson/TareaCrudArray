package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CEPropietarioInseminacion;
import pe.unjfsc.daw.spring5.logical.impl.CMIPropietarioInseminacion;

public class CVIPropietarioInseminacion {

private static final Logger log = LoggerFactory.getLogger("CVIPropietarioInseminacion");
	
	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("interface-context-propietarioInseminacion.xml");
		
		log.info("Context: {}",oCntx);
		CMIPropietarioInseminacion oCMIPropiInse= (CMIPropietarioInseminacion) oCntx.getBean("idCMIPropietarioInse");
		
		//Mostrar registros actuales
		log.info("Todos los registros: {}", oCMIPropiInse.showAll());
		
		//Actualizar un registro 
		//CEPropietarioInseminacion oCEGanadoVacuno = new CEPropietarioInseminacion(520, 588.00, 1.68, "Establo actualizado", 25.00, "05/10/2020", 1, "Gyrolando","N/O");
		
		//oCMPropiInse.updatePropiInseminacion(oCEGanadoVacuno);
		
		//Mostramos los registros para verificar el cambio
		//log.info("Verificar actualización: {}",oCMIPropiInse.showAll());
		
		//Buscar solo un registro con el codigo
		//int codigo = 320;
		//log.info("Buscando registro con el codigo "+codigo+" :{} ",oCMPropiInse.showBycodigo(codigo));
		
		//Agregar un nuevo registro
		//CEPropietarioInseminacion oCMPropiInse2 = new CEPropietarioInseminacion(620, 594.00, 1.66, "Establo nuevo", 18.00, "06/10/2020", 1, "Brahman","N/O");
		//oCMPropiInse.savePropiInseminacion(oCMPropiInse2);
		
		//Verificamos el último registro
		//log.info("Verificar último registro: {}",oCMPropiInse.showAll());
		
		//Eliminamos un registro 
		//oCMPropiInse.deletePropiInseminacion(120);
		
		//Verificamos si se eliminó
		//log.info("Verificar la eliminación: {}",oCMPropiInse.showAll());
		
		((ConfigurableApplicationContext) oCntx).close();
	}

}
