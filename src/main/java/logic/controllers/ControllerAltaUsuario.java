package logic.controllers;

import datatypes.DtFecha;
import logic.Socio;
import logic.Profesor;

public class ControllerAltaUsuario implements IControllerAltaUsuario {

    @Override
    public String addProfesor(String nickname, String nombre, String apellido, String email, DtFecha fechaNac,
            String descripcion, String biografia, String sitioWeb) {
        try {
            return "asda";
        } catch (Exception errorException) {
            System.out.println("AddProfesor catch: " + errorException);
            return "AddProfesor catch: " + errorException;
        }

    }

    @Override
    public String addSocio(String nickname, String nombre, String apellido, String email, DtFecha fechaNac) {
        return "";
    }

}
