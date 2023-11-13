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

    private ManejadorActividad manejadorActividad;
    private ManejadorInstitucion manejadorInstitucion;
    private EntityManagerFactory emf;

    public ControllerAltaActividad() {
        manejadorActividad = new ManejadorActividad();
        manejadorInstitucion = new ManejadorInstitucion();
        emf = Persistence.createEntityManagerFactory("project_pap");

    }

    @Override
    public boolean altaActividad(String nombre, String descripcion, int duracion, float costo, LocalDate fechaReg,
            String img,
            String nombrei) {
        try {

            if (!validateActivityData(nombre)) {
                return false;
            } else {
                ActividadDeportiva actividad = new ActividadDeportiva(nombre, descripcion, duracion, costo, fechaReg,
                        img);

                manejadorInstitucion.agregarActividadI(actividad, nombrei);

                JOptionPane.showMessageDialog(
                        null,
                        "Actividad Creada!",
                        "Success",
                        JOptionPane.INFORMATION_MESSAGE);

                return true;
            }
        } catch (Exception errorException) {
            System.out.println("Catch addActividad: " + errorException);
            String errorMessage = extractErrorMessage(errorException.getMessage());
            JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
            return false;
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
        }

    }

    @Override
    public void cancelarAltaActividad(String nombre) {
        ActividadDeportiva actividad = manejadorActividad.obtenerActividadPorNombre(nombre);
        if (actividad == null) {
            return;
        } else {
            manejadorActividad.eliminarActividad(actividad);
        }
    }

    private boolean validateActivityData(String nombre) {

        EntityManager entityManager = emf.createEntityManager();

        try {

            TypedQuery<ActividadDeportiva> query = entityManager.createQuery(
                    "SELECT a FROM ActividadDeportiva a WHERE a.nombre = :nombre",
                    ActividadDeportiva.class);
            query.setParameter("nombre", nombre);

            if (query.getResultList().isEmpty()) {

                return true;
            } else {

                return false;
            }

        } catch (Exception e) {

            System.out.println("Catch validateActivityData: " + e);
            e.printStackTrace();
            return false;
        } finally {
            entityManager.close();
        }

    }

    @Override
    public List<InstitucionDeportiva> getInstituciones() {
        try {
            List<InstitucionDeportiva> instituciones = manejadorInstitucion.getInstituciones();
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
