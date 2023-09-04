package logic.Clase.controllers;

import java.util.List;
import logic.ActividadDeportiva.ActividadDeportiva;
import logic.Clase.Clase;

public interface IControllerRanking {

    public List<ActividadDeportiva> obtenerRankingDeActividades();

    public ActividadDeportiva obtenerActividadPorNombre(String nombreActividad);
    
    public List<Clase> obtenerRankingDeClases();

    public void closeEntityManagerFactory();
}