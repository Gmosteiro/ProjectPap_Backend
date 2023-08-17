package logic.ActividadDeportiva.controllers;

import java.time.LocalDate;

public interface IControllerAltaActividad {

        public abstract void altaActividad(String nombre, String descripcion, int duracion, float costo,
                        LocalDate fechaReg);

        public abstract void modificarActividad(String nombre, String nuevaDescripcion, int nuevaDuracion,
                        float nuevoCosto);

        public abstract void cancelarAltaActividad(String nombre);
}
