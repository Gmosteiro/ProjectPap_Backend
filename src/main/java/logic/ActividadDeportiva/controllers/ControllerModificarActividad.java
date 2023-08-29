package logic.ActividadDeportiva.controllers;

import logic.ActividadDeportiva.ActividadDeportiva;
import logic.ActividadDeportiva.ManejadorActividad;

import java.time.LocalDate;
import java.util.List;

public class ControllerModificarActividad implements IControllerModificarActividad {
    private final ManejadorActividad manejadorActividad;

    public ControllerModificarActividad() {
        manejadorActividad = new ManejadorActividad();
    }

    public void modificarActividad(String nombre, String nuevaDescripcion, int nuevaDuracion, float nuevoCosto) {
        ActividadDeportiva actividad = manejadorActividad.obtenerActividadPorNombre(nombre);
        if (actividad != null) {
            actividad.setDescripcion(nuevaDescripcion);
            actividad.setDuracion(nuevaDuracion);
            actividad.setCosto(nuevoCosto);
            manejadorActividad.actualizarActividad(actividad);
        } else {
            // Manejar la actividad no encontrada
        }
    }

    public List<ActividadDeportiva> obtenerTodasLasActividades() {
        return manejadorActividad.obtenerTodasLasActividades();
    }

    public ActividadDeportiva obtenerActividadPorNombre(String nombre) {
        return manejadorActividad.obtenerActividadPorNombre(nombre);
    }
}
