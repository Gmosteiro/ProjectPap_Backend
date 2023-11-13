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
        try {
            manejadorInstitucion.getEntityManager().getTransaction().begin();
            InstitucionDeportiva institucion = manejadorInstitucion.getInstitucionesByName(nombre);

            if (institucion == null) {
                return;
            } else {
                institucion.setDescripcion(nuevaDescripcion);
                institucion.setUrl(nuevaURL);
                manejadorInstitucion.actualizarInstitucion(institucion);
                manejadorInstitucion.getEntityManager().getTransaction().commit();
                JOptionPane.showMessageDialog(
                        null, // Parent component (null for default)
                        "Institucion Actualizada!", // Message text
                        "Success", // Dialog title
                        JOptionPane.INFORMATION_MESSAGE // Message type
                );
            }
        } catch (Exception e) {
            manejadorInstitucion.getEntityManager().getTransaction().rollback();
            e.printStackTrace();
            JOptionPane.showMessageDialog(
                    null,
                    "Error al modificar la institución",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        } finally {
            manejadorInstitucion.getEntityManager().close();
            manejadorInstitucion.getEntityManagerFactory().close();
        }
    }
}
