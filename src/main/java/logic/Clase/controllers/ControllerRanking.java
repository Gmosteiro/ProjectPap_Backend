package logic.Clase.controllers;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import logic.ActividadDeportiva.ActividadDeportiva;
import logic.Clase.Clase;

public class ControllerRanking implements IControllerRanking {

    private EntityManagerFactory emf;

    public ControllerRanking() {
        emf = Persistence.createEntityManagerFactory("project_pap");
    }

    @Override
    public List<ActividadDeportiva> obtenerRankingDeActividades() {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();

            TypedQuery<ActividadDeportiva> query = em.createQuery(
                    "SELECT a " +
                            "FROM ActividadDeportiva a " +
                            "LEFT JOIN a.Clases ac " +
                            "GROUP BY a " +
                            "ORDER BY COUNT(ac) DESC",
                    ActividadDeportiva.class);

            List<ActividadDeportiva> resultados = query.getResultList();

            em.getTransaction().commit();

            return resultados;
        } finally {
            em.close();
        }
    }

    @Override
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

    @Override
    public List<Clase> obtenerRankingDeClases() {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            String jpqlQuery = "SELECT c " +
                    "FROM Clase c " +
                    "INNER JOIN Registro r ON c.nombre = r.clase " +
                    "GROUP BY c.nombre " +
                    "ORDER BY COUNT(r.id) DESC";

            TypedQuery<Clase> query = em.createQuery(jpqlQuery, Clase.class);
            List<Clase> resultados = query.getResultList();
            em.getTransaction().commit();
            return resultados;
        } finally {
            em.close();
        }
    }

    @Override
    public void closeEntityManagerFactory() {
        emf.close();
    }
}