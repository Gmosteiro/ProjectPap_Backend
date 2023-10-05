package logic.ActividadDeportiva.controllers;

import logic.ActividadDeportiva.ActividadDeportiva;
import logic.ActividadDeportiva.ManejadorActividad;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ControllerModificarActividad implements IControllerModificarActividad {
    private final ManejadorActividad manejadorActividad;

    public ControllerModificarActividad() {
        manejadorActividad = new ManejadorActividad();
    }

   
    public boolean modificarActividad(String nombre, String nuevaDescripcion, int nuevaDuracion, float nuevoCosto,String img) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");
        EntityManager em = emf.createEntityManager();
    
        try {
            em.getTransaction().begin();
    
            ActividadDeportiva actividad = em.find(ActividadDeportiva.class, nombre);
            if (actividad != null) {
                actividad.setDescripcion(nuevaDescripcion);
                actividad.setDuracion(nuevaDuracion);
                actividad.setCosto(nuevoCosto);
                actividad.setImg(img);
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
        return manejadorActividad.getActividades();
    }

    public ActividadDeportiva obtenerActividadPorNombre(String nombre) {
        return manejadorActividad.obtenerActividadPorNombre(nombre);
    }
}
