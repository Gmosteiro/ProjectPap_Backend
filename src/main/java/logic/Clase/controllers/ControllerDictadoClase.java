package logic.Clase.controllers;

import logic.ActividadDeportiva.ActividadDeportiva;
import logic.ActividadDeportiva.ManejadorActividad;
import logic.Institucion.InstitucionDeportiva;
import logic.Institucion.ManejadorInstitucion;
import logic.Clase.Clase;
import logic.Clase.ManejadorClases;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ControllerDictadoClase implements IControllerDictadoClase {
    private ManejadorInstitucion manejadorInstitucion;
    private ManejadorActividad manejadorActividad;
    private ManejadorClases manejadorClases;

    public ControllerDictadoClase() {
        manejadorInstitucion = new ManejadorInstitucion();
        manejadorActividad = new ManejadorActividad();
        manejadorClases = new ManejadorClases();

    }

    @Override
    public List<InstitucionDeportiva> getInstituciones() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");

        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            List<InstitucionDeportiva> instituciones = manejadorInstitucion.getInstituciones();
            return instituciones;

        } catch (Exception errorException) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            System.out.println("Catch getInstituciones: " + errorException);
            JOptionPane.showMessageDialog(null, extractErrorMessage(errorException.getMessage()), "Error",
                    JOptionPane.ERROR_MESSAGE);

            return null;

        } finally {
            entityManager.close();
            emf.close();
        }
    }

    @Override
    public List<ActividadDeportiva> getActividades() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");

        EntityManager entityManager = emf.createEntityManager();

        try {
            List<ActividadDeportiva> actividades = manejadorActividad.getActividades();
            return actividades;

        } catch (Exception errorException) {
            System.out.println("Catch getActividades: " + errorException);
            String errorMessage = extractErrorMessage(errorException.getMessage());
            JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);

            return new ArrayList<>();

        } finally {
            entityManager.close();
            emf.close();
        }
    }

    private String extractErrorMessage(String fullErrorMessage) {
        int startIndex = fullErrorMessage.indexOf(":") + 1;

        return startIndex > 0 && startIndex < fullErrorMessage.length() ? fullErrorMessage.substring(startIndex).trim()
                : fullErrorMessage;
    }

    public List<Clase> getClasesByActividad(String actividad) {
        List<Clase> clases = manejadorClases.getClasesByActividad(actividad);
        return clases;
    }

}
