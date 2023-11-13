package logic.Institucion;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import logic.ActividadDeportiva.ActividadDeportiva;

public class ManejadorInstitucion {
    private static final EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("project_pap");

    public void agregarInstitucion(InstitucionDeportiva institucion) {
        EntityManager entityManager = emFactory.createEntityManager();
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
        }
    }

    public void actualizarInstitucion(InstitucionDeportiva institucion) {
        EntityManager entityManager = emFactory.createEntityManager();
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
        }
    }

    public List<InstitucionDeportiva> getInstituciones() {
        EntityManager entityManager = emFactory.createEntityManager();

        try {
            return entityManager.createQuery("SELECT e FROM InstitucionDeportiva e", InstitucionDeportiva.class)
                    .getResultList();
        } finally {
            entityManager.close();
        }
    }

   public InstitucionDeportiva getInstitucionesByName(String nombre) {
    EntityManager entityManager = emFactory.createEntityManager();

    try {
        return entityManager.find(InstitucionDeportiva.class, nombre);
    } catch (Exception e) {
        e.printStackTrace();
        // Puedes manejar la excepción según tus necesidades, como lanzar una excepción personalizada o registrar el error.
         System.out.println("error en el get instituciones by name");
        return null; // O devuelve algún valor por defecto en caso de error.
       
    } finally {
        entityManager.close();
    }
}


    public void agregarActividadI(ActividadDeportiva actividad, String nombrei) {
        EntityManager entityManager = emFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            InstitucionDeportiva institucion = getInstitucionesByName(nombrei);
            institucion.getActividades().add(actividad);
            entityManager.merge(institucion);  // No es necesario persistir nuevamente
            transaction.commit();
        } catch (Exception exceptionAgregarActividad) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            System.out.println("Catch agregarActividadI: " + exceptionAgregarActividad);
            System.out.println("ERROR");
        } finally {
            entityManager.close();
        }
    }

    public List<ActividadDeportiva> getActividades() {
        EntityManager entityManager = emFactory.createEntityManager();

        try {
            return entityManager.createQuery("SELECT a FROM ActividadDeportiva a", ActividadDeportiva.class)
                    .getResultList();
        } finally {
            entityManager.close();
        }
    }
}
