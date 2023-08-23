package logic.Usuario.controllers;

import java.util.List;

import logic.Usuario.Usuario;

public interface IControllerConsultaUsuario {

    List<Usuario> getUsuarios();

    List<Usuario> getUsuarios(String filter);

}
