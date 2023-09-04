package logic.ActividadDeportiva.controllers;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import logic.ActividadDeportiva.ActividadDeportiva;
import logic.Clase.Clase;
import logic.Institucion.InstitucionDeportiva;
import logic.Usuario.Profesor;
import logic.Usuario.Registro;

public class ControllerConsultaActividad implements IControllerConsultaActividad {
    private static EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("project_pap");
    private static EntityManager entityManager = emFactory.createEntityManager();

    private EntityManagerFactory emf;

    public ControllerConsultaActividad() {
        emf = Persistence.createEntityManagerFactory("project_pap");
    }

    public List<ActividadDeportiva> obtenerActividadesPorInstitucion(String nombreInstitucion) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();

            Query query = em.createQuery(
                    "SELECT a FROM ActividadDeportiva a WHERE a.institucion.nombre = :nombreInstitucion",
                    ActividadDeportiva.class);
            query.setParameter("nombreInstitucion", nombreInstitucion);

            final List<ActividadDeportiva> actividades = query.getResultList();

            em.getTransaction().commit();

            return actividades;
        } finally {
            em.close();
        }
    }

    public List<ActividadDeportiva> getActividadesByProfe(Profesor profesor) {

        try {
            List<ActividadDeportiva> resultList = entityManager.createQuery(
                    "SELECT a " +
                            "FROM ActividadDeportiva a " +
                            "INNER JOIN a.Clases c " +
                            "INNER JOIN c.profesor p " +
                            "WHERE p = :profesor",
                    ActividadDeportiva.class)
                    .setParameter("profesor", profesor)
                    .getResultList();

            return resultList;
        } catch (Exception e) {
            System.out.println("Error catch getClasesByProfe " + e);
            return null;
        }

    }

    public List<ActividadDeportiva> getActividadesByInstitucion(InstitucionDeportiva institucion) {

        try {
            return institucion.getActividades();
        } catch (Exception e) {
            System.out.println("Error catch getActividadesByInstitucionDeportiva " + e);
            return null;
        }
    }

    public ActividadDeportiva obtenerActividadPorNombre(String nombreActividad) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();

            ActividadDeportiva actividad = em.find(ActividadDeportiva.class, nombreActividad);

            em.getTransaction().commit();

            return actividad;
        } finally {
            em.close();
        }
    }

    public List<ActividadDeportiva> getActividades() {

        List<ActividadDeportiva> actividades;

        actividades = entityManager
                .createQuery("SELECT a FROM ActividadDeportiva a", ActividadDeportiva.class).getResultList();

        return actividades;
    }

    public List<Clase> obtenerClasesPorActividad(ActividadDeportiva actividad) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();

            TypedQuery<Clase> query = em.createQuery(
                    "SELECT c FROM Clase c WHERE c.actividad = :actividad",
                    Clase.class);
            query.setParameter("actividad", actividad);

            List<Clase> clases = query.getResultList();

            em.getTransaction().commit();

            return clases;
        } finally {
            em.close();
        }
    }

    public List<Registro> obtenerRegistrosPorClase(Clase clase) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();

            Query query = em.createQuery(
                    "SELECT r FROM Registro r WHERE r.clase = :clase",
                    Registro.class);
            query.setParameter("clase", clase);

            final List<Registro> registros = query.getResultList();

            em.getTransaction().commit();

            return registros;
        } finally {
            em.close();
        }
    }

    public void closeEntityManagerFactory() {
        emf.close();
    }
}