package logic.Institucion.controllers;

import javax.swing.JOptionPane;
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
            JOptionPane.showMessageDialog(
                        null, // Parent component (null for default)
                        "Institucion Actualizada!", // Message text
                        "Success", // Dialog title
                        JOptionPane.INFORMATION_MESSAGE // Message type merecuetengue dijo el juan
                );

        } else {
            // Manejar la institución no encontrada
        }
    }
}
