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
    }

}
