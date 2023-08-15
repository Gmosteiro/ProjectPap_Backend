package logic.controllers;

import datatypes.DtFecha;

public interface IControllerAltaUsuario {

  public abstract void addProfesor(String nickname, String nombre, String apellido, String email, DtFecha fechaNac,
      String descripcion, String biografia, String sitioWeb);

  public abstract void addSocio(String nickname, String nombre, String apellido, String email, DtFecha fechaNac);
}
