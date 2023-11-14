package logic.Institucion;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import logic.ActividadDeportiva.ActividadDeportiva;

public class ManejadorInstitucion {

    public void agregarInstitucion(InstitucionDeportiva institucion) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");

        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            entityManager.persist(institucion);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            entityManager.close();
            emf.close();
        }
    }

    public void actualizarInstitucion(InstitucionDeportiva institucion) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");

        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            entityManager.merge(institucion);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            entityManager.close();
            emf.close();
        }
    }

    public List<InstitucionDeportiva> getInstituciones() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");

        EntityManager entityManager = emf.createEntityManager();

        try {
            return entityManager.createQuery("SELECT e FROM InstitucionDeportiva e", InstitucionDeportiva.class)
                    .getResultList();
        } finally {
            entityManager.close();
            emf.close();
        }
    }

    public InstitucionDeportiva getInstitucionesByName(String nombre) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");

        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = null;
        InstitucionDeportiva institucion = null;

        try {
            transaction = entityManager.getTransaction();
            transaction.begin();
            institucion = entityManager.find(InstitucionDeportiva.class, nombre);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
            // Manejo de excepciones según sea necesario
            System.out.println("Error en la búsqueda de instituciones por nombre");
        } finally {
            entityManager.close();
            emf.close();
        }

        return institucion;
    }

    public void agregarActividadI(ActividadDeportiva actividad, String nombrei) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");

        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            InstitucionDeportiva institucion = getInstitucionesByName(nombrei);
            institucion.getActividades().add(actividad);
            entityManager.merge(institucion); // No es necesario persistir nuevamente
            transaction.commit();
        } catch (Exception exceptionAgregarActividad) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            System.out.println("Catch agregarActividadI: " + exceptionAgregarActividad);
            System.out.println("ERROR");
        } finally {
            entityManager.close();
            emf.close();
        }
    }

    public List<ActividadDeportiva> getActividades() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");

        EntityManager entityManager = emf.createEntityManager();

        try {
            return entityManager.createQuery("SELECT a FROM ActividadDeportiva a", ActividadDeportiva.class)
                    .getResultList();
        } finally {
            entityManager.close();
            emf.close();
        }
    }
}
