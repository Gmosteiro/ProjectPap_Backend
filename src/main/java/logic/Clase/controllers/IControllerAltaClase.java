package logic.Clase.controllers;

import java.time.LocalDate;
import java.time.LocalTime;

public interface IControllerAltaClase {

  public abstract void addClase(String nombre, LocalDate fecha, LocalTime hora, String url, LocalDate fechaReg);
}
