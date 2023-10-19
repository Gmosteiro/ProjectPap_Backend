package logic.Usuario.controllers;

import java.time.LocalDate;

public interface IControllerRegistroDictado {

    public void addRegistroDictado(String nicknameSocio, String nombreClase, LocalDate fechaReg);

    public boolean addRegistroDictadoWeb(String nicknameSocio, String nombreClase, LocalDate fechaReg);

    public boolean validateDataWeb(String nicknameSocio, String nombreClase);

}
