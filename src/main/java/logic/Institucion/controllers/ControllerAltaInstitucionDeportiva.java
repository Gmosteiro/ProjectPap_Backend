package logic.Institucion.controllers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;
import logic.Clase.Clase;
import logic.Institucion.InstitucionDeportiva;
import logic.Institucion.ManejadorInstitucion;

public class ControllerAltaInstitucionDeportiva implements IControllerAltaInstitucionDeportiva {

    /*
     * Actores: Administrador del sistema
     * 
     * El caso de uso comienza cuando el administrador desea dar de alta una
     * institución.
     * Para ello, indica el nombre de la institución (único), una descripción y
     * una URL.
     * Si ya existe una institución con igual nombre, el administrador puede
     * reingresar
     * los datos o cancelar el caso de uso. Finalmente, el sistema da de alta la
     * institución deportiva
     */

    @Override
    public void addInstitucionDeportiva(String nombre, String descripcion, String url) {
        try {

            if (!validateInstData (nombre, "InstitucionDeportiva")) {
                    return;
            }

            InstitucionDeportiva nuevaInstitucion = new InstitucionDeportiva(nombre, descripcion, url);

            ManejadorInstitucion manejador = new ManejadorInstitucion();

            manejador.agregarInstitucion(nuevaInstitucion);

            System.out.println("Institucion Creada");

        } catch (Exception errorException) {
            System.out.println("AddInstitucionDeportiva catch: " + errorException);

        }

    }

    private boolean validateInstData(String nombre, String queryValue) {
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("project_pap");
        EntityManager entityManager = emFactory.createEntityManager();

        try {
            TypedQuery<InstitucionDeportiva> query = entityManager.createQuery(
                    "SELECT c FROM " + queryValue + " c WHERE c.nombre = :nombre",
                    InstitucionDeportiva.class);
            query.setParameter("nombre", nombre);

            if (query.getResultList().isEmpty()) {// Si está vacío, no existe un usuario con esos datos
                return true;
            } else {

                InstitucionDeportiva instituto = query.getSingleResult();

                String queryNombre = instituto.getNombre();
                String errorMessage = "";

                if (queryNombre.equals(nombre)) {
                    errorMessage = "Ya existe una Institución con ese nombre";
                }
                JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } finally {
            entityManager.close();
            emFactory.close();
        }
    }

    private String extractErrorMessage(String fullErrorMessage) {
        int startIndex = fullErrorMessage.indexOf(":") + 1; // Encuentra la posición después del primer ":"

        return startIndex > 0 && startIndex < fullErrorMessage.length() ? fullErrorMessage.substring(startIndex).trim()
                : fullErrorMessage;
    }
}
