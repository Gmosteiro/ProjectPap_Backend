package logic.controllers;

import datatypes.DtFecha;
import logic.Socio;
import logic.Profesor;
import logic.manejadores.*;

public class ControllerAltaUsuario implements IControllerAltaUsuario {

    /*
     * Actores: Administrador del sistema
     * 
     * Description: El caso de uso comienza cuando el administrador desea dar de
     * alta a un nuevo usuario en el sistema. Para ello indica si es un/a socio/a o
     * un profesor/a y sus datos básicos: nickname (único), nombre, apellido,
     * correo electrónico (único) y fecha de nacimiento. Si el usuario es un
     * profesor/a se ingresan además otros datos básicos: la institución a la
     * cual pertenece, una descripción general, una breve biografía (opcional) y
     * un link a su sitio web (opcional). Si el nickname o el correo electrónico se
     * encuentran en uso por algún otro usuario, el sistema avisa al administrador,
     * pudiendo éste corregir la información o cancelar el alta. Finalmente, el
     * sistema da de alta al usuario.
     */

    @Override
    public void addProfesor(String nickname, String nombre, String apellido, String email, DtFecha fechaNac,
            String descripcion, String biografia, String sitioWeb) {
        try {

            if (validateUserData(nickname, email)) {

            }

            Profesor nuevoProfesor = new Profesor(nickname, nombre, apellido, email, fechaNac, email, descripcion,
                    biografia, sitioWeb);

            ManejadorUsuarios manejador = new ManejadorUsuarios();

            manejador.agregarUsuario(nuevoProfesor);

            System.out.println("Usuario Creado");

        } catch (Exception errorException) {
            System.out.println("AddProfesor catch: " + errorException);

        }

    }

    @Override
    public void addSocio(String nickname, String nombre, String apellido, String email, DtFecha fechaNac) {

    }

    private boolean validateUserData(String nickname, String Email) {

        return true;
    }

}