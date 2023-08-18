package logic.ActividadDeportiva.controllers;

import logic.ActividadDeportiva.ActividadDeportiva;
import logic.ActividadDeportiva.ManejadorActividad;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;

public class ControllerAltaActividad implements IControllerAltaActividad {

    private final ManejadorActividad manejadorActividad;

    public ControllerAltaActividad() {
        manejadorActividad = new ManejadorActividad();
    }

    @Override
    public void altaActividad(String nombre, String descripcion, int duracion, float costo, LocalDate fechaReg) {
        try {

            if (validateActivityData(nombre)) {
                ActividadDeportiva actividad = new ActividadDeportiva(nombre, descripcion, duracion, costo, fechaReg);
                manejadorActividad.agregarActividad(actividad);
            } else {
                System.out.println("Ya existe una  actividad con ese nombre (santi arregla esto)");
                // Manejar el caso de actividad duplicada
            }
        } catch (Exception errorException) {
            System.out.println("Catch addActividad: " + errorException);
            String errorMessage = extractErrorMessage(errorException.getMessage());
            JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void modificarActividad(String nombre, String nuevaDescripcion, int nuevaDuracion, float nuevoCosto) {
        ActividadDeportiva actividad = manejadorActividad.obtenerActividadPorNombre(nombre);
        if (actividad != null) {
            actividad.setDescripcion(nuevaDescripcion);
            actividad.setDuracion(nuevaDuracion);
            actividad.setCosto(nuevoCosto);
            manejadorActividad.actualizarActividad(actividad);
        } else {
            // Manejar la actividad no encontrada
        }
    }

    @Override
    public void cancelarAltaActividad(String nombre) {
        ActividadDeportiva actividad = manejadorActividad.obtenerActividadPorNombre(nombre);
        if (actividad != null) {
            manejadorActividad.eliminarActividad(actividad);
        } else {
            // Manejar la actividad no encontrada
        }
    }

    private boolean validateActivityData(String nombre) {
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("project_pap");
        EntityManager entityManager = emFactory.createEntityManager();

        try {
            TypedQuery<ActividadDeportiva> query = entityManager.createQuery(
                    "SELECT a FROM ActividadDeportiva a WHERE a.nombre = :nombre",
                    ActividadDeportiva.class);
            query.setParameter("nombre", nombre);

            if (query.getResultList().isEmpty()) {
                return true;
            } else {
                // Manejar actividad duplicada
                return false;
            }
        } finally {
            entityManager.close();
            emFactory.close();
        }
    }

    private String extractErrorMessage(String fullErrorMessage) {
        int startIndex = fullErrorMessage.indexOf(":") + 1; // Encuentra la posición después del primer ":"

        return startIndex > 0 && startIndex < fullErrorMessage.length() ? fullErrorMessage.substring(startIndex).trim()
                : fullErrorMessage;
    }
}
