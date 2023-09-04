package logic.Usuario.controllers;

import java.time.LocalDate;

import javax.swing.JOptionPane;

import logic.Clase.Clase;
import logic.Clase.ManejadorClases;
import logic.Usuario.ManejadorUsuarios;
import logic.Usuario.Registro;
import logic.Usuario.Socio;

public class ControllerRegistroDictado implements IControllerRegistroDictado {

    public void addRegistroDictado(String nicknameSocio, String nombreClase, LocalDate fechaReg) {
        try {

            if (!validateData(nicknameSocio, nombreClase, fechaReg)) {
                return;
            }

            Socio socio = ManejadorUsuarios.getSocio(nicknameSocio);

            Clase clase = ManejadorClases.getClaseByNombre(nombreClase);

            Registro newRegistro = new Registro(fechaReg, socio, clase);

            ManejadorUsuarios.agregarRegistro(newRegistro);

        } catch (Exception errorException) {
            JOptionPane.showMessageDialog(null, extractErrorMessage(errorException.getMessage()), "Error",
                    JOptionPane.ERROR_MESSAGE);
            System.out.println("Catch addRegistroDictado: " + errorException);

        }

    }

    private boolean validateData(String nicknameSocio, String nombreClase, LocalDate fechaReg) {

        if (nicknameSocio.length() == 0) {

            JOptionPane.showMessageDialog(null, "Ingrese un socio", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (nombreClase.length() == 0) {

            JOptionPane.showMessageDialog(null, "Ingrese un clase", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return false;

        }

        Registro registroExistente = ManejadorUsuarios.getRegistroBySocio(ManejadorUsuarios.getSocio(nicknameSocio));

        // registroExistente.getSocio().getNickname().length() != 0
        if (registroExistente != null && registroExistente.getClase().getNombre() == nombreClase) {

            JOptionPane.showMessageDialog(null,
                    extractErrorMessage("Ya existe un registro para este par clase y socio "), "Error",
                    JOptionPane.ERROR_MESSAGE);

            return false;
        } else {
            return true;
        }

    }

    private String extractErrorMessage(String fullErrorMessage) {
        int startIndex = fullErrorMessage.indexOf(":") + 1; // Encuentra la posición después del primer ":"

        return startIndex > 0 && startIndex < fullErrorMessage.length() ? fullErrorMessage.substring(startIndex).trim()
                : fullErrorMessage;
    }

}
