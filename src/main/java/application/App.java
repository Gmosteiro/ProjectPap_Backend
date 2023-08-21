package application;

import java.time.LocalDate;
import java.time.LocalTime;

import logic.Fabrica;
import logic.Clase.controllers.IControllerAltaClase;
import logic.Clase.controllers.IControllerDictadoClase;
import logic.Institucion.controllers.IControllerAltaInstitucionDeportiva;

public class App {

        public static void main(String[] args) {

                try {
                        // probarAddInstituciones();

                        probarGetInstituciones();

                        // Ventana ventana = new Ventana();
                        // ventana.setVisible(true);

                } catch (Exception e) {
                        System.out.println("Catch main: " + e.getMessage());
                        e.printStackTrace();
                }

        }

        public static void probarAddInstituciones() {
                Fabrica factory = new Fabrica();
                IControllerAltaInstitucionDeportiva controllerInstituciones = factory
                                .getControladorAltaInstitucionDeportiva();
                controllerInstituciones.addInstitucionDeportiva("Gimnasio", "Alex No va", "gym.com");

        }

        public static void probarGetInstituciones() {
                Fabrica factory = new Fabrica();
                IControllerDictadoClase controllerDictado = factory.getControladorDictadoClase();
                controllerDictado.getInstituciones();
        }

        public void probarClases() {

                String esi = "ESI"; // estructura para probar funciones
                LocalDate fecha = LocalDate.of(2023, 8, 17);
                LocalTime hora = LocalTime.of(14, 30);
                String campus = "Campus";
                LocalDate fechareg = LocalDate.of(2023, 8, 17);
                try {
                        Fabrica factory = new Fabrica();

                        IControllerAltaClase controllerAltaClase = factory.getControladorAltaClase();

                        controllerAltaClase.addClase(esi, fecha, hora, campus, fechareg);

                } catch (Exception e) {
                        System.out.println("Catch main: " + e.getMessage());
                        e.printStackTrace();
                }

        }

}
