package logic.Clase.controllers;

import logic.ActividadDeportiva.ActividadDeportiva;
import logic.ActividadDeportiva.ManejadorActividad;
import logic.Institucion.InstitucionDeportiva;
import logic.Institucion.ManejadorInstitucion;
import logic.Clase.Clase;
import logic.Clase.ManejadorClases;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.List;

public class ControllerDictadoClase implements IControllerDictadoClase {
    private ManejadorInstitucion manejadorInstitucion;
    private ManejadorActividad manejadorActividad;
    private ManejadorClases manejadorClases;

    public ControllerDictadoClase() {
        manejadorInstitucion = new ManejadorInstitucion();
        manejadorActividad = new ManejadorActividad();
        manejadorClases = new ManejadorClases();

    }

    @Override
    public List<InstitucionDeportiva> getInstituciones() {
        try {
            List<InstitucionDeportiva> instituciones = manejadorInstitucion.getInstituciones();
            return instituciones;

        } catch (Exception errorException) {
            System.out.println("Catch getInstituciones: " + errorException);
            JOptionPane.showMessageDialog(null, extractErrorMessage(errorException.getMessage()), "Error",
                    JOptionPane.ERROR_MESSAGE);

            return null;

        }
    }

    @Override
    public List<ActividadDeportiva> getActividades() {
        try {
            List<ActividadDeportiva> actividades = manejadorActividad.getActividades();
            return actividades;

        } catch (Exception errorException) {
            System.out.println("Catch getActividades: " + errorException);
            String errorMessage = extractErrorMessage(errorException.getMessage());
            JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);

            return new ArrayList<>();

        }
    }

    private String extractErrorMessage(String fullErrorMessage) {
        int startIndex = fullErrorMessage.indexOf(":") + 1;

        return startIndex > 0 && startIndex < fullErrorMessage.length() ? fullErrorMessage.substring(startIndex).trim()
                : fullErrorMessage;
    }

    public List<Clase> getClasesByActividad(String actividad) {
        List<Clase> clases = manejadorClases.getClasesByActividad(actividad);
        return clases;
    }

}
