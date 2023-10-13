/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author santi
 */


package logic.Usuario.controllers;

import logic.Clase.Clase;
import logic.Usuario.Registro;
import logic.Usuario.Socio;

public interface IControllerEliminarRegClase {
    boolean eliminarRegistroDeClase(String nombreInstitucion, String nombreActividad, String nombreClase, String nicknameSocio);
}

