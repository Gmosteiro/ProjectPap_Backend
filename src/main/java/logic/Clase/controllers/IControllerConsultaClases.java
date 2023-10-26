package logic.Clase.controllers;

import java.util.List;
import logic.ActividadDeportiva.ActividadDeportiva;
import logic.Clase.Clase;

public interface IControllerConsultaClases {

    List<ActividadDeportiva> obtenerActividadesPorInstitucion(String nombreInstitucion);

    List<Clase> obtenerClasesPorActividad(ActividadDeportiva actividad);

    Clase obtenerClasePorNombre(String nombreClase);

}
