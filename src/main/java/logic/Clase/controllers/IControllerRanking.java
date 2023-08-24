package logic.Clase.controllers;

import java.util.List;
import logic.ActividadDeportiva.ActividadDeportiva;

public interface IControllerRanking {

    public List<ActividadDeportiva> obtenerRankingDeActividades();

    public ActividadDeportiva obtenerActividadPorNombre(String nombreActividad);

    public void closeEntityManagerFactory();
}