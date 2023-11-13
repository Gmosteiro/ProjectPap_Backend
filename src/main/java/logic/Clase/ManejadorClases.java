package logic.Clase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import logic.Usuario.Profesor;
import logic.Usuario.Socio;

public class ManejadorClases {
    private EntityManager entityManager;

    public ManejadorClases() {
    }

    private void beginTransaction() {
        entityManager = Persistence.createEntityManagerFactory("project_pap").createEntityManager();
        entityManager.getTransaction().begin();
    }

    private void commitTransaction() {
        entityManager.getTransaction().commit();
    }

    private void rollbackTransaction() {
        if (entityManager.getTransaction() != null && entityManager.getTransaction().isActive()) {
            entityManager.getTransaction().rollback();
        }
    }

    private void closeEntityManager() {
        if (entityManager != null && entityManager.isOpen()) {
            entityManager.close();
        }
    }

    public void agregarClase(Clase clase) {
        try {
            beginTransaction();
            entityManager.persist(clase);
            commitTransaction();
        } catch (Exception exceptionAgregarClase) {
            rollbackTransaction();
            System.out.println("Catch agregarClase: " + exceptionAgregarClase);
        } finally {
            closeEntityManager();
        }
    }

    public List<Clase> getClasesByProfe(Profesor profesor) {
        try {
            beginTransaction();
            TypedQuery<Clase> query = entityManager.createQuery(
                    "SELECT c FROM Clase c WHERE c.profesor = :profesor", Clase.class);
            query.setParameter("profesor", profesor);

            List<Clase> listClase = query.getResultList();
            commitTransaction();
            return listClase;
        } catch (Exception e) {
            rollbackTransaction();
            System.out.println("Error catch getClasesByProfe " + e);
            return null;
        } finally {
            closeEntityManager();
        }
    }

    public List<Clase> getClasesBySocio(Socio socio) {
        try {
            beginTransaction();
            TypedQuery<Clase> query = entityManager.createQuery(
                    "SELECT r.clase FROM Registro r WHERE r.socio = :socio", Clase.class);
            query.setParameter("socio", socio);

            List<Clase> resultList = query.getResultList();
            commitTransaction();
            return resultList;
        } catch (Exception e) {
            rollbackTransaction();
            System.out.println("Error catch getClasesBySocio " + e);
            return null;
        } finally {
            closeEntityManager();
        }
    }

    public List<Clase> getClasesByActividad(String nombreActividad) {
        try {
            beginTransaction();
            TypedQuery<Clase> query = entityManager.createQuery(
                    "SELECT c FROM Clase c WHERE c.actividad.nombre = :nombreActividad", Clase.class);
            query.setParameter("nombreActividad", nombreActividad);

            List<Clase> listClase = query.getResultList();
            commitTransaction();
            return listClase;
        } catch (Exception e) {
            rollbackTransaction();
            System.out.println("Error catch getClasesByActividad " + e);
            return null;
        } finally {
            closeEntityManager();
        }
    }

    public List<Clase> getClasesByNombre(String nombreClase) {
        try {
            beginTransaction();
            TypedQuery<Clase> query = entityManager.createQuery(
                    "SELECT c FROM Clase c WHERE c.nombre = :nombreClase", Clase.class);
            query.setParameter("nombreClase", nombreClase);

            List<Clase> listClase = query.getResultList();
            commitTransaction();
            return listClase;
        } catch (Exception e) {
            rollbackTransaction();
            System.out.println("Error catch getClasesByNombre " + e);
            return null;
        } finally {
            closeEntityManager();
        }
    }

    public Clase getClaseByNombre(String nombreClase) {
        try {
            beginTransaction();
            Clase clase = entityManager.find(Clase.class, nombreClase);
            commitTransaction();
            return clase;
        } catch (Exception e) {
            rollbackTransaction();
            System.out.println("Error catch getClaseByNombre " + e);
            return null;
        } finally {
            closeEntityManager();
        }
    }

    public List<Clase> getClases() {
        try {
            beginTransaction();
            TypedQuery<Clase> query = entityManager.createQuery("SELECT c FROM Clase c", Clase.class);
            List<Clase> clases = query.getResultList();
            commitTransaction();
            return clases;
        } catch (Exception e) {
            rollbackTransaction();
            System.out.println("Error catch getClases " + e);
            return null;
        } finally {
            closeEntityManager();
        }
    }
}
