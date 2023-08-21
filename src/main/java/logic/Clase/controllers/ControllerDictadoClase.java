package logic.Clase.controllers;

import logic.ActividadDeportiva.ActividadDeportiva;
import logic.ActividadDeportiva.ManejadorActividad;
import logic.Institucion.InstitucionDeportiva;
import logic.Institucion.ManejadorInstitucion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.List;

public class ControllerDictadoClase implements IControllerDictadoClase {

    @Override
    public List<InstitucionDeportiva> getInstituciones() {
        try {
            List<InstitucionDeportiva> instituciones = ManejadorInstitucion.getInstituciones();
            return instituciones;

        } catch (Exception errorException) {
            System.out.println("Catch getInstituciones: " + errorException);
            String errorMessage = extractErrorMessage(errorException.getMessage());
            JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);

            return new ArrayList<>();

        }
    }

    @Override
    public List<ActividadDeportiva> getActividades() {
        try {
            List<ActividadDeportiva> actividades = ManejadorActividad.getActividades();
            return actividades;

        } catch (Exception errorException) {
            System.out.println("Catch getActividades: " + errorException);
            String errorMessage = extractErrorMessage(errorException.getMessage());
            JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);

            return new ArrayList<>();

        }
    }

    private String extractErrorMessage(String fullErrorMessage) {
        int startIndex = fullErrorMessage.indexOf(":") + 1; // Encuentra la posición después del primer ":"

        return startIndex > 0 && startIndex < fullErrorMessage.length() ? fullErrorMessage.substring(startIndex).trim()
                : fullErrorMessage;
    }

}
