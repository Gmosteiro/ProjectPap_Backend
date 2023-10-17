/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author santi
 */

package logic.Usuario.controllers;

import logic.Usuario.Socio;
import logic.Clase.Clase;

public interface IControllerEliminarRegClase {
    boolean existenElementos(String nombreInstitucion, String nombreActividad, String nombreClase, String nicknameSocio);

    boolean eliminarRegistroDeClase(String nombreInstitucion, String nombreActividad, String nombreClase, String nicknameSocio);

    boolean crearRegistro(Socio socio, Clase clase);
}


