package logic.ActividadDeportiva.controllers;

import java.time.LocalDate;
import java.util.List;

import logic.Institucion.InstitucionDeportiva;

public interface IControllerAltaActividad {

        public abstract void altaActividad(String nombre, String descripcion, int duracion, float costo,
                        LocalDate fechaReg, String nombrei);

        public abstract void modificarActividad(String nombre, String nuevaDescripcion, int nuevaDuracion,
                        float nuevoCosto);

        public abstract void cancelarAltaActividad(String nombre);

         public List<InstitucionDeportiva> getInstituciones();
}
