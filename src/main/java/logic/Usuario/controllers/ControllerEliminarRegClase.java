/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author santi
 */

package logic.Usuario.controllers;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import logic.Clase.Clase;
import logic.Clase.ManejadorClases;
import logic.Usuario.ManejadorUsuarios;
import logic.Usuario.Registro;
import logic.Usuario.Socio;

public class ControllerEliminarRegClase implements IControllerEliminarRegClase {

    private EntityManagerFactory emf;
    private EntityManager entityManager;
 
    public ControllerEliminarRegClase() {
        emf = Persistence.createEntityManagerFactory("project_pap");
        entityManager = emf.createEntityManager();
    }

    public void eliminarRegistroDeClase(String nombreInstitucion, String nombreActividad, String nombreClase, String nicknameSocio) {
    try {
        if (!entityManager.getTransaction().isActive()) {
            entityManager.getTransaction().begin();
        }

        Socio socio = ManejadorUsuarios.getSocio(nicknameSocio);
        Clase clase = ManejadorClases.getClaseByNombre(nombreClase);

        if (socio != null && clase != null) {
            Registro registro = ManejadorUsuarios.getRegistroBySocioEnClase(socio, clase);
            if (registro != null) {
                ManejadorUsuarios.eliminarRegistro(registro);
                entityManager.getTransaction().commit();
                System.out.println("Registro eliminado con éxito.");
            } else {
                System.out.println("No se encontró un registro asociado a este socio y clase. Se creará uno nuevo.");

                // Crear un nuevo registro si no existe
                crearRegistro(socio, clase);
            }
        } else {
            System.out.println("No se encontró un Socio o una Clase asociados a los datos proporcionados.");
        }
    } catch (Exception e) {
        entityManager.getTransaction().rollback();
        e.printStackTrace();
    } 
}

private void crearRegistro(Socio socio, Clase clase) {
    try {
        if (!entityManager.getTransaction().isActive()) {
            entityManager.getTransaction().begin();
        }
        Registro nuevoRegistro = new Registro(LocalDate.now(), socio, clase);
        entityManager.persist(nuevoRegistro);
        entityManager.getTransaction().commit();
        System.out.println("Registro creado con éxito.");
    } catch (Exception e) {
        entityManager.getTransaction().rollback();
        e.printStackTrace();
    }
}



}


