package application;
import java.time.LocalDate;
import java.time.LocalTime;
import logic.Fabrica;
import logic.Clase.controllers.*;
public class App {

public static void main(String[] args) {

        try {

        Ventana ventana = new Ventana();
        ventana.setVisible(true);

        } catch (Exception e) {
        System.out.println("Catch main: " + e.getMessage());
        e.printStackTrace();
        }

        String esi = "ESI";
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
