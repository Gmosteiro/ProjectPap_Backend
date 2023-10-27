package application;

import java.awt.Dimension;
import java.awt.Toolkit;

public class App {

	public static void main(String[] args) {

		try {
			iniciarVentana();

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

}
