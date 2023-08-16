package application;
import java.time.LocalDate;

import logic.Fabrica;
import logic.controllers.IControllerAltaActividad;


public class App {

	public static void main(String[] args) {

		try {

			Ventana ventana = new Ventana();
			ventana.setVisible(true);

		} catch (Exception e) {
			System.out.println("Catch main: " + e.getMessage());
			e.printStackTrace();
		}

// 		 try {
//     Fabrica factory = new Fabrica();

//     IControllerAltaActividad controllerAltaActividad = factory.getControladorAltaActividad();


//     controllerAltaActividad.altaActividad("Yoga", "Clases de yoga para relajación", 60, 20.0f, java.time.LocalDate.now());


// } catch (Exception e) {
//     System.out.println("Catch main: " + e.getMessage());
//     e.printStackTrace();
// }

	}

}
