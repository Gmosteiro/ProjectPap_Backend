package logic.Institucion;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import logic.ActividadDeportiva.ActividadDeportiva;

public class ManejadorInstitucion {
    private static EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("project_pap");
    private static EntityManager entityManager = emFactory.createEntityManager();

    public ManejadorInstitucion() {
    }

    public void agregarInstitucion(InstitucionDeportiva institucion) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(institucion);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            entityManager.close();
            emFactory.close();
        }
    }

    public void actualizarInstitucion(InstitucionDeportiva institucion) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(institucion);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public EntityManagerFactory getEntityManagerFactory() {
        return emFactory;
    }

    public static List<InstitucionDeportiva> getInstituciones() {
        try {
            return entityManager.createQuery("SELECT e FROM InstitucionDeportiva e", InstitucionDeportiva.class)
                    .getResultList();
        } finally {
            entityManager.close();
            emFactory.close();
        }
    }

    public static InstitucionDeportiva getInstitucionesByName(String nombre) {
        try {
            return entityManager.find(InstitucionDeportiva.class, nombre);
        } finally {
            entityManager.close();
            emFactory.close();
        }
    }

    public void agregarActividadI(ActividadDeportiva actividad, String nombrei) {
        try {
            entityManager.getTransaction().begin();
            InstitucionDeportiva institucion = getInstitucionesByName(nombrei);
            institucion.getActividades().add(actividad);
            entityManager.persist(institucion);
            entityManager.getTransaction().commit();
        } catch (Exception exceptionAgregarClase) {
            entityManager.getTransaction().rollback();
            System.out.println("Catch agregarActividadI: " + exceptionAgregarClase);
            System.out.println("ERROR");
        } finally {
            entityManager.close();
        }
    }

    public List<ActividadDeportiva> getActividades() {
        try {
            return getActividades();
        } finally {
            entityManager.close();
            emFactory.close();
        }
    }
}
