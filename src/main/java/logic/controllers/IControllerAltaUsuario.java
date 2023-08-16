package logic.controllers;

import java.time.LocalDate;

public interface IControllerAltaUsuario {

  public abstract void addProfesor(String nickname, String nombre, String apellido, String email, LocalDate fechaNac,
      String descripcion, String biografia, String sitioWeb);

  public abstract void addSocio(String nickname, String nombre, String apellido, String email, LocalDate fechaNac);
}
