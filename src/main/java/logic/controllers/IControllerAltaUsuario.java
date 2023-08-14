package logic.controllers;

import datatypes.DtFecha;

public interface IControllerAltaUsuario {
    
  public String addProfesor(String nickname, String nombre, String apellido, String email, DtFecha fechaNac ,String descripcion, String biografia, String sitioWeb);
  public String addSocio(String nickname, String nombre, String apellido, String email, DtFecha fechaNac);
}
