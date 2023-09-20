package logic.Usuario.controllers;

import logic.Usuario.*;

public class ControllerInicioSesion implements IControllerInicioSesion {

    @Override
    public Usuario iniciarSesion(String nickname, String contrasena) {
        // Intentamos obtener un Usuario con el nickname proporcionado
        Usuario usuario = ManejadorUsuarios.getUser(nickname);

        System.out.println("Usuario: " + usuario);
        System.out.println("usuario.getContrasena() " + usuario.getContrasena());

        if (usuario != null && usuario.getContrasena().equals(contrasena)) {
            // La contraseña coincide, devolvemos al Usuario
            return usuario;
        } else {
            return null;
        }

        // Si no encontramos un usuario con ese nickname o la contraseña es incorrecta,
    }
}
