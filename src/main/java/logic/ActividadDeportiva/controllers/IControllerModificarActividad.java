package logic.ActividadDeportiva.controllers;

import logic.ActividadDeportiva.ActividadDeportiva;

import java.util.List;

public interface IControllerModificarActividad {

    boolean modificarActividad(String nombre, String nuevaDescripcion, int nuevaDuracion, float nuevoCosto, String img);

    List<ActividadDeportiva> getActividades();

    ActividadDeportiva obtenerActividadPorNombre(String nombre);
}
