package logic.Clase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManejadorClases {
    static EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("project_pap");
    static EntityManager entityManager = emFactory.createEntityManager();

    public ManejadorClases() {
    }

    public void agregarClase(Clase clase) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(clase);
            entityManager.getTransaction().commit();
        } catch (Exception exceptionAgregarClase) {
            System.out.println("Catch agregarClase: " + exceptionAgregarClase);
            System.out.println("ERROR");
        }
    }

    public static List<Clase> getClasesByProfe(String profesor) {
        try {
            List<Clase> listClase;
            listClase = entityManager.createQuery(
                    "SELECT c FROM Clase c WHERE c.profesor = :profesor", Clase.class)
                    .setParameter("profesor", profesor)
                    .getResultList();
            return listClase;
        } catch (Exception e) {
            System.out.println("Error catch getClasesByProfe " + e);
            return null;
        }
    }

    public static List<Clase> getClasesByActividad(String nombreActividad) {
        try {
            List<Clase> listClase;
            listClase = entityManager.createQuery(
                    "SELECT c FROM Clase c WHERE c.ClaseACT = :nombreActividad", Clase.class)
                    .setParameter("nombreActividad", nombreActividad)
                    .getResultList();
            return listClase;
        } catch (Exception e) {
            System.out.println("Error catch getClasesByActividad " + e);
            return null;
        }
    }
}
