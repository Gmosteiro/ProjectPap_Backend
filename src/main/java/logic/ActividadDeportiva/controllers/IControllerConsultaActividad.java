package logic.ActividadDeportiva.controllers;

import java.util.List;

import logic.ActividadDeportiva.ActividadDeportiva;
import logic.Clase.Clase;
import logic.Usuario.Registro;

public interface IControllerConsultaActividad {

    List<ActividadDeportiva> obtenerActividadesPorInstitucion(String nombreInstitucion);

    public ActividadDeportiva obtenerActividadPorNombre(String nombreActividad);

    public Clase obtenerClasePorNombre(String nombreClase);

    public List<Registro> obtenerRegistrosPorClase(Clase clase);

}
