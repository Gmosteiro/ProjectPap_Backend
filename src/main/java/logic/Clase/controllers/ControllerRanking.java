package logic.Clase.controllers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;

import logic.ActividadDeportiva.ActividadDeportiva;
import logic.Clase.Clase;

public class ControllerRanking implements IControllerRanking {

    private EntityManagerFactory emf;

    public ControllerRanking() {
        emf = Persistence.createEntityManagerFactory("project_pap");

    }

    @Override
    public List<ActividadDeportiva> obtenerRankingDeActividades() {
        EntityManager entityManager = emf.createEntityManager();

        try {

            List<ActividadDeportiva> resultados = entityManager.createQuery(
                    "SELECT a " +
                            "FROM ActividadDeportiva a " +
                            "LEFT JOIN a.Clases ac " +
                            "GROUP BY a " +
                            "ORDER BY COUNT(ac) DESC",
                    ActividadDeportiva.class).getResultList();

            return resultados;

        } catch (Exception e) {

            System.out.println("Catch obtenerRankingDeActividades: " + e);
            e.printStackTrace();
            return null;
        } finally {
            entityManager.close();
        }

    }

    @Override
    public ActividadDeportiva obtenerActividadPorNombre(String nombreActividad) {

        EntityManager entityManager = emf.createEntityManager();

        try {

            ActividadDeportiva actividad = entityManager.find(ActividadDeportiva.class,
                    nombreActividad);

            return actividad;
        } catch (Exception e) {

            System.out.println("Catch obtenerActividadPorNombre: " + e);
            e.printStackTrace();
            return null;
        } finally {
            entityManager.close();
        }

    }

    @Override
    public List<Clase> obtenerRankingDeClases() {

        EntityManager entityManager = emf.createEntityManager();

        try {

            String query = "SELECT c " +
                    "FROM Clase c " +
                    "INNER JOIN Registro r ON c.nombre = r.clase " +
                    "GROUP BY c.nombre " +
                    "ORDER BY COUNT(r.id) DESC";

            List<Clase> resultados = entityManager.createQuery(query, Clase.class)
                    .getResultList();

            return resultados;
        } catch (Exception e) {

            System.out.println("Catch obtenerRankingDeClases: " + e);
            e.printStackTrace();
            return null;
        } finally {
            entityManager.close();
        }

    }

}