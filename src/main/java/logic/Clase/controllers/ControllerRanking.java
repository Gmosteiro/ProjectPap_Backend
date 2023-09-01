package logic.Clase.controllers;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import logic.ActividadDeportiva.ActividadDeportiva;

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
                    "SELECT a.nombre, a.descripcion, a.duracion, a.costo, COUNT(ac.clase_nombre) AS cantidad_clases " +
                            "FROM ActividadDeportiva a " +
                            "LEFT JOIN a.clases ac " +
                            "GROUP BY a.nombre, a.descripcion, a.duracion, a.costo " +
                            "ORDER BY COUNT(ac.clase_nombre) DESC",
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
    public void closeEntityManagerFactory() {
        emf.close();
    }
}