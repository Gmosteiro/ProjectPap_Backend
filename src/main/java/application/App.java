package application;

public class App {

    public static void main(String[] args) {

        try {

            // Fabrica factory = new Fabrica();

            // IControllerAltaUsuario controllerAltaUsuario =
            // factory.getControladorAltaUsuario();

            // LocalDate fechaNacimiento = new LocalDate(14, 8, 2023); // cambiar

            // controllerAltaUsuario.addProfesor("AlexElProfe2", "Alex", "ElProfe",
            // "profe@profe.com", fechaNacimiento,
            // "Descripcion", "null", "null.null");
            Ventana ventana = new Ventana();
            ventana.setVisible(true);

        } catch (Exception e) {
            System.out.println("Catch main: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
