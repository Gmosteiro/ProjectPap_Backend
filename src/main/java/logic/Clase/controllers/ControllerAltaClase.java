package logic.Clase.controllers;

import logic.Clase.Clase;
import logic.Usuario.ManejadorUsuarios;
import logic.Usuario.Profesor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.swing.JOptionPane;

import DataBase.DbManager;
import logic.ActividadDeportiva.ManejadorActividad;

public class ControllerAltaClase implements IControllerAltaClase {
    private DbManager controllerBD;
    private ManejadorUsuarios manejadorUsuarios;
    private ManejadorActividad manejadorActividades;

    public ControllerAltaClase() {
        manejadorUsuarios = new ManejadorUsuarios();
        manejadorActividades = new ManejadorActividad();
        controllerBD = DbManager.getInstance();
    }

    @Override
    public void addClase(String nombre, LocalDate fecha, LocalTime hora, String url, LocalDate fechaReg,
            String nombreProfesor, String img, String actividad) {
        try {

            if (!validateClassData(nombre, "Clase")) {
                return;
            }

            if (nombreProfesor.length() == 0) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar un profesor ", "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            Profesor profesor = manejadorUsuarios.getProfesor(nombreProfesor);

            Clase nuevaclase = new Clase(nombre, fecha, hora, url, fechaReg, profesor, img);
            manejadorActividades.agregarClaseA(nuevaclase, actividad);

        } catch (Exception errorException) {
            String errorMessage = extractErrorMessage(errorException.getMessage());
            System.out.println("Catch addClase: " + errorMessage);

        }

    }

    private boolean validateClassData(String nombre, String queryValue) {

        try {
            List<Clase> listaClases = controllerBD.getEntityManager().createQuery(
                    "SELECT c FROM " + queryValue + " c WHERE c.nombre = :nombre",
                    Clase.class)
                    .setParameter("nombre", nombre)
                    .getResultList();

            controllerBD.closeEntityManager();

            if (listaClases.isEmpty()) {
                return true;
            } else {

                Clase clase = listaClases.get(0);

                String nommbreClase = clase.getNombre();
                String errorMessage = "";

                if (nommbreClase.equals(nombre)) {
                    errorMessage = "Ya existe una Clase con ese nombre";
                }
                JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (Exception e) {
            System.out.println("Catch " + e);
            return false;
        }
    }

    private String extractErrorMessage(String fullErrorMessage) {
        int startIndex = fullErrorMessage.indexOf(":") + 1; // Encuentra la posición después del primer ":"

        return startIndex > 0 && startIndex < fullErrorMessage.length() ? fullErrorMessage.substring(startIndex).trim()
                : fullErrorMessage;
    }
}
