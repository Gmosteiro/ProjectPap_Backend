package logic.ActividadDeportiva.controllers;

import java.util.List;

import logic.ActividadDeportiva.ActividadDeportiva;
import logic.Clase.Clase;
import logic.Usuario.Registro;

public interface IControllerConsultaActividad {

    List<ActividadDeportiva> obtenerActividadesPorInstitucion(String nombreInstitucion);

    public ActividadDeportiva obtenerActividadPorNombre(String nombreActividad);

    List<Clase> obtenerClasesPorActividad(ActividadDeportiva actividad);

    public List<Registro> obtenerRegistrosPorClase(Clase clase);

    public List<ActividadDeportiva> getActividadesByProfe(String nicknameProfesor);

}
