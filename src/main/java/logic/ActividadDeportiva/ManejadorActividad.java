package logic.ActividadDeportiva;

import javax.persistence.*;
import java.util.List;

import logic.Clase.Clase;
import logic.Institucion.InstitucionDeportiva;
import logic.Usuario.Profesor;

public class ManejadorActividad {

    public ManejadorActividad() {

    }

    public void agregarActividad(ActividadDeportiva actividad) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");

        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            entityManager.persist(actividad);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            System.out.println("Catch agregarActividad: " + e);
            e.printStackTrace();
        } finally {
            entityManager.close();
            emf.close();
        }
    }

    public void actualizarActividad(ActividadDeportiva actividad) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");

        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            entityManager.merge(actividad);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            System.out.println("Catch actualizarActividad: " + e);
            e.printStackTrace();
        } finally {
            entityManager.close();
            emf.close();
        }
    }

    public void eliminarActividad(ActividadDeportiva actividad) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");

        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            entityManager.remove(entityManager.contains(actividad) ? actividad : entityManager.merge(actividad));
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            System.out.println("Catch eliminarActividad: " + e);
            e.printStackTrace();
        } finally {
            entityManager.close();
            emf.close();
        }
    }

    public ActividadDeportiva obtenerActividadPorNombre(String nombre) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");

        EntityManager entityManager = emf.createEntityManager();

        try {
            return entityManager.find(ActividadDeportiva.class, nombre);
        } catch (Exception e) {
            System.out.println("Catch obtenerActividadPorNombre: " + e);
            e.printStackTrace();
            return null;
        } finally {
            entityManager.close();
            emf.close();
        }
    }

    // public void agregarClaseA(Clase clase, String nombreActividad) {
    // EntityManagerFactory emf =
    // Persistence.createEntityManagerFactory("project_pap");
    // EntityManager entityManager = emf.createEntityManager();
    // EntityTransaction transaction = entityManager.getTransaction();

    // try {
    // transaction.begin();
    // ActividadDeportiva actividad = obtenerActividadPorNombre(nombreActividad);
    // actividad.getClases().add(clase);
    // entityManager.merge(actividad);
    // transaction.commit();
    // } catch (Exception e) {
    // if (transaction != null && transaction.isActive()) {
    // transaction.rollback();
    // }
    // System.out.println("Catch agregarClaseA: " + e);
    // e.printStackTrace();
    // } finally {
    // entityManager.close();
    // emf.close();
    // }
    // }

    public void agregarClaseA(Clase clase, String actividad) {
        try {

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");
            EntityManager entityManager = emf.createEntityManager();
            ActividadDeportiva Actividad = obtenerActividadPorNombre(actividad);
            Actividad.getClases().add(clase);
            entityManager.getTransaction().begin();
            entityManager.persist(Actividad);
            entityManager.getTransaction().commit();
            entityManager.close();
            emf.close();
        } catch (Exception exceptionAgregarClase) {
            System.out.println("Catch agregarClase: " + exceptionAgregarClase);
            System.out.println("ERROR");
        }
    }

    public List<ActividadDeportiva> getActividades() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");

        EntityManager entityManager = emf.createEntityManager();

        try {
            return entityManager.createQuery("SELECT a FROM ActividadDeportiva a", ActividadDeportiva.class)
                    .getResultList();
        } catch (Exception e) {
            System.out.println("Catch getActividades: " + e);
            e.printStackTrace();
            return null;
        } finally {
            entityManager.close();
            emf.close();
        }
    }

    public List<ActividadDeportiva> getActividadesByProfe(Profesor profesor) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");

        EntityManager entityManager = emf.createEntityManager();

        try {
            return entityManager.createQuery(
                    "SELECT a FROM ActividadDeportiva a INNER JOIN a.Clases c INNER JOIN c.profesor p WHERE p = :profesor",
                    ActividadDeportiva.class)
                    .setParameter("profesor", profesor)
                    .getResultList();
        } catch (Exception e) {
            System.out.println("Catch getActividadesByProfe: " + e);
            e.printStackTrace();
            return null;
        } finally {
            entityManager.close();
            emf.close();
        }
    }

    public List<ActividadDeportiva> getActividadesByInstitucion(InstitucionDeportiva institucion) {
        try {
            return institucion.getActividades();
        } catch (Exception e) {
            System.out.println("Catch getActividadesByInstitucion: " + e);
            e.printStackTrace();
            return null;
        }
    }

}
