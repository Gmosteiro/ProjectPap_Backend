package logic.ActividadDeportiva.controllers;

import DataBase.DbManager;

import logic.ActividadDeportiva.ActividadDeportiva;
import logic.ActividadDeportiva.ManejadorActividad;

import java.util.List;

public class ControllerModificarActividad implements IControllerModificarActividad {
    private final ManejadorActividad manejadorActividad;
    private DbManager controllerBD;

    public ControllerModificarActividad() {
        manejadorActividad = new ManejadorActividad();
        controllerBD = DbManager.getInstance();
    }

    public boolean modificarActividad(String nombre, String nuevaDescripcion, int nuevaDuracion, float nuevoCosto,
            String img) {
        try {
            controllerBD.getEntityManager().getTransaction().begin();

            ActividadDeportiva actividad = controllerBD.getEntityManager().find(ActividadDeportiva.class, nombre);

            if (actividad == null) {
                return false;
            } else {

                actividad.setDescripcion(nuevaDescripcion);
                actividad.setDuracion(nuevaDuracion);
                actividad.setCosto(nuevoCosto);
                actividad.setImg(img);

                controllerBD.getEntityManager().merge(actividad);

                controllerBD.getEntityManager().getTransaction().commit();
                controllerBD.closeEntityManager();

                return true;
            }
        } catch (Exception e) {
            System.out.println("Catch modificarActividad " + e);
            return false;
        }
    }

    public List<ActividadDeportiva> getActividades() {
        return manejadorActividad.getActividades();
    }

    public ActividadDeportiva obtenerActividadPorNombre(String nombre) {
        return manejadorActividad.obtenerActividadPorNombre(nombre);
    }
}
