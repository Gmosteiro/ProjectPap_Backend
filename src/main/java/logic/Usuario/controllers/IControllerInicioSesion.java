package logic.Usuario.controllers;

import logic.Usuario.Usuario;

public interface IControllerInicioSesion {

    public abstract Usuario iniciarSesion(String nickname, String contrasena);
}


