package logic.Usuario.controllers;

import logic.Usuario.Sesion;

public interface IControllerInicioSesion {

    public abstract Sesion iniciarSesion(String nickname, String contrasena);
}
