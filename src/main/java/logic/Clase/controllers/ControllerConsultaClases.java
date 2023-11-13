package logic.Clase.controllers;

import logic.ActividadDeportiva.ActividadDeportiva;
import logic.Clase.Clase;
import logic.Clase.ManejadorClases;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.List;

public class ControllerConsultaClases implements IControllerConsultaClases {

    private ManejadorClases manejadorClases;
    private EntityManager entityManager;

    public ControllerConsultaClases() {
        manejadorClases = new ManejadorClases();
        entityManager = Persistence.createEntityManagerFactory("project_pap").createEntityManager();
    }

    public List<ActividadDeportiva> obtenerActividadesPorInstitucion(String nombreInstitucion) {
        try {
            entityManager.getTransaction().begin();

            List<ActividadDeportiva> actividades = entityManager.createQuery(
                    "SELECT a FROM ActividadDeportiva a WHERE a.institucion.nombre = :nombreInstitucion",
                    ActividadDeportiva.class)
                    .setParameter("nombreInstitucion", nombreInstitucion)
                    .getResultList();

            entityManager.getTransaction().commit();
            return actividades;
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            System.out.println("Catch obtenerActividadesPorInstitucion: " + e);
            return null;
        } finally {
            entityManager.close();
        }
    }

    public List<Clase> obtenerClasesPorActividad(ActividadDeportiva actividad) {
        try {
            entityManager.getTransaction().begin();

            List<Clase> clases = actividad.getClases();

            entityManager.getTransaction().commit();
            return clases;
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            System.out.println("Error " + e);
            return null;
        } finally {
            entityManager.close();
        }
    }

    public Clase obtenerClasePorNombre(String nombreClase) {
        return manejadorClases.getClaseByNombre(nombreClase);
    }
}
