package logic.ActividadDeportiva.controllers;

import logic.ActividadDeportiva.ActividadDeportiva;
import logic.ActividadDeportiva.ManejadorActividad;
import logic.Institucion.InstitucionDeportiva;
import logic.Institucion.ManejadorInstitucion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
    public boolean altaActividad(String nombre, String descripcion, int duracion, float costo, LocalDate fechaReg, String img,
            String nombrei) {
        try {

            if (validateActivityData(nombre)) {
                ActividadDeportiva actividad = new ActividadDeportiva(nombre, descripcion, duracion, costo, fechaReg, img);
                ManejadorInstitucion manejadorI = new ManejadorInstitucion();
                manejadorI.agregarActividadI(actividad, nombrei);
                System.out.println("Actividad Creada");
                JOptionPane.showMessageDialog(
                        null, // Parent component (null for default)
                        "Actividad Creada!", // Message text
                        "Success", // Dialog title
                        JOptionPane.INFORMATION_MESSAGE // Message type merecuetengue dijo el juan
                );
            } else {
                // Manejar el caso de actividad duplicada
            }
        } catch (Exception errorException) {
            System.out.println("Catch addActividad: " + errorException);
            String errorMessage = extractErrorMessage(errorException.getMessage());
            JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return false;
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

    @Override
    public List<InstitucionDeportiva> getInstituciones() {
        try {
            List<InstitucionDeportiva> instituciones = ManejadorInstitucion.getInstituciones();
            return instituciones;

        } catch (Exception errorException) {
            System.out.println("Catch getInstituciones: " + errorException);
            String errorMessage = extractErrorMessage(errorException.getMessage());
            JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);

            return new ArrayList<>();

        }
    }

    private String extractErrorMessage(String fullErrorMessage) {
        int startIndex = fullErrorMessage.indexOf(":") + 1; // Encuentra la posición después del primer ":"

        return startIndex > 0 && startIndex < fullErrorMessage.length() ? fullErrorMessage.substring(startIndex).trim()
                : fullErrorMessage;
    }
}
