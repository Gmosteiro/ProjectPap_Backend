/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author santi
 */


package logic.Usuario.controllers;

public interface IControllerEliminarRegClase {
    boolean existenElementos(String nombreInstitucion, String nombreActividad, String nombreClase, String nicknameSocio);
    boolean eliminarRegistroDeClase(String nombreInstitucion, String nombreActividad, String nombreClase, String nicknameSocio);
}
