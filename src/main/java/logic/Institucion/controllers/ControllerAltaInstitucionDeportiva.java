package logic.Institucion.controllers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;
import logic.Institucion.InstitucionDeportiva;
import logic.Institucion.ManejadorInstitucion;

public class ControllerAltaInstitucionDeportiva implements IControllerAltaInstitucionDeportiva {

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
}
