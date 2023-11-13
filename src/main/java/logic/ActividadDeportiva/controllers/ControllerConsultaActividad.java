package logic.ActividadDeportiva.controllers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;

import logic.ActividadDeportiva.ActividadDeportiva;
import logic.ActividadDeportiva.ManejadorActividad;
import logic.Clase.Clase;
import logic.Usuario.ManejadorUsuarios;
import logic.Usuario.Profesor;
import logic.Usuario.Registro;

public class ControllerConsultaActividad implements IControllerConsultaActividad {

    ;
    private ManejadorActividad manejadorActividad;
    private ManejadorUsuarios manejadorUsuarios;
    private EntityManagerFactory emf;

    public ControllerConsultaActividad() {
        manejadorUsuarios = new ManejadorUsuarios();
        manejadorActividad = new ManejadorActividad();
        emf = Persistence.createEntityManagerFactory("project_pap");

    }

    public List<ActividadDeportiva> obtenerActividadesPorInstitucion(String nombreInstitucion) {

        EntityManager entityManager = emf.createEntityManager();

        try {

            List<ActividadDeportiva> actividades = entityManager.createQuery(
                    "SELECT a FROM ActividadDeportiva a WHERE a.institucion.nombre = :nombreInstitucion",
                    ActividadDeportiva.class)
                    .setParameter("nombreInstitucion", nombreInstitucion)
                    .getResultList();

            return actividades;

        } catch (Exception e) {

            System.out.println("Catch obtenerActividadesPorInstitucion: " + e);
            e.printStackTrace();
            return null;
        } finally {
            entityManager.close();
        }

    }

    public ActividadDeportiva obtenerActividadPorNombre(String nombreActividad) {

        EntityManager entityManager = emf.createEntityManager();

        try {

            ActividadDeportiva actividad = entityManager.find(ActividadDeportiva.class,
                    nombreActividad);

            return actividad;

        } catch (Exception e) {

            System.out.println("Catch obtenerActividadPorNombre: " + e);
            e.printStackTrace();
            return null;
        } finally {
            entityManager.close();
        }

    }

    public List<Clase> obtenerClasesPorActividad(ActividadDeportiva actividad) {

        EntityManager entityManager = emf.createEntityManager();

        try {

            List<Clase> clases = actividad.getClases();

            return clases;

        } catch (Exception e) {

            System.out.println("Catch obtenerClasesPorActividad: " + e);
            e.printStackTrace();
            return null;
        } finally {
            entityManager.close();
        }

    }

    public List<Registro> obtenerRegistrosPorClase(Clase clase) {

        EntityManager entityManager = emf.createEntityManager();

        try {

            List<Registro> registros = entityManager.createQuery(
                    "SELECT r FROM Registro r WHERE r.clase = :clase",
                    Registro.class)
                    .setParameter("clase", clase)
                    .getResultList();

            return registros;

        } catch (Exception e) {

            System.out.println("Catch obtenerRegistrosPorClase: " + e);
            e.printStackTrace();
            return null;
        } finally {
            entityManager.close();
        }

    }

    public List<ActividadDeportiva> getActividadesByProfe(String profesor) {
        try {

            Profesor profesorObtenido = manejadorUsuarios.getProfesor(profesor);

            return manejadorActividad.getActividadesByProfe(profesorObtenido);
        } catch (Exception e) {
            System.out.println("Catch getActividadesByProfe CCA " + e);
            return null;
        }
    };

}