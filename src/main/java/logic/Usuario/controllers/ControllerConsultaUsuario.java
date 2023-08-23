package logic.Usuario.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import logic.Usuario.ManejadorUsuarios;
import logic.Usuario.Usuario;

public class ControllerConsultaUsuario implements IControllerConsultaUsuario {

    public List<Usuario> getUsuarios() {
        try {
            List<Usuario> usuarios = ManejadorUsuarios.getUsuarios();
            return usuarios;

        } catch (Exception errorException) {
            System.out.println("Catch getusuarios: " + errorException);
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
