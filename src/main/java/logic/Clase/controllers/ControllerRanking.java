package logic.Clase.controllers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

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
        EntityTransaction transaction = entityManager.getTransaction();

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
            if (transaction != null && transaction.isActive()) {
               transaction.rollback();
               }
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
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            ActividadDeportiva actividad = entityManager.find(ActividadDeportiva.class,
                    nombreActividad);
            transaction.commit();
            return actividad;
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
            transaction.rollback();
            }
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
        EntityTransaction transaction = entityManager.getTransaction();

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
            if (transaction != null && transaction.isActive()) {
            transaction.rollback();
            }
            System.out.println("Catch obtenerRankingDeClases: " + e);
            e.printStackTrace();
            return null;
        } finally {
            entityManager.close();
        }

    }
}