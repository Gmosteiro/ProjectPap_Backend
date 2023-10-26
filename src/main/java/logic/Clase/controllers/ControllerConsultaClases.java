
package logic.Clase.controllers;

import java.util.List;

import DataBase.DbManager;
import logic.ActividadDeportiva.ActividadDeportiva;
import logic.Clase.Clase;
import logic.Clase.ManejadorClases;

public class ControllerConsultaClases implements IControllerConsultaClases {

    private DbManager controllerBD;
    private ManejadorClases manejadorClases;

    public ControllerConsultaClases() {
        manejadorClases = new ManejadorClases();
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
            System.out.println("Catch obtenerActividadesPorInstitucion: " + e);
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

    public Clase obtenerClasePorNombre(String nombreClase) {
        return manejadorClases.getClaseByNombre(nombreClase);
    }

}
