package application;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import logic.Fabrica;
import logic.ActividadDeportiva.ActividadDeportiva;
import logic.ActividadDeportiva.controllers.IControllerAltaActividad;
import logic.ActividadDeportiva.controllers.IControllerModificarActividad;
import logic.Clase.controllers.IControllerAltaClase;
import logic.Clase.controllers.IControllerDictadoClase;
import logic.Clase.controllers.IControllerRanking;
import logic.Institucion.InstitucionDeportiva;
import logic.Institucion.ManejadorInstitucion;
import logic.Institucion.controllers.IControllerAltaInstitucionDeportiva;
import logic.Institucion.controllers.IControllerModificarInstitucion;
import logic.Usuario.controllers.IControllerAltaUsuario;
import logic.Usuario.controllers.IControllerModificarUsuario;
import logic.Usuario.controllers.IControllerRegistroDictado;

public class App {

	public static void main(String[] args) {

		try {
			// autoInsert();
			iniciarVentana();
			// probarModificarUsuario();

		} catch (Exception e) {
			System.out.println("Catch main: " + e.getMessage());
			e.printStackTrace();
		}

		// probarModificarUsuario();

	}

	public static void autoInsert() {
		probarAddInstituciones();
		probarAddActividad();
		probarAddUsuarios();
		probarAddClase();
		probarAddRegistroDictado();
	}

	public static void probarAddRegistroDictado() {
		try {

			Fabrica factory = new Fabrica();
			IControllerRegistroDictado controllerDictado = factory.getControllerRegistroDictado();
			LocalDate fecha = LocalDate.of(2023, 8, 17);
			controllerDictado.addRegistroDictado("socio1", "Matematica", fecha);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	public static void probarAddUsuarios() {
		LocalDate fecha = LocalDate.of(2023, 8, 17);

		InstitucionDeportiva institucionDeportiva = ManejadorInstitucion
				.getInstitucionesByName("ESI");

		Fabrica factory = new Fabrica();
		IControllerAltaUsuario controllerAltaUsuario = factory.getControladorAltaUsuario();
		controllerAltaUsuario.addProfesor("Juan", "Juan", "Marin", "Juan@marin.com", fecha, "Alto profe",
				"Soy alto Profe", "JuanProfe.com",
				institucionDeportiva);
		controllerAltaUsuario.addSocio("socio1", "socio", "socio", "socio@socio.com", fecha);

	}

	public static void probarRankingActividades() {
		Fabrica factory = new Fabrica();
		IControllerRanking controllerRanking = factory.getControladorRankingActividad();
		List<ActividadDeportiva> ranking = controllerRanking.obtenerRankingDeActividades();
		System.out.println("Ranking funcionando " + ranking);

	}

	public static void probarAddInstituciones() {
		Fabrica factory = new Fabrica();
		IControllerAltaInstitucionDeportiva controllerInstituciones = factory
				.getControladorAltaInstitucionDeportiva();
		controllerInstituciones.addInstitucionDeportiva("ESI", "La UTU", "utu.com");

	}

	public static void probarGetInstituciones() {
		Fabrica factory = new Fabrica();
		IControllerDictadoClase controllerDictado = factory.getControladorDictadoClase();
		controllerDictado.getInstituciones();
	}

	public static void probarGetActividades() {
		Fabrica factory = new Fabrica();
		IControllerDictadoClase controllerDictado = factory.getControladorDictadoClase();
		controllerDictado.getActividades();
	}

	public static void probarAddClase() {

		LocalDate fecha = LocalDate.of(2023, 8, 17);
		LocalTime hora = LocalTime.of(14, 30);
		LocalDate fechareg = LocalDate.of(2023, 8, 17);
		try {
			Fabrica factory = new Fabrica();

			IControllerAltaClase controllerAltaClase = factory.getControladorAltaClase();

			controllerAltaClase.addClase("Matematica", fecha, hora, "ESI", fechareg, "Juan", "Matematica");

		} catch (Exception e) {
			System.out.println("Catch main: " + e.getMessage());
			e.printStackTrace();
		}

	}

	public static void probarAddActividad() {

		try {
			Fabrica factory = new Fabrica();

			IControllerAltaActividad controllerAltaActividad = factory.getControladorAltaActividad();
			LocalDate fechareg = LocalDate.of(2023, 8, 17);

			controllerAltaActividad.altaActividad("Matematica", "numeritos", 10, 100, fechareg, "ESI");

		} catch (Exception e) {
			System.out.println("Catch main: " + e.getMessage());
			e.printStackTrace();
		}

	}

	private static void iniciarVentana() {
		Ventana ventana = new Ventana();
		ventana.setVisible(true);
		ventana.setSize(880, 700);

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

	public static void probarModificarActividad() {
		Fabrica factory = new Fabrica();
		IControllerModificarActividad controllerActividad = factory.getControllerModificarActividad();

		String nombreActividad = "Matematica";
		String nuevaDescripcion = "Nueva descripción";
		int nuevaDuracion = 60;
		float nuevoCosto = 50;

		controllerActividad.modificarActividad(nombreActividad, nuevaDescripcion, nuevaDuracion, nuevoCosto);

		System.out.println("Actividad modificada exitosamente.");
	}

	public static void probarModificarUsuario() {
		Fabrica factory = new Fabrica();
		IControllerModificarUsuario controllerUsuario = factory.getControllerModificarUsuario();

		String nickname = "socio1";
		String nuevoNombre = "Alex";
		String nuevoApellido = "Ribeiro";
		LocalDate nuevafecha = LocalDate.of(2023, 12, 24);

		controllerUsuario.modificarUsuario(nickname, nuevoNombre, nuevoApellido, nuevafecha);

		System.out.println("Usuario modificado exitosamente.");
	}

	public static void probarModificarInstitucion() {
		Fabrica factory = new Fabrica();
		IControllerModificarInstitucion controllerInstitucion = factory.getControllerModificarInstitucion();

		String nickname = "ALEX";
		String nuevodesc = "Alex";
		String nuevoURL = "Ribeiro";

		controllerInstitucion.modificarInstitucion(nickname, nuevodesc, nuevoURL);

		System.out.println("Usuario modificado exitosamente.");
	}

}
