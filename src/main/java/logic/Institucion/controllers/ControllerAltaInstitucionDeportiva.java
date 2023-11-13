package logic.Institucion.controllers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;
import logic.Institucion.InstitucionDeportiva;

public class ControllerAltaInstitucionDeportiva implements IControllerAltaInstitucionDeportiva {

    private EntityManagerFactory emFactory;

    public ControllerAltaInstitucionDeportiva() {
        emFactory = Persistence.createEntityManagerFactory("project_pap");
    }

    @Override
    public void addInstitucionDeportiva(String nombre, String descripcion, String url) {
        EntityManager entityManager = emFactory.createEntityManager();

        try {
            entityManager.getTransaction().begin();

            if (!validateInstData(nombre, "InstitucionDeportiva", entityManager)) {
                return;
            }

            InstitucionDeportiva nuevaInstitucion = new InstitucionDeportiva(nombre, descripcion, url);

            entityManager.persist(nuevaInstitucion);

            System.out.println("Institucion Creada");

            JOptionPane.showMessageDialog(null, "Institucion Creada!", "Success", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception errorException) {
            entityManager.getTransaction().rollback();
            System.out.println("AddInstitucionDeportiva catch: " + errorException);
        } finally {
            closeEntityManager(entityManager);
        }
    }

    private boolean validateInstData(String nombre, String queryValue, EntityManager entityManager) {
        try {
            TypedQuery<InstitucionDeportiva> query = entityManager.createQuery(
                    "SELECT c FROM " + queryValue + " c WHERE c.nombre = :nombre",
                    InstitucionDeportiva.class);
            query.setParameter("nombre", nombre);

            entityManager.getTransaction().begin();

            if (query.getResultList().isEmpty()) {
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
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
            return false;
        } finally {
            entityManager.getTransaction().commit();
        }
    }

    private void closeEntityManager(EntityManager entityManager) {
        try {
            if (entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void closeEntityManagerFactory() {
        try {
            if (emFactory != null && emFactory.isOpen()) {
                emFactory.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
