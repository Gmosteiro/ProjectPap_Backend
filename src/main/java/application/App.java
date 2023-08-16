package application;

import logic.manejadores.*;
import logic.Fabrica;
import logic.controllers.*;

import java.time.LocalDate;

import datatypes.*;

public class App {

    public static void main(String[] args) {

        try {

            Fabrica factory = new Fabrica();

            IControllerAltaUsuario controllerAltaUsuario = factory.getControladorAltaUsuario();

            // DtFecha fechaNacimiento = new DtFecha(14, 8, 2023); // cambiar
            LocalDate fechaNacimiento = LocalDate.now();

            controllerAltaUsuario.addProfesor("AlexElProfe35", "Alex", "ElProfe",
                    "profe@profe.com", fechaNacimiento,
                    "Descripcion", "null", "null.null");

        } catch (Exception e) {
            System.out.println("Catch main: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
