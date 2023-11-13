package logic.Clase.controllers;

import logic.ActividadDeportiva.ActividadDeportiva;
import logic.Clase.Clase;
import logic.Clase.ManejadorClases;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
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
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();

            List<ActividadDeportiva> actividades = entityManager.createQuery(
                    "SELECT a FROM ActividadDeportiva a WHERE a.institucion.nombre = :nombreInstitucion",
                    ActividadDeportiva.class)
                    .setParameter("nombreInstitucion", nombreInstitucion)
                    .getResultList();

            transaction.commit();
            return actividades;
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            System.out.println("Catch obtenerActividadesPorInstitucion: " + e);
            return null;
        } finally {
            entityManager.close();
        }
    }

    public List<Clase> obtenerClasesPorActividad(ActividadDeportiva actividad) {
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();

            List<Clase> clases = actividad.getClases();

            transaction.commit();
            return clases;
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
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
