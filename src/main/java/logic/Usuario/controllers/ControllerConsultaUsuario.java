package logic.Usuario.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import logic.ActividadDeportiva.ActividadDeportiva;
import logic.ActividadDeportiva.ManejadorActividad;
import logic.Clase.Clase;
import logic.Clase.ManejadorClases;
import logic.Usuario.ManejadorUsuarios;
import logic.Usuario.Profesor;
import logic.Usuario.Socio;
import logic.Usuario.Usuario;

public class ControllerConsultaUsuario implements IControllerConsultaUsuario {

    public List<Usuario> getUsuarios() {
        return getUsuarios(null); // Llamada a la versión con filtro nulo
    }

    public List<Usuario> getUsuarios(String filter) {
        try {
            List<Usuario> usuarios = new ArrayList<>();
            // Aplicar lógica de filtrado solo si filter no es nulo o vacío
            if (filter != null && !filter.isEmpty()) {
                // Aplicar lógica de filtrado aquí
                usuarios.add(ManejadorUsuarios.getUser(filter));

                return usuarios;

            } else {
                usuarios = ManejadorUsuarios.getUsuarios();

                return usuarios;
            }

        } catch (Exception errorException) {
            System.out.println("Catch getusuarios: " + errorException);
            String errorMessage = extractErrorMessage(errorException.getMessage());
            JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);

            return new ArrayList<>();
        }
    }

    public List<Clase> getClasesAsociadasByProfe(Profesor filter) {
        try {
            // Aplicar lógica de filtrado solo si filter no es nulo o vacío
            if (filter != null) {
                // Aplicar lógica de filtrado aquí
                return ManejadorClases.getClasesByProfe(filter);

            } else {
                return new ArrayList<>();
            }

        } catch (Exception errorException) {
            System.out.println("Catch getClasesAsociadasByProfe: " + errorException);
            String errorMessage = extractErrorMessage(errorException.getMessage());
            JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);

            return new ArrayList<>();
        }

    };

    public List<Clase> getClasesAsociadasBySocio(Socio filter) {
        try {
            // Aplicar lógica de filtrado solo si filter no es nulo o vacío
            if (filter != null) {
                // Aplicar lógica de filtrado aquí
                return ManejadorClases.getClasesBySocio(filter);

            } else {
                return new ArrayList<>();
            }

        } catch (Exception errorException) {
            System.out.println("Catch getClasesAsociadasByProfe: " + errorException);
            String errorMessage = extractErrorMessage(errorException.getMessage());
            JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);

            return new ArrayList<>();
        }

    };

    public List<Clase> getClasesByUser(String nickname) {

        Usuario user = ManejadorUsuarios.getUser(nickname);
        if (user != null && user instanceof Profesor) {
            return this.getClasesAsociadasByProfe((Profesor) user);
        } else if (user != null && user instanceof Socio) {

            return this.getClasesAsociadasBySocio((Socio) user);
        } else {
            return null;
        }
    }

    public List<ActividadDeportiva> getActividadesAsociadas(Profesor filter) {
        try {
            // Aplicar lógica de filtrado solo si filter no es nulo o vacío
            if (filter != null) {
                // Aplicar lógica de filtrado aquí
                return ManejadorActividad.getActividadesByProfe(filter);

            } else {
                return new ArrayList<>();
            }

        } catch (Exception errorException) {
            System.out.println("Catch getClasesAsociadasByProfe: " + errorException);
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
