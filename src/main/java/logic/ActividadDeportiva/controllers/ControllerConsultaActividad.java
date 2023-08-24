package logic.ActividadDeportiva.controllers;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import logic.ActividadDeportiva.ActividadDeportiva;
import logic.Clase.Clase;
import logic.Registro;

public class ControllerConsultaActividad implements IControllerConsultaActividad {

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

    public Clase obtenerClasePorNombre(String nombreClase) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();

            Clase clase = em.find(Clase.class, nombreClase);

            em.getTransaction().commit();

            return clase;
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