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
            handleException("getInstituciones", errorException);
            return null;
        }
    }

    @Override
    public List<ActividadDeportiva> getActividades() {
        try {
            List<ActividadDeportiva> actividades = manejadorActividad.getActividades();
            return actividades;
        } catch (Exception errorException) {
            handleException("getActividades", errorException);
            return new ArrayList<>();
        }
    }

    @Override
    public List<Clase> getClasesByActividad(String actividad) {
        try {
            List<Clase> clases = manejadorClases.getClasesByActividad(actividad);
            return clases;
        } catch (Exception errorException) {
            handleException("getClasesByActividad", errorException);
            return new ArrayList<>();
        }
    }

    private void handleException(String methodName, Exception exception) {
        System.out.println("Catch " + methodName + ": " + exception);
        JOptionPane.showMessageDialog(null, extractErrorMessage(exception.getMessage()), "Error", JOptionPane.ERROR_MESSAGE);
    }

    private String extractErrorMessage(String fullErrorMessage) {
        int startIndex = fullErrorMessage.indexOf(":") + 1;
        return startIndex > 0 && startIndex < fullErrorMessage.length() ? fullErrorMessage.substring(startIndex).trim()
                : fullErrorMessage;
    }
}
