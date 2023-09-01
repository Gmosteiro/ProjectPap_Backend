package logic.Clase.controllers;

import java.util.List;

import logic.ActividadDeportiva.ActividadDeportiva;
import logic.Clase.Clase;
import logic.Institucion.InstitucionDeportiva;

public interface IControllerDictadoClase {

    public List<InstitucionDeportiva> getInstituciones();

    public List<ActividadDeportiva> getActividades();

    public List<Clase> getClasesByActividad(String actividad);
}
