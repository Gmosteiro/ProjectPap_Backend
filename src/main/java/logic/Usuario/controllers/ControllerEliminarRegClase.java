/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author santi
 */

package logic.Usuario.controllers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import logic.Clase.Clase;
import logic.Clase.ManejadorClases;
import logic.Usuario.ManejadorUsuarios;
import logic.Usuario.Registro;
import logic.Usuario.Socio;
import org.hibernate.Hibernate;

public class ControllerEliminarRegClase implements IControllerEliminarRegClase {

  private EntityManagerFactory emf;
    private EntityManager entityManager;

    public ControllerEliminarRegClase() {
        emf = Persistence.createEntityManagerFactory("project_pap");
        entityManager = emf.createEntityManager();
    }

    public void eliminarRegistroDeClase(Socio socio, Clase clase) {
        try {
            entityManager.getTransaction().begin();
            Registro registro = ManejadorUsuarios.getRegistroBySocioEnClase(socio, clase);

            if (registro != null) {
                ManejadorUsuarios.eliminarRegistro(registro);
                entityManager.getTransaction().commit();
                System.out.println("Registro eliminado con éxito.");
            } else {
                System.out.println("No se encontró un registro asociado a este socio y clase.");
            }
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }
    
}

