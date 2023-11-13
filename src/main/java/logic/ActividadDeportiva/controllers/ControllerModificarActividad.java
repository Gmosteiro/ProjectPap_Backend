package logic.ActividadDeportiva.controllers;

import logic.ActividadDeportiva.ActividadDeportiva;
import logic.ActividadDeportiva.ManejadorActividad;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class ControllerModificarActividad implements IControllerModificarActividad {
    private final ManejadorActividad manejadorActividad;
    private EntityManagerFactory emf;

    public ControllerModificarActividad() {
        manejadorActividad = new ManejadorActividad();
        emf = Persistence.createEntityManagerFactory("project_pap");
    }

    public boolean modificarActividad(String nombre, String nuevaDescripcion, int nuevaDuracion, float nuevoCosto,
                                      String img) {
        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();

            ActividadDeportiva actividad = manejadorActividad.obtenerActividadPorNombre( nombre);

            if (actividad == null) {
                return false;
            } else {
                actividad.setDescripcion(nuevaDescripcion);
                actividad.setDuracion(nuevaDuracion);
                actividad.setCosto(nuevoCosto);
                actividad.setImg(img);

                entityManager.merge(actividad);

                transaction.commit();

                return true;
            }

        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            System.out.println("Catch modificarActividad: " + e);
            e.printStackTrace();
            return false;
        } finally {
            entityManager.close();
        }
    }

    public List<ActividadDeportiva> getActividades() {
        return manejadorActividad.getActividades();
    }

    public ActividadDeportiva obtenerActividadPorNombre(String nombre) {
        EntityManager entityManager = emf.createEntityManager();
        try {
            return manejadorActividad.obtenerActividadPorNombre( nombre);
        } finally {
            entityManager.close();
        }
    }
}
