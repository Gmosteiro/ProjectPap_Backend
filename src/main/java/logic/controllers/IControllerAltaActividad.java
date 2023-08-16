package logic.controllers;

import datatypes.DtFecha;

public interface IControllerAltaActividad {

    public abstract void altaActividad(String nombre, String descripcion, int duracion, float costo, DtFecha fechaReg);

    public abstract void modificarActividad(String nombre, String nuevaDescripcion, int nuevaDuracion, float nuevoCosto);

    public abstract void cancelarAltaActividad(String nombre);
}
