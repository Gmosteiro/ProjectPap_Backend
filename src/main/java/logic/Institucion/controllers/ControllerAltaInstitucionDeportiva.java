package logic.Institucion.controllers;

import java.util.List;

import javax.swing.JOptionPane;

import DataBase.DbManager;
import logic.Institucion.InstitucionDeportiva;
import logic.Institucion.ManejadorInstitucion;

public class ControllerAltaInstitucionDeportiva implements IControllerAltaInstitucionDeportiva {
    private DbManager controllerBD;
    private ManejadorInstitucion manejadorInstitucion;

    public ControllerAltaInstitucionDeportiva() {
        manejadorInstitucion = new ManejadorInstitucion();
        controllerBD = DbManager.getInstance();
    }

    @Override
    public void addInstitucionDeportiva(String nombre, String descripcion, String url) {
        try {

            if (!validateInstData(nombre, "InstitucionDeportiva")) {
                return;
            }

            InstitucionDeportiva nuevaInstitucion = new InstitucionDeportiva(nombre, descripcion, url);

            manejadorInstitucion.agregarInstitucion(nuevaInstitucion);

            JOptionPane.showMessageDialog(null, "Institucion Creada!", "Success", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception errorException) {
            System.out.println("AddInstitucionDeportiva catch: " + errorException);

        }

    }

    private boolean validateInstData(String nombre, String queryValue) {
        try {

            List<InstitucionDeportiva> listInstiituciones = controllerBD.getEntityManager().createQuery(
                    "SELECT c FROM " + queryValue + " c WHERE c.nombre = :nombre",
                    InstitucionDeportiva.class).setParameter("nombre", nombre).getResultList();

            controllerBD.closeEntityManager();

            if (listInstiituciones.isEmpty()) {// Si está vacío, no existe un usuario con esos datos
                return true;
            } else {

                InstitucionDeportiva instituto = listInstiituciones.get(0);

                String queryNombre = instituto.getNombre();
                String errorMessage = "";

                if (queryNombre.equals(nombre)) {
                    errorMessage = "Ya existe una Institución con ese nombre";
                }
                JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return false;
        }
    }
}
