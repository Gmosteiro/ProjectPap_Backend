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
    private EntityManager entityManager;
 
    public ControllerEliminarRegClase() {
        emf = Persistence.createEntityManagerFactory("project_pap");
        entityManager = emf.createEntityManager();
    }

    public boolean existenElementos(String nombreInstitucion, String nombreActividad, String nombreClase, String nicknameSocio) {
        Socio socio = ManejadorUsuarios.getSocio(nicknameSocio);
        Clase clase = ManejadorClases.getClaseByNombre(nombreClase);
        InstitucionDeportiva institucion = ManejadorInstitucion.getInstitucionesByName(nombreInstitucion);
        ActividadDeportiva actividad = ManejadorActividad.obtenerActividadPorNombre(nombreActividad);

        return (socio != null && clase != null && institucion != null && actividad != null);
    }

    @Override
    public boolean eliminarRegistroDeClase(String nombreInstitucion, String nombreActividad, String nombreClase, String nicknameSocio) {
        try {
            entityManager.getTransaction().begin();

            if (!existenElementos(nombreInstitucion, nombreActividad, nombreClase, nicknameSocio)) {
                System.out.println("Uno o más elementos proporcionados no existen en la base de datos.");
                return false;
            }

            Socio socio = ManejadorUsuarios.getSocio(nicknameSocio);
            Clase clase = ManejadorClases.getClaseByNombre(nombreClase);

            Registro registro = ManejadorUsuarios.getRegistroBySocioEnClase(socio, clase);

            if (registro != null) {
                ManejadorUsuarios.eliminarRegistro(registro);
                entityManager.getTransaction().commit();
                System.out.println("Registro eliminado con éxito.");
                return true;
            } else {
                System.out.println("No se encontró un registro asociado a este socio y clase. Se creará uno nuevo.");

                // Crear un nuevo registro si no existe
                return crearRegistro(socio, clase);
            }
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
            return false;
        } 
    }

    @Override
    public boolean crearRegistro(Socio socio, Clase clase) {
        try {
            entityManager.getTransaction().begin();
            Registro nuevoRegistro = new Registro(LocalDate.now(), socio, clase);
            entityManager.persist(nuevoRegistro);
            entityManager.getTransaction().commit();
            System.out.println("Registro creado con éxito.");
            return true; // Devuelve true si se creó el registro con éxito
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
            return false; // Devuelve false si hubo un error al crear el registro
        } 
    }
}
