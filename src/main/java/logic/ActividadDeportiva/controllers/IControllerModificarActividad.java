package logic.ActividadDeportiva.controllers;

import logic.ActividadDeportiva.ActividadDeportiva;

import java.util.List;

public interface IControllerModificarActividad {
    void modificarActividad(String nombre, String nuevaDescripcion, int nuevaDuracion, float nuevoCosto);
    List<ActividadDeportiva> getActividades();
    ActividadDeportiva obtenerActividadPorNombre(String nombre);
}
