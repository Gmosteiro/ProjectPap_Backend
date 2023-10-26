package logic.Clase.controllers;

import java.util.List;

import DataBase.DbManager;
import logic.ActividadDeportiva.ActividadDeportiva;
import logic.Clase.Clase;

public class ControllerRanking implements IControllerRanking {

    private DbManager controllerBD;

    public ControllerRanking() {
        controllerBD = DbManager.getInstance();
    }

    @Override
    public List<ActividadDeportiva> obtenerRankingDeActividades() {
        try {
            controllerBD.getEntityManager();

            List<ActividadDeportiva> resultados = controllerBD.getEntityManager().createQuery(
                    "SELECT a " +
                            "FROM ActividadDeportiva a " +
                            "LEFT JOIN a.Clases ac " +
                            "GROUP BY a " +
                            "ORDER BY COUNT(ac) DESC",
                    ActividadDeportiva.class).getResultList();

            controllerBD.closeEntityManager();
            return resultados;
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return null;
        }
    }

    @Override
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

    @Override
    public List<Clase> obtenerRankingDeClases() {

        try {

            String query = "SELECT c " +
                    "FROM Clase c " +
                    "INNER JOIN Registro r ON c.nombre = r.clase " +
                    "GROUP BY c.nombre " +
                    "ORDER BY COUNT(r.id) DESC";

            List<Clase> resultados = controllerBD.getEntityManager().createQuery(query, Clase.class)
                    .getResultList();

            controllerBD.closeEntityManager();

            return resultados;
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return null;
        }
    }

}