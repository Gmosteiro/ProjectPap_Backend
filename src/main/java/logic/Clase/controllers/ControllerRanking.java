package logic.Clase.controllers;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import logic.Clase.Clase;

public class ControllerRanking {

    private EntityManagerFactory emf;

    public ControllerRanking() {
        emf = Persistence.createEntityManagerFactory("project_pap"); 
    }

    public List<Clase> obtenerRankingDeClases() {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();

            // Consulta para obtener el ranking de clases ordenado por cantidad de socios registrados
            Query query = em.createQuery(
                "SELECT c FROM Clase c ORDER BY SIZE(c.registros) DESC",
                Clase.class
            );

              List<Clase> ranking = query.getResultList();

            em.getTransaction().commit();

            return ranking;
        } finally {
            em.close();
        }
    }

    // Otros métodos relacionados con el ranking de clases

    public void closeEntityManagerFactory() {
        emf.close();
    }
}
