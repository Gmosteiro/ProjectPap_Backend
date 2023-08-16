package logic.controllers;

import datatypes.DtFecha;
import logic.ActividadDeportiva;
import logic.manejadores.ManejadorActividad;

public class ControllerAltaActividad implements IControllerAltaActividad {

    private ManejadorActividad manejadorActividad;

    public ControllerAltaActividad() {
        manejadorActividad = new ManejadorActividad();
    }

    @Override
    public void altaActividad(String nombre, String descripcion, int duracion, float costo, DtFecha fechaReg) {
        ActividadDeportiva actividad = new ActividadDeportiva(nombre, descripcion, duracion, costo, fechaReg);
        manejadorActividad.agregarActividad(actividad);
    }

    @Override
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

    @Override
    public void cancelarAltaActividad(String nombre) {
        ActividadDeportiva actividad = manejadorActividad.obtenerActividadPorNombre(nombre);
        if (actividad != null) {
            manejadorActividad.eliminarActividad(actividad);
        } else {
            // Manejar la actividad no encontrada
        }
    }
}
