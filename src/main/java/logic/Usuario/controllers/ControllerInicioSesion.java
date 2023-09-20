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
        // Primero, intentamos obtener un Profesor con el nickname proporcionado
        Profesor profesor = ManejadorUsuarios.getProfesor(nickname);
        
        if (profesor != null && profesor.getContrasena().equals(contrasena)) {
            // La contraseña coincide, devolvemos al Profesor
            return profesor;
        }

        // Si no es un Profesor, intentamos obtener un Socio con el nickname proporcionado
        Socio socio = ManejadorUsuarios.getSocio(nickname);
        
        if (socio != null && socio.getContrasena().equals(contrasena)) {
            // La contraseña coincide, devolvemos al Socio
            return socio;
        }

        // Si no encontramos un usuario con ese nickname o la contraseña es incorrecta, devolvemos null
        return null;
    }
}

