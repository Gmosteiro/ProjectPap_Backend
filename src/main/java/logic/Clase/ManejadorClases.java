package logic.Clase;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import logic.Usuario.Profesor;
import logic.Usuario.Socio;

public class ManejadorClases {

    private static final EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("project_pap");

    public void agregarClase(Clase clase) {
        EntityManager entityManager = emFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            entityManager.persist(clase);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            System.out.println("Catch agregarClase: " + e);
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }

    public List<Clase> getClasesByProfe(Profesor profesor) {
        EntityManager entityManager = emFactory.createEntityManager();

        try {
            return entityManager.createQuery(
                    "SELECT c FROM Clase c WHERE c.profesor = :profesor", Clase.class)
                    .setParameter("profesor", profesor)
                    .getResultList();
        } catch (Exception e) {
            System.out.println("Catch getClasesByProfe: " + e);
            e.printStackTrace();
            return null;
        } finally {
            entityManager.close();
        }
    }

    public List<Clase> getClasesBySocio(Socio socio) {
        EntityManager entityManager = emFactory.createEntityManager();

        try {
            return entityManager.createQuery(
                    "SELECT r.clase FROM Registro r WHERE r.socio = :socio", Clase.class)
                    .setParameter("socio", socio)
                    .getResultList();
        } catch (Exception e) {
            System.out.println("Catch getClasesBySocio: " + e);
            e.printStackTrace();
            return null;
        } finally {
            entityManager.close();
        }
    }

    public List<Clase> getClasesByActividad(String nombreActividad) {
        EntityManager entityManager = emFactory.createEntityManager();

        try {
            return entityManager.createQuery(
                    "SELECT c FROM Clase c WHERE c.actividad.nombre = :nombreActividad", Clase.class)
                    .setParameter("nombreActividad", nombreActividad)
                    .getResultList();
        } catch (Exception e) {
            System.out.println("Catch getClasesByActividad: " + e);
            e.printStackTrace();
            return null;
        } finally {
            entityManager.close();
        }
    }

    public List<Clase> getClasesByNombre(String nombreClase) {
        EntityManager entityManager = emFactory.createEntityManager();

        try {
            return entityManager.createQuery(
                    "SELECT c FROM Clase c WHERE c.nombre = :nombreClase", Clase.class)
                    .setParameter("nombreClase", nombreClase)
                    .getResultList();
        } catch (Exception e) {
            System.out.println("Catch getClasesByNombre: " + e);
            e.printStackTrace();
            return null;
        } finally {
            entityManager.close();
        }
    }

    public Clase getClaseByNombre(String nombreClase) {
        EntityManager entityManager = emFactory.createEntityManager();

        try {
            return entityManager.find(Clase.class, nombreClase);
        } catch (Exception e) {
            System.out.println("Catch getClaseByNombre: " + e);
            e.printStackTrace();
            return null;
        } finally {
            entityManager.close();
        }
    }

    public List<Clase> getClases() {
        EntityManager entityManager = emFactory.createEntityManager();

        try {
            return entityManager.createQuery("SELECT c FROM Clase c", Clase.class)
                    .getResultList();
        } catch (Exception e) {
            System.out.println("Catch getClases: " + e);
            e.printStackTrace();
            return null;
        } finally {
            entityManager.close();
        }
    }
}
