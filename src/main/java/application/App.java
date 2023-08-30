package application;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import logic.Fabrica;
import logic.ActividadDeportiva.ActividadDeportiva;
import logic.ActividadDeportiva.controllers.IControllerModificarActividad;
import logic.Clase.controllers.IControllerAltaClase;
import logic.Clase.controllers.IControllerDictadoClase;
import logic.Clase.controllers.IControllerRanking;
import logic.Institucion.controllers.IControllerAltaInstitucionDeportiva;
import logic.Usuario.controllers.IControllerModificarUsuario;

public class App {

        public static void main(String[] args) {

                try {
                        //iniciarVentana();
                        probarClases();
                } catch (Exception e) {
                        System.out.println("Catch main: " + e.getMessage());
                        e.printStackTrace();
                }

                        //probarModificarUsuario();
               
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
                controllerInstituciones.addInstitucionDeportiva("Gimnasio2", "Alex No va", "gym.com");

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



        public static void probarClases() {

                String esi = "ESI"; // estructura para probar funciones
                LocalDate fecha = LocalDate.of(2023, 8, 17);
                LocalTime hora = LocalTime.of(14, 30);
                String campus = "Campuss";
                LocalDate fechareg = LocalDate.of(2023, 8, 17);
                try {
                        Fabrica factory = new Fabrica();

                        IControllerAltaClase controllerAltaClase = factory.getControladorAltaClase();

                        controllerAltaClase.addClase(esi, fecha, hora, campus, fechareg, "Tonga", "alidgs");

                } catch (Exception e) {
                        System.out.println("Catch main: " + e.getMessage());
                        e.printStackTrace();
                }

        }

        private static void iniciarVentana() {
                Ventana ventana = new Ventana();
                ventana.setVisible(true);

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
                
                String nombreActividad = "pepe";
                String nuevaDescripcion = "Nueva descripción";
                int nuevaDuracion = 60;
                float nuevoCosto = 50.0f;
        
                controllerActividad.modificarActividad(nombreActividad, nuevaDescripcion, nuevaDuracion, nuevoCosto);
        
                System.out.println("Actividad modificada exitosamente.");
            }


            public static void probarModificarUsuario() {
                Fabrica factory = new Fabrica();
                IControllerModificarUsuario controllerUsuario = factory.getControllerModificarUsuario();
            
                String nickname = "Item 2";
                String nuevoNombre = "NuevoNombre";
                String nuevoApellido = "NuevoApellido";
            
                controllerUsuario.modificarUsuario(nickname, nuevoNombre, nuevoApellido);
            
                System.out.println("Usuario modificado exitosamente.");
            }
            

            

}
