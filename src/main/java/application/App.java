package application;

import logic.manejadores.*;
import logic.Fabrica;
import logic.controllers.*;

import datatypes.*;

public class App {

    public static void main(String[] args) {

/*
    	try {

            Fabrica factory = new Fabrica();

            IControllerAltaUsuario controllerAltaUsuario = factory.getControladorAltaUsuario();

            DtFecha fechaNacimiento = new DtFecha(14, 8, 2023); // cambiar

            controllerAltaUsuario.addProfesor("AlexElProfe2", "Alex", "ElProfe",
                    "profe@profe.com", fechaNacimiento,
                    "Descripcion", "null", "null.null");

        } catch (Exception e) {
            System.out.println("Catch main: " + e.getMessage());
            e.printStackTrace();
        }
*/
    	
    	try {
    		Fabrica factory = new Fabrica();
    		
    		IControllerAltaInstitucionDeportiva controllerAltaInstitucionDeportiva = factory.getControladorAltaInstitucionDeportiva();
    		
    		controllerAltaInstitucionDeportiva.addInstitucionDeportiva("GymFit", "clases de zumba y algebra", "www.gymfit.com.uy");
    		
    	} catch (Exception e) {
    		System.out.println("Catch main: " + e.getMessage());
    		e.printStackTrace();
    	}
    }

}
