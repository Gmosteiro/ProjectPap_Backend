package logic.Usuario.controllers;

import logic.Usuario.Sesion;

public interface IControllerInicioSesion {

    public abstract Sesion iniciarSesion(String nickname, String contrasena);

    public abstract Sesion actualizarSesion(String nickname);

}
