package application;

import logic.manejadores.*;
import logic.Fabrica;
import logic.controllers.*;
import datatypes.*;

public class App {

    public static void main(String[] args) {

        try {

            Fabrica factory = new Fabrica();

            IControllerAltaUsuario controllerAltaUsuario = factory.getControladorAltaUsuario();

            DtFecha fechaNacimiento = new DtFecha(14, 8, 2023);

            controllerAltaUsuario.addProfesor("AlexElProfe", "Alex", "ElProfe", "profe@profe.com", fechaNacimiento,
                    "Descripcion", "null", "null.null");

            System.out.println("Funciono");
        } catch (Exception e) {
            System.out.println("Catch main: " + e);
        }
    }

}
