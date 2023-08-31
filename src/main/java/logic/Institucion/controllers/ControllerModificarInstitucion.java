package logic.Institucion.controllers;

import logic.Institucion.InstitucionDeportiva;
import logic.Institucion.ManejadorInstitucion;

public class ControllerModificarInstitucion implements IControllerModificarInstitucion {
    private final ManejadorInstitucion manejadorInstitucion;

    public ControllerModificarInstitucion() {
        manejadorInstitucion = new ManejadorInstitucion();
    }

    public void modificarInstitucion(String nombre, String nuevaDescripcion, String nuevaURL) {
        InstitucionDeportiva institucion = manejadorInstitucion.getInstitucionesByName(nombre);

        if (institucion != null) {
            institucion.setDescripcion(nuevaDescripcion);
            institucion.setUrl(nuevaURL);
            manejadorInstitucion.actualizarInstitucion(institucion);
        } else {
            // Manejar la institución no encontrada
        }
    }
}
