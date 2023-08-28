package logic.Clase.controllers;

import logic.Clase.Clase;

import java.util.List;

public interface IControllerConsultaClases {
    List<String> obtenerActividadesDeportivasPorInstitucion(String nombreInstitucion);
    List<Clase> obtenerClasesPorActividad(String nombreActividad);
    Clase obtenerDetallesClase(String nombreClase);
}
