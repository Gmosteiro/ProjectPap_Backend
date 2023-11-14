package logic.Clase.controllers;

import logic.ActividadDeportiva.ActividadDeportiva;
import logic.Clase.Clase;
import logic.Clase.ManejadorClases;

import java.util.List;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class ControllerConsultaClases implements IControllerConsultaClases {

    private ManejadorClases manejadorClases;

    public ControllerConsultaClases() {
        manejadorClases = new ManejadorClases();

    }

    public List<ActividadDeportiva> obtenerActividadesPorInstitucion(String nombreInstitucion) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");

        EntityManager entityManager = emf.createEntityManager();
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
            emf.close();
        }
    }

    public List<Clase> obtenerClasesPorActividad(ActividadDeportiva actividad) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");

        EntityManager entityManager = emf.createEntityManager();
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
            emf.close();
        }
    }

    public Clase obtenerClasePorNombre(String nombreClase) {
        return manejadorClases.getClaseByNombre(nombreClase);
    }
}
