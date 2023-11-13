package logic.ActividadDeportiva.controllers;

import logic.ActividadDeportiva.ActividadDeportiva;
import logic.ActividadDeportiva.ManejadorActividad;
import logic.Institucion.InstitucionDeportiva;
import logic.Institucion.ManejadorInstitucion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
                                 String img, String nombrei) {
        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();

            if (!validateActivityData(entityManager, nombre)) {
                return false;
            } else {
                ActividadDeportiva actividad = new ActividadDeportiva(nombre, descripcion, duracion, costo, fechaReg, img);

                manejadorInstitucion.agregarActividadI(actividad, nombrei);

                JOptionPane.showMessageDialog(
                        null,
                        "Actividad Creada!",
                        "Success",
                        JOptionPane.INFORMATION_MESSAGE);

                transaction.commit();
                return true;
            }
        } catch (Exception errorException) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            System.out.println("Catch altaActividad: " + errorException);
            String errorMessage = extractErrorMessage(errorException.getMessage());
            JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            entityManager.close();
        }
    }

    @Override
    public void modificarActividad(String nombre, String nuevaDescripcion, int nuevaDuracion, float nuevoCosto) {
        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            ActividadDeportiva actividad = manejadorActividad.obtenerActividadPorNombre(nombre);

            if (actividad != null) {
                actividad.setDescripcion(nuevaDescripcion);
                actividad.setDuracion(nuevaDuracion);
                actividad.setCosto(nuevoCosto);
                manejadorActividad.actualizarActividad(actividad);
            }

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            System.out.println("Catch modificarActividad: " + e);
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }

    @Override
    public void cancelarAltaActividad(String nombre) {
        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            ActividadDeportiva actividad = manejadorActividad.obtenerActividadPorNombre(nombre);

            if (actividad != null) {
                manejadorActividad.eliminarActividad(actividad);
            }

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            System.out.println("Catch cancelarAltaActividad: " + e);
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }

    private boolean validateActivityData(EntityManager entityManager, String nombre) {
        try {
            TypedQuery<ActividadDeportiva> query = entityManager.createQuery(
                    "SELECT a FROM ActividadDeportiva a WHERE a.nombre = :nombre",
                    ActividadDeportiva.class);
            query.setParameter("nombre", nombre);

            if (query.getResultList().isEmpty()) {
                return true;
            } else {
                String errorMessage = "Ya existe una Actividad con ese nombre";
                JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (Exception e) {
            System.out.println("Catch validateActivityData: " + e);
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<InstitucionDeportiva> getInstituciones() {
        EntityManager entityManager = emf.createEntityManager();

        try {
            List<InstitucionDeportiva> instituciones = manejadorInstitucion.getInstituciones();
            return instituciones;

        } catch (Exception errorException) {
            System.out.println("Catch getInstituciones: " + errorException);
            String errorMessage = extractErrorMessage(errorException.getMessage());
            JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);

            return new ArrayList<>();

        } finally {
            entityManager.close();
        }
    }

    private String extractErrorMessage(String fullErrorMessage) {
        int startIndex = fullErrorMessage.indexOf(":") + 1;

        return startIndex > 0 && startIndex < fullErrorMessage.length() ? fullErrorMessage.substring(startIndex).trim()
                : fullErrorMessage;
    }
}
