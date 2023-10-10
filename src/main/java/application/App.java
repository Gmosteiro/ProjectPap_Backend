package application;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Base64;
import java.util.List;


import logic.Fabrica;
import logic.ActividadDeportiva.ActividadDeportiva;
import logic.Clase.controllers.IControllerDictadoClase;
import logic.Clase.controllers.IControllerRanking;
import logic.Institucion.controllers.IControllerAltaInstitucionDeportiva;
import logic.Institucion.controllers.IControllerModificarInstitucion;
import logic.Usuario.Sesion;
import logic.Usuario.controllers.IControllerInicioSesion;
import logic.Usuario.controllers.IControllerRegistroDictado;
import logic.Clase.Clase;
import logic.Clase.ManejadorClases;
import logic.Usuario.ManejadorUsuarios;
import logic.Usuario.Socio;
import logic.Usuario.controllers.IControllerEliminarRegClase;

public class App {

	public static void main(String[] args) {

		try {
			// autoInsert();
//                        probarInicioSesion();
//			iniciarVentana();
                        probarEliminarRegistroDeClase();
			// probarModificarUsuario();

		} catch (Exception e) {
			System.out.println("Catch main: " + e.getMessage());
			e.printStackTrace();
		}

		// probarModificarUsuario();

	}

	public static void autoInsert() {
		probarAddInstituciones();
//		probarAddActividad();
//		probarAddUsuarios();
//		probarAddClase();
		probarAddRegistroDictado();
	}

	public static void probarAddRegistroDictado() {
		try {

			Fabrica factory = new Fabrica();
			IControllerRegistroDictado controllerDictado = factory.getControllerRegistroDictado();
			LocalDate fecha = LocalDate.of(2023, 8, 17);
			controllerDictado.addRegistroDictado("socio1", "Running", fecha);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}
        
        public static void probarEliminarRegistroDeClase() {
    try {
        Fabrica factory = new Fabrica();
        IControllerEliminarRegClase controllerEliminar = factory.getControllerEliminarRegClase();

        // Obtener el Socio y la Clase por sus identificadores únicos
        String nicknameSocio = "pepe";  // Reemplaza "nickname_socio" con el nickname del Socio que deseas eliminar
        String nombreClase = "clase";  // Reemplaza "nombre_clase" con el nombre de la Clase correspondiente

        Socio socio = ManejadorUsuarios.getSocio(nicknameSocio);
        Clase clase = ManejadorClases.getClaseByNombre(nombreClase);

        if (socio != null && clase != null) {
            // Eliminar el registro del Socio en la Clase
            controllerEliminar.eliminarRegistroDeClase(socio, clase);
            System.out.println("Registro eliminado con éxito.");
        } else {
            System.out.println("No se encontró un Socio o una Clase asociados a los datos proporcionados.");
        }
    } catch (Exception e) {
        System.out.println("Error al eliminar el registro: " + e.getMessage());
    }
}












  
//	public static void probarAddUsuarios() {
//		try {
//			LocalDate fecha = LocalDate.of(2023, 8, 17);
//
//			InstitucionDeportiva institucionDeportiva = ManejadorInstitucion.getInstitucionesByName("ESI");
//
//			File imagenFile = new File("C:\\Users\\santi\\Pictures\\DSCF0475.jpg");
//			FileInputStream fis = new FileInputStream(imagenFile);
//			String imagenBytes = new byte[(int) imagenFile.length()];
//			fis.read(imagenBytes);
//			fis.close();
//
//			Fabrica factory = new Fabrica();
//			IControllerAltaUsuario controllerAltaUsuario = factory.getControladorAltaUsuario();
//
//			controllerAltaUsuario.addProfesor("Juan", "Juan", "Marin", "Juan@marin.com", fecha, "Alto profe",
//					"Soy alto Profe", "JuanProfe.com", institucionDeportiva, "contrasena", imagenBytes);
//
//			controllerAltaUsuario.addSocio("socio1", "socio", "socio", "socio@socio.com", fecha, "contrasena",
//					imagenBytes);
//		} catch (Exception e) {
//			System.out.println("Error al agregar usuarios: " + e.getMessage());
//			e.printStackTrace();
//		}
//
//	}

	public static void probarInicioSesion() {

		Fabrica factory = new Fabrica();
		IControllerInicioSesion controllerInicioSesion = factory.getControllerInicioSesion();

		Sesion usuario = controllerInicioSesion.iniciarSesion("pepe", "pepe");
		System.out.println("Resultado: " + usuario);

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
		controllerInstituciones.addInstitucionDeportiva("Gimnasio", "Gym", "gym.com");

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

//	public static void probarAddClase() {
//
//		LocalDate fecha = LocalDate.of(2023, 8, 17);
//		LocalTime hora = LocalTime.of(14, 30);
//		LocalDate fechareg = LocalDate.of(2023, 8, 17);
//		try {
//			Fabrica factory = new Fabrica();
//
//			IControllerAltaClase controllerAltaClase = factory.getControladorAltaClase();
//			File imagenFile = new File("C:\\Users\\santi\\Pictures\\DSCF0475.jpg");
//			FileInputStream fis = new FileInputStream(imagenFile);
//			byte[] imagenBytes = new byte[(int) imagenFile.length()];
//			fis.read(imagenBytes);
//			fis.close();
//			controllerAltaClase.addClase("Running", fecha, hora, "run.com", fechareg, "Juan", imagenBytes, "Atletismo");
//
//		} catch (Exception e) {
//			System.out.println("Catch main: " + e.getMessage());
//			e.printStackTrace();
//		}
//
//	}

//	public static void probarAddActividad() {
//
//		try {
//			Fabrica factory = new Fabrica();
//
//			IControllerAltaActividad controllerAltaActividad = factory.getControladorAltaActividad();
//			LocalDate fechareg = LocalDate.of(2023, 8, 17);
//
//			File imagenFile = new File("C:\\Users\\santi\\Pictures\\DSCF0475.jpg");
//			FileInputStream fis = new FileInputStream(imagenFile);
//			byte[] imagenBytes = new byte[(int) imagenFile.length()];
//			fis.read(imagenBytes);
//			fis.close();
//
//			controllerAltaActividad.altaActividad("Atletismo", "Moverse", 10, 100, fechareg, imagenBytes, "Gimnasio");
//
//		} catch (Exception e) {
//			System.out.println("Catch main: " + e.getMessage());
//			e.printStackTrace();
//		}
//
//	}

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

//	public static void probarModificarActividad() {
//		Fabrica factory = new Fabrica();
//		IControllerModificarActividad controllerActividad = factory.getControllerModificarActividad();
//
//		String nombreActividad = "Matematica";
//		String nuevaDescripcion = "Nueva descripción";
//		int nuevaDuracion = 60;
//		float nuevoCosto = 50;
//
//		controllerActividad.modificarActividad(nombreActividad, nuevaDescripcion, nuevaDuracion, nuevoCosto);
//
//		System.out.println("Actividad modificada exitosamente.");
//	}

//	public static void probarModificarUsuario() {
//		Fabrica factory = new Fabrica();
//		IControllerModificarUsuario controllerUsuario = factory.getControllerModificarUsuario();
//
//		String nickname = "socio1";
//		String nuevoNombre = "Alex";
//		String nuevoApellido = "Ribeiro";
//		LocalDate nuevafecha = LocalDate.of(2023, 12, 24);
//
//		controllerUsuario.modificarUsuario(nickname, nuevoNombre, nuevoApellido, nuevafecha);
//
//		System.out.println("Usuario modificado exitosamente.");
//	}

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
