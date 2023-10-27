package logic.Usuario.controllers;

import java.time.LocalDate;

import javax.swing.JOptionPane;

import logic.Clase.Clase;
import logic.Clase.ManejadorClases;
import logic.Usuario.ManejadorUsuarios;
import logic.Usuario.Registro;
import logic.Usuario.Socio;

public class ControllerRegistroDictado implements IControllerRegistroDictado {

    private ManejadorUsuarios manejadorUsuarios;

    private ManejadorClases manejadorClases;

    public ControllerRegistroDictado() {
        manejadorUsuarios = new ManejadorUsuarios();
        manejadorClases = new ManejadorClases();

    }

    public void addRegistroDictado(String nicknameSocio, String nombreClase, LocalDate fechaReg) {
        try {

            if (!validateData(nicknameSocio, nombreClase, fechaReg)) {
                return;
            }

            Socio socio = manejadorUsuarios.getSocio(nicknameSocio);

            Clase clase = manejadorClases.getClaseByNombre(nombreClase);

            Registro newRegistro = new Registro(fechaReg, socio, clase);

            manejadorUsuarios.agregarRegistro(newRegistro);

        } catch (Exception errorException) {
            JOptionPane.showMessageDialog(null, extractErrorMessage(errorException.getMessage()), "Error",
                    JOptionPane.ERROR_MESSAGE);
            System.out.println("Catch addRegistroDictado: " + errorException);

        }

    }

    public boolean addRegistroDictadoWeb(String nicknameSocio, String nombreClase, LocalDate fechaReg) {
        try {

            Socio socio = manejadorUsuarios.getSocio(nicknameSocio);

            Clase clase = manejadorClases.getClaseByNombre(nombreClase);

            Registro newRegistro = new Registro(fechaReg, socio, clase);

            return manejadorUsuarios.agregarRegistroWeb(newRegistro);

        } catch (Exception errorException) {

            System.out.println("Catch addRegistroDictado: " + errorException);
            return false;

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

        Registro registroExistente = manejadorUsuarios
                .getRegistroBySocio(manejadorUsuarios.getSocio(nicknameSocio));

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

    public boolean validateDataWeb(String nicknameSocio, String nombreClase) {
        try {

            if (nicknameSocio == null || nombreClase == null || nicknameSocio.length() == 0
                    || nombreClase.length() == 0) {

                return false;

            }

            Socio socioEncontrado = manejadorUsuarios.getSocio(nicknameSocio);

            Clase claseEncontrada = manejadorClases.getClaseByNombre(nombreClase);

            Boolean existeRegistro = manejadorUsuarios.existeRegistroBySocioYClase(socioEncontrado, claseEncontrada);

            return existeRegistro;
        } catch (Exception e) {
            System.out.println("Catch validateDataWeb " + e);
            return false;
        }

    }

    private String extractErrorMessage(String fullErrorMessage) {
        int startIndex = fullErrorMessage.indexOf(":") + 1; // Encuentra la posición después del primer ":"

        return startIndex > 0 && startIndex < fullErrorMessage.length() ? fullErrorMessage.substring(startIndex).trim()
                : fullErrorMessage;
    }

}
