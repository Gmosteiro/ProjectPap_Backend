package logic.ActividadDeportiva.controllers;

import logic.ActividadDeportiva.ActividadDeportiva;
import logic.ActividadDeportiva.ManejadorActividad;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ControllerModificarActividad implements IControllerModificarActividad {
    private final ManejadorActividad manejadorActividad;

    public ControllerModificarActividad() {
        manejadorActividad = new ManejadorActividad();
    }

    public void modificarActividad(String nombre, String nuevaDescripcion, int nuevaDuracion, float nuevoCosto) {
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
            } else {
                // Manejar la actividad no encontrada
                System.out.println("No se encontró la actividad.");
            }
        } catch (Exception e) {
            // Manejar excepciones
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }

    public List<ActividadDeportiva> obtenerTodasLasActividades() {
        return manejadorActividad.obtenerTodasLasActividades();
    }

    public ActividadDeportiva obtenerActividadPorNombre(String nombre) {
        return manejadorActividad.obtenerActividadPorNombre(nombre);
    }
}
