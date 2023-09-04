package logic.ActividadDeportiva.controllers;

import logic.ActividadDeportiva.ActividadDeportiva;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ControllerModificarActividad implements IControllerModificarActividad {
    private static EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("project_pap");
    private static EntityManager entityManager = emFactory.createEntityManager();

    public ControllerModificarActividad() {
    }

    // public void modificarActividad(String nombre, String nuevaDescripcion, int
    // nuevaDuracion, float nuevoCosto) {
    // EntityManagerFactory emf =
    // Persistence.createEntityManagerFactory("project_pap");
    // EntityManager em = emf.createEntityManager();

    // // try {
    // // em.getTransaction().begin();

    // // ActividadDeportiva actividad = em.find(ActividadDeportiva.class, nombre);
    // // if (actividad != null) {
    // // actividad.setDescripcion(nuevaDescripcion);
    // // actividad.setDuracion(nuevaDuracion);
    // // actividad.setCosto(nuevoCosto);
    // // em.merge(actividad); // Actualizar la entidad

    // // em.getTransaction().commit();
    // // System.out.println("Actividad modificada exitosamente.");
    // // } else {
    // // // Manejar la actividad no encontrada
    // // System.out.println("No se encontró la actividad.");
    // // }
    // // } catch (Exception e) {
    // // // Manejar excepciones
    // // e.printStackTrace();
    // // } finally {
    // // em.close();
    // // emf.close();
    // // }
    // try {
    // System.out.println("Comenzando transacción...");
    // em.getTransaction().begin();

    // ActividadDeportiva actividad = em.find(ActividadDeportiva.class, nombre);
    // if (actividad != null) {
    // actividad.setDescripcion(nuevaDescripcion);
    // actividad.setDuracion(nuevaDuracion);
    // actividad.setCosto(nuevoCosto);
    // em.merge(actividad); // Actualizar la entidad

    // em.getTransaction().commit();
    // System.out.println("Actividad modificada exitosamente.");
    // } else {
    // // Manejar la actividad no encontrada
    // System.out.println("No se encontró la actividad.");
    // }
    // } catch (Exception e) {
    // // Manejar excepciones
    // e.printStackTrace();
    // } finally {
    // em.close();
    // emf.close();
    // System.out.println("Transacción finalizada.");
    // }
    // }

    public boolean modificarActividad(String nombre, String nuevaDescripcion, int nuevaDuracion, float nuevoCosto) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

            ActividadDeportiva actividad = em.find(ActividadDeportiva.class, nombre);
            if (actividad != null) {
                actividad.setDescripcion(nuevaDescripcion);
                actividad.setDuracion(nuevaDuracion);
                actividad.setCosto(nuevoCosto);
                em.merge(actividad); // Actualizar la entidad

                em.getTransaction().commit();
                System.out.println("Actividad modificada exitosamente.");
                return true; // Indicar que la modificación fue exitosa
            } else {
                // Manejar la actividad no encontrada
                System.out.println("No se encontró la actividad.");
                return false; // Indicar que la modificación no fue exitosa
            }
        } catch (Exception e) {
            // Manejar excepciones
            e.printStackTrace();
            return false; // Indicar que la modificación no fue exitosa debido a una excepción
        } finally {
            em.close();
            emf.close();
            System.out.println("Transacción finalizada.");
        }
    }

    public List<ActividadDeportiva> getActividades() {

        List<ActividadDeportiva> actividades;

        actividades = entityManager
                .createQuery("SELECT a FROM ActividadDeportiva a", ActividadDeportiva.class).getResultList();

        return actividades;
    }

    public ActividadDeportiva obtenerActividadPorNombre(String nombre) {
        ActividadDeportiva actividad = entityManager.find(ActividadDeportiva.class, nombre);
        return actividad;
    }
}
