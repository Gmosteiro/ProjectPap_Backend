package logic.Clase.controllers;

import logic.Clase.Clase;
import logic.Clase.ManejadorClases;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;
import javax.persistence.Entity;

public class ControllerAltaClase implements IControllerAltaClase {

    /*
     * private ManejadorClases manejadorClases;
     * 
     * public ControllerAltaClase() {
     * manejadorClases = new ManejadorClases();
     * }
     */

    @Override
    public void addClase(String nombre, LocalDate fecha, LocalTime hora, String url, LocalDate fechaReg) {
        try {

            if (validateClassData(nombre)) {

            }

            Clase nuevaclase = new Clase(nombre, fecha, hora, url, fechaReg);

            ManejadorClases manejador = new ManejadorClases();

            manejador.agregarClase(nuevaclase);

            System.out.println("Clase Creada");

        } catch (Exception errorException) {
            System.out.println("Catch addClase: " + errorException);
            String errorMessage = extractErrorMessage(errorException.getMessage());
            JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);

        }

    }

    private boolean validateClassData(String nombre) {

        return true;
    }

    private String extractErrorMessage(String fullErrorMessage) {
        int startIndex = fullErrorMessage.indexOf(":") + 1; // Encuentra la posición después del primer ":"

        return startIndex > 0 && startIndex < fullErrorMessage.length() ? fullErrorMessage.substring(startIndex).trim()
                : fullErrorMessage;
    }
}
