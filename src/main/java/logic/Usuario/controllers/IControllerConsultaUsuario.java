package logic.Usuario.controllers;

import java.util.List;

import logic.Clase.Clase;
import logic.Usuario.Usuario;

public interface IControllerConsultaUsuario {

    List<Usuario> getUsuarios();

    List<Usuario> getUsuarios(String filter);

    List<Clase> getClasesAsociadas(String usuario);

}
