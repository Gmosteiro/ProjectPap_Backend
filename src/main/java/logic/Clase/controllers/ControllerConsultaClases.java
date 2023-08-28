package logic.Clase.controllers;

import logic.Clase.Clase;
import logic.Clase.ManejadorClases;

import java.util.List;

public class ControllerConsultaClases implements IControllerConsultaClases {
    private final ManejadorClases manejadorClases;

    public ControllerConsultaClases() {
        manejadorClases = new ManejadorClases();
    }

    public List<String> obtenerActividadesDeportivasPorInstitucion(String nombreInstitucion) {
        // Lógica para obtener las actividades deportivas por institución
        // Puedes implementar esta lógica aquí o en el manejador si lo prefieres
        // Retorna una lista de nombres de actividades
        return null;
    }

    public List<Clase> obtenerClasesPorActividad(String nombreActividad) {
        // Lógica para obtener las clases por actividad
        return manejadorClases.getClasesByProfe(nombreActividad);
    }

    public Clase obtenerDetallesClase(String nombreClase) {
        // Lógica para obtener los detalles de una clase
        return null;
    }
}
