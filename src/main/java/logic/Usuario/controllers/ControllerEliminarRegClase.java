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

import logic.ActividadDeportiva.ActividadDeportiva;
import logic.ActividadDeportiva.ManejadorActividad;
import logic.Clase.Clase;
import logic.Clase.ManejadorClases;
import logic.Institucion.InstitucionDeportiva;
import logic.Institucion.ManejadorInstitucion;
import logic.Usuario.ManejadorUsuarios;
import logic.Usuario.Registro;
import logic.Usuario.Socio;

public class ControllerEliminarRegClase implements IControllerEliminarRegClase {

    private EntityManagerFactory emf;

    private ManejadorUsuarios manejadorUsuarios;
    private ManejadorActividad manejadorActividad;
    private ManejadorInstitucion manejadorInstitucion;
    private ManejadorClases manejadorClases;

    public ControllerEliminarRegClase() {
        emf = Persistence.createEntityManagerFactory("project_pap");

        manejadorUsuarios = new ManejadorUsuarios();
        manejadorActividad = new ManejadorActividad();
        manejadorClases = new ManejadorClases();
        manejadorInstitucion = new ManejadorInstitucion();

    }

    public boolean existenElementos(String nombreInstitucion, String nombreActividad, String nombreClase,
            String nicknameSocio) {
        Socio socio = manejadorUsuarios.getSocio(nicknameSocio);
        Clase clase = manejadorClases.getClaseByNombre(nombreClase);
        InstitucionDeportiva institucion = manejadorInstitucion.getInstitucionesByName(nombreInstitucion);
        ActividadDeportiva actividad = manejadorActividad.obtenerActividadPorNombre(nombreActividad);

        return (socio != null && clase != null && institucion != null && actividad != null);
    }

    public boolean eliminarRegistroDeClase(String nombreInstitucion, String nombreActividad, String nombreClase,
            String nicknameSocio) {

        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();

            if (!existenElementos(nombreInstitucion, nombreActividad, nombreClase, nicknameSocio)) {
                System.out.println("Uno o más elementos proporcionados no existen en la base de datos.");
                return false;
            }

            Socio socio = manejadorUsuarios.getSocio(nicknameSocio);
            Clase clase = manejadorClases.getClaseByNombre(nombreClase);

            Registro registro = manejadorUsuarios.getRegistroBySocioEnClase(socio, clase);

            if (registro != null) {
                manejadorUsuarios.eliminarRegistro(registro);
                entityManager.getTransaction().commit();

                // Verificar si el registro se ha eliminado correctamente
                registro = manejadorUsuarios.getRegistroBySocioEnClase(socio, clase);
                if (registro == null) {
                    System.out.println("Registro eliminado correctamente.");
                } else {
                    System.out.println("Error: El registro no se ha eliminado correctamente.");
                }

                transaction.commit();

                return true;
            } else {
                System.out.println("No se encontró un registro asociado a este socio y clase. Se creará uno nuevo.");
                return crearRegistro(socio, clase);
            }

        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            System.out.println("Catch eliminarRegistroDeClase: " + e);
            e.printStackTrace();
            return false;
        } finally {
            entityManager.close();
        }

    }

    public boolean crearRegistro(Socio socio, Clase clase) {

        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();

            Registro nuevoRegistro = new Registro(LocalDate.now(), socio, clase);
            entityManager.persist(nuevoRegistro);
            transaction.commit();

            return true;

        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            System.out.println("Catch crearRegistro: " + e);
            e.printStackTrace();
            return false;
        } finally {
            entityManager.close();
        }

    }
}
