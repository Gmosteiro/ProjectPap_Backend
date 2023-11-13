package logic.ActividadDeportiva;

import javax.persistence.*;
import java.util.List;

import logic.Clase.Clase;
import logic.Institucion.InstitucionDeportiva;
import logic.Usuario.Profesor;

public class ManejadorActividad {
    private EntityManagerFactory emf;

    public ManejadorActividad() {
        emf = Persistence.createEntityManagerFactory("project_pap");
    }

    public void agregarActividad(ActividadDeportiva actividad) {
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
        }
    }

    public void actualizarActividad(ActividadDeportiva actividad) {
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
        }
    }

    public void eliminarActividad(ActividadDeportiva actividad) {
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
        }
    }

    public ActividadDeportiva obtenerActividadPorNombre(String nombre) {
        EntityManager entityManager = emf.createEntityManager();

        try {
            return entityManager.find(ActividadDeportiva.class, nombre);
        } catch (Exception e) {
            System.out.println("Catch obtenerActividadPorNombre: " + e);
            e.printStackTrace();
            return null;
        } finally {
            entityManager.close();
        }
    }

    public void agregarClaseA(Clase clase, String nombreActividad) {
        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();

            ActividadDeportiva actividad = obtenerActividadPorNombre(nombreActividad);
            if (actividad != null) {
                actividad.getClases().add(clase);
                entityManager.merge(actividad);
            } else {
                System.out.println("Actividad no encontrada.");
            }

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            System.out.println("Catch agregarClaseA: " + e);
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }

    public List<ActividadDeportiva> getActividades() {
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
        }
    }

    public List<ActividadDeportiva> getActividadesByProfe(Profesor profesor) {
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
        }
    }

    public List<ActividadDeportiva> getActividadesByInstitucion(InstitucionDeportiva institucion) {
        EntityManager entityManager = emf.createEntityManager();

        try {
            // Cargar la colección antes de cerrar la sesión
            List<ActividadDeportiva> actividades = institucion.getActividades();
            actividades.size();
            return actividades;
        } catch (Exception e) {
            System.out.println("Catch getActividadesByInstitucion: " + e);
            e.printStackTrace();
            return null;
        } finally {
            entityManager.close();
        }
    }

    // Otros métodos de consulta y gestión de actividades...
}
