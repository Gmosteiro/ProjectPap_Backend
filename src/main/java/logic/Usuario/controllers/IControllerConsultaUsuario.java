package logic.Usuario.controllers;

import java.util.List;

import logic.ActividadDeportiva.ActividadDeportiva;
import logic.Clase.Clase;
import logic.Usuario.Profesor;
import logic.Usuario.Socio;
import logic.Usuario.Usuario;

public interface IControllerConsultaUsuario {

    List<Usuario> getUsuarios();

    List<Usuario> getUsuarios(String filter);

    List<Clase> getClasesAsociadasByProfe(Profesor profesor);

    List<Clase> getClasesAsociadasBySocio(Socio profesor);

    List<ActividadDeportiva> getActividadesAsociadas(Profesor profesor);

    public List<Clase> getClasesByUser(String nickname);

}
