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

    private EntityManagerFactory emf;

    public ManejadorClases() {
        emf = Persistence.createEntityManagerFactory("project_pap");

    }

    public void agregarClase(Clase clase) {
        EntityManager entityManager = emf.createEntityManager();
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
        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            TypedQuery<Clase> query = entityManager.createQuery(
                    "SELECT c FROM Clase c WHERE c.profesor = :profesor", Clase.class);
            query.setParameter("profesor", profesor);

            List<Clase> listClase = query.getResultList();
            transaction.commit();
            return listClase;
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();

            }
            System.out.println("Catch agregarClase: " + e);
            e.printStackTrace();
            return null;

        } finally {
            entityManager.close();
        }
    }

    public List<Clase> getClasesBySocio(Socio socio) {
        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();

            TypedQuery<Clase> query = entityManager.createQuery(
                    "SELECT r.clase FROM Registro r WHERE r.socio = :socio", Clase.class);
            query.setParameter("socio", socio);

            List<Clase> resultList = query.getResultList();
            transaction.commit();
            return resultList;
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            return null;
        } finally {
            entityManager.close();
        }
    }

    public List<Clase> getClasesByActividad(String nombreActividad) {
        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();

            TypedQuery<Clase> query = entityManager.createQuery(
                    "SELECT c FROM Clase c WHERE c.actividad.nombre = :nombreActividad", Clase.class);
            query.setParameter("nombreActividad", nombreActividad);

            List<Clase> listClase = query.getResultList();
            transaction.commit();

            return listClase;
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
            transaction.rollback();
            }
            System.out.println("Error catch getClasesByActividad " + e);
            return null;
        } finally {
            entityManager.close();

        }
    }

    public List<Clase> getClasesByNombre(String nombreClase) {
        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();

            TypedQuery<Clase> query = entityManager.createQuery(
                    "SELECT c FROM Clase c WHERE c.nombre = :nombreClase", Clase.class);
            query.setParameter("nombreClase", nombreClase);

            List<Clase> listClase = query.getResultList();
            transaction.commit();

            return listClase;
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
            transaction.rollback();
            }

            System.out.println("Error catch getClasesByNombre " + e);
            return null;
        } finally {
            entityManager.close();

        }
    }

    public Clase getClaseByNombre(String nombreClase) {
        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();

            Clase clase = entityManager.find(Clase.class, nombreClase);
            transaction.commit();

            return clase;
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
            transaction.rollback();
            }

            System.out.println("Error catch getClaseByNombre " + e);
            return null;
        } finally {
            entityManager.close();

        }
    }

    public List<Clase> getClases() {
        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();

            TypedQuery<Clase> query = entityManager.createQuery("SELECT c FROM Clase c", Clase.class);
            List<Clase> clases = query.getResultList();
            transaction.commit();

            return clases;
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
            transaction.rollback();
            }
            System.out.println("Error catch getClases " + e);
            return null;
        } finally {
            entityManager.close();

        }
    }
}
