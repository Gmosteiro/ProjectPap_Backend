package logic.Clase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import logic.Usuario.Profesor;
import logic.Usuario.Socio;

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
            entityManager.close();
        } catch (Exception exceptionAgregarClase) {
            System.out.println("Catch agregarClase: " + exceptionAgregarClase);
            System.out.println("ERROR");
        }
    }

    public static List<Clase> getClasesByProfe(Profesor profesor) {
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

    public static List<Clase> getClasesBySocio(Socio socio) {
        try {
            List<Clase> resultList = entityManager.createQuery(
                    "SELECT c " +
                            "FROM Registro r " +
                            "INNER JOIN r.socio s " +
                            "INNER JOIN r.clase c " +
                            "WHERE s = :socio",
                    Clase.class)
                    .setParameter("socio", socio)
                    .getResultList();

            return resultList;
        } catch (Exception e) {
            System.out.println("Error catch getClasesBySocio " + e);
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

    public static List<Clase> getClasesByNombre(String nombreActividad) {
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

    public static Clase getClaseByNombre(String nombreClase) {
        try {
            entityManager.getTransaction().begin();

            Clase clase = entityManager.find(Clase.class, nombreClase);

            entityManager.getTransaction().commit();
            // entityManager.close();

            return clase;
        } catch (Exception e) {
            System.out.println("Error catch getClaseByNombre " + e);
            return null;
        }
    }

    public static List<Clase> getClases() {
        List<Clase> clases;

        clases = entityManager
                .createQuery("SELECT c FROM Clase c", Clase.class)
                .getResultList();

        return clases;
    }

}
