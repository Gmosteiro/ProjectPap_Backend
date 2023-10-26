package logic.ActividadDeportiva.controllers;

import DataBase.DbManager;

import java.util.List;

import logic.ActividadDeportiva.ActividadDeportiva;
import logic.ActividadDeportiva.ManejadorActividad;
import logic.Clase.Clase;
import logic.Usuario.ManejadorUsuarios;
import logic.Usuario.Profesor;
import logic.Usuario.Registro;

public class ControllerConsultaActividad implements IControllerConsultaActividad {

    private DbManager controllerBD;
    private ManejadorActividad manejadorActividad;
    private ManejadorUsuarios manejadorUsuarios;

    public ControllerConsultaActividad() {
        manejadorUsuarios = new ManejadorUsuarios();
        manejadorActividad = new ManejadorActividad();
        controllerBD = DbManager.getInstance();
    }

    public List<ActividadDeportiva> obtenerActividadesPorInstitucion(String nombreInstitucion) {

        try {

            List<ActividadDeportiva> actividades = controllerBD.getEntityManager().createQuery(
                    "SELECT a FROM ActividadDeportiva a WHERE a.institucion.nombre = :nombreInstitucion",
                    ActividadDeportiva.class)
                    .setParameter("nombreInstitucion", nombreInstitucion)
                    .getResultList();

            controllerBD.closeEntityManager();

            return actividades;
        } catch (Exception e) {
            System.out.println("Error obtenerActividadesPorInstitucion: " + e);
            return null;
        }
    }

    public ActividadDeportiva obtenerActividadPorNombre(String nombreActividad) {
        try {

            ActividadDeportiva actividad = controllerBD.getEntityManager().find(ActividadDeportiva.class,
                    nombreActividad);

            controllerBD.closeEntityManager();

            return actividad;
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return null;
        }
    }

    public List<Clase> obtenerClasesPorActividad(ActividadDeportiva actividad) {
        try {
            controllerBD.getEntityManager();

            List<Clase> clases = actividad.getClases();
            controllerBD.closeEntityManager();

            return clases;
        } catch (Exception e) {
            System.out.println("Error " + e);
            return null;
        }
    }

    public List<Registro> obtenerRegistrosPorClase(Clase clase) {
        try {

            List<Registro> registros = controllerBD.getEntityManager().createQuery(
                    "SELECT r FROM Registro r WHERE r.clase = :clase",
                    Registro.class)
                    .setParameter("clase", clase)
                    .getResultList();

            controllerBD.closeEntityManager();

            return registros;
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return null;
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