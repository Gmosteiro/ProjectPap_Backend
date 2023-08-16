package application;

public class App {

	public static void main(String[] args) {

		try {

			Ventana ventana = new Ventana();
			ventana.setVisible(true);

		} catch (Exception e) {
			System.out.println("Catch main: " + e.getMessage());
			e.printStackTrace();
		}

		// try {
		// Fabrica factory = new Fabrica();

		// IControllerAltaInstitucionDeportiva controllerAltaInstitucionDeportiva =
		// factory.getControladorAltaInstitucionDeportiva();

		// controllerAltaInstitucionDeportiva.addInstitucionDeportiva("GymFit", "clases
		// de zumba y algebra", "www.gymfit.com.uy");

		// } catch (Exception e) {
		// System.out.println("Catch main: " + e.getMessage());
		// e.printStackTrace();
		// }
	}

}
