package logic.Usuario.controllers;

import java.time.LocalDate;

import logic.Institucion.InstitucionDeportiva;

public interface IControllerAltaUsuario {

  public abstract boolean addProfesor(String nickname, String nombre, String apellido, String email, LocalDate fechaNac,
      String descripcion, String biografia, String sitioWeb, InstitucionDeportiva institucion);

  public abstract boolean addSocio(String nickname, String nombre, String apellido, String email, LocalDate fechaNac);
}
