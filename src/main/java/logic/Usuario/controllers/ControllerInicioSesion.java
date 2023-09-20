package logic.Usuario.controllers;

import logic.Usuario.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


import antlr.collections.List;


public class ControllerInicioSesion implements IControllerInicioSesion {

    @Override
    public Usuario iniciarSesion(String nickname, String contrasena) {
        // Intentamos obtener un Usuario con el nickname proporcionado
        Usuario usuario = ManejadorUsuarios.getUser(nickname);

        if (usuario != null && usuario.getContrasena().equals(contrasena)) {
            // La contraseña coincide, devolvemos al Usuario
            return usuario;
        }

        // Si no encontramos un usuario con ese nickname o la contraseña es incorrecta, devolvemos null
        return null;
    }
}

