package application;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.LocalTime;

import logic.Fabrica;
import logic.ActividadDeportiva.controllers.IControllerAltaActividad;
import logic.Clase.controllers.IControllerAltaClase;
import logic.Institucion.ManejadorInstitucion;
import logic.Institucion.controllers.IControllerAltaInstitucionDeportiva;
import logic.Usuario.controllers.IControllerAltaUsuario;
import logic.Usuario.controllers.IControllerRegistroDictado;

public class App {

	public static void main(String[] args) {

		try {
			// iniciarVentana();

			cargarData();

		} catch (Exception e) {
			System.out.println("Catch main: " + e.getMessage());
			e.printStackTrace();
		}
	}

	private static void iniciarVentana() {
		Ventana ventana = new Ventana();
		ventana.setVisible(true);
		ventana.setSize(980, 750);

		// Obtener el tamaño de la pantalla
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;

		// Obtener el tamaño de la ventana
		int windowWidth = ventana.getWidth();
		int windowHeight = ventana.getHeight();

		// Calcular las coordenadas para centrar la ventana
		int x = (screenWidth - windowWidth) / 2;
		int y = (screenHeight - windowHeight) / 2;

		ventana.setLocation(x, y);
	}

	private static void cargarData() {

		try {

			String imgSocio = "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";
			String imgProfe = imgSocio;
			String imgActividad = "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";
			String imgClase = "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";

			Fabrica factory = new Fabrica();
			IControllerAltaInstitucionDeportiva iconI = factory.getControladorAltaInstitucionDeportiva();
			iconI.addInstitucionDeportiva("Gimnasio Florida", "Descripcion de Gimnasio Florida", "www.gimFlorida.com");
			iconI.addInstitucionDeportiva("Gimnasio Montevideo", "Descripcion de Gimnasio Montevideo",
					"www.gimMontevideo.com");
			iconI.addInstitucionDeportiva("Gimnasio Colonia", "Descripcion de Gimnasio Colonia", "www.gimColonia.com");

			IControllerAltaUsuario iconU = factory.getControladorAltaUsuario();
			iconU.addProfesor("profeFlorida", "profeFlorida", "apellido", "profeFlorida@mail.com", LocalDate.now(),
					"Desc",
					"bio", "sitio", ManejadorInstitucion.getInstitucionesByName("Gimnasio Florida"), "profe", imgProfe);
			iconU.addProfesor("profeMontevideo", "profeMontevideo", "apellido", "profeMontevideo@mail.com",
					LocalDate.now(),
					"Desc",
					"bio", "sitio", ManejadorInstitucion.getInstitucionesByName("Gimnasio Montevideo"), "profe",
					imgProfe);
			iconU.addProfesor("profeColonia", "profeColonia", "apellido", "profeColonia@mail.com", LocalDate.now(),
					"Desc",
					"bio", "sitio", ManejadorInstitucion.getInstitucionesByName("Gimnasio Colonia"), "profe", imgProfe);

			iconU.addSocio("socioFlorida", "socioFlorida", "apellido", "socioFlorida@test.com", LocalDate.now(), "user",
					imgSocio);

			iconU.addSocio("socioMontevideo", "socioMontevideo", "apellido", "socioMontevideo@test.com",
					LocalDate.now(),
					"user",
					imgSocio);

			iconU.addSocio("socioColonia", "socioColonia", "apellido", "socioColonia@test.com", LocalDate.now(), "user",
					imgSocio);

			IControllerAltaActividad iconA = factory.getControladorAltaActividad();
			iconA.altaActividad("actividadFlorida", "desc", 10, 100, LocalDate.now(), imgActividad, "Gimnasio Florida");
			iconA.altaActividad("actividadMontevideo", "desc", 10, 100, LocalDate.now(), imgActividad,
					"Gimnasio Montevideo");
			iconA.altaActividad("actividadColonia", "desc", 10, 100, LocalDate.now(), imgActividad, "Gimnasio Colonia");

			IControllerAltaClase iconC = factory.getControladorAltaClase();

			iconC.addClase("claseFlorida", LocalDate.now(), LocalTime.now(), "url", LocalDate.now(), "profeFlorida",
					imgClase, "actividadFlorida");
			iconC.addClase("claseMontevideo", LocalDate.now(), LocalTime.now(), "url", LocalDate.now(),
					"profeMontevideo",
					imgClase, "actividadMontevideo");
			iconC.addClase("claseColonia", LocalDate.now(), LocalTime.now(), "url", LocalDate.now(), "profeColonia",
					imgClase, "actividadColonia");

			IControllerRegistroDictado iconR = factory.getControllerRegistroDictado();
			iconR.addRegistroDictadoWeb("socioFlorida", "claseFlorida", LocalDate.now());
			iconR.addRegistroDictadoWeb("socioMontevideo", "claseMontevideo", LocalDate.now());

			iconR.addRegistroDictadoWeb("socioColonia", "claseColonia", LocalDate.now());
		} catch (Exception e) {
			System.out.println("Catch cargarData: " + e);
		}

	}

}
