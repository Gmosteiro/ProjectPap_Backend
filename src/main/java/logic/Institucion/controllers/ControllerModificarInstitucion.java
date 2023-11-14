package logic.Institucion.controllers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import logic.Institucion.InstitucionDeportiva;

public class ControllerModificarInstitucion implements IControllerModificarInstitucion {

    public ControllerModificarInstitucion() {

    }

    public void modificarInstitucion(String nombre, String nuevaDescripcion, String nuevaURL) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");

        EntityManager entityManager = emf.createEntityManager();

        try {
            entityManager.getTransaction().begin();
            InstitucionDeportiva institucion = entityManager.find(InstitucionDeportiva.class, nombre);

            if (institucion == null) {
                return;
            } else {
                institucion.setDescripcion(nuevaDescripcion);
                institucion.setUrl(nuevaURL);
                entityManager.merge(institucion);
                entityManager.getTransaction().commit();

                JOptionPane.showMessageDialog(
                        null,
                        "Institucion Actualizada!",
                        "Success",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            if (entityManager.getTransaction() != null && entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }

            e.printStackTrace();

            JOptionPane.showMessageDialog(
                    null,
                    "Error al modificar la institución",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        } finally {
            entityManager.close();
            emf.close();
        }
    }
}
