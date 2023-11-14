package logic.Institucion.controllers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;

import logic.ActividadDeportiva.ActividadDeportiva;
import logic.Institucion.InstitucionDeportiva;

public class ControllerAltaInstitucionDeportiva implements IControllerAltaInstitucionDeportiva {

    public ControllerAltaInstitucionDeportiva() {

    }

    @Override
    public void addInstitucionDeportiva(String nombre, String descripcion, String url) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");
        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();

            if (!validateInstData(nombre, "InstitucionDeportiva")) {
                return;
            }

            InstitucionDeportiva nuevaInstitucion = new InstitucionDeportiva(nombre, descripcion, url);

            entityManager.persist(nuevaInstitucion);

            System.out.println("Institucion Creada");

            JOptionPane.showMessageDialog(null, "Institucion Creada!", "Success", JOptionPane.INFORMATION_MESSAGE);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            System.out.println("Catch agregarClaseA: " + e);
            e.printStackTrace();
        } finally {
            entityManager.close();
            emf.close();
        }

    }

    private boolean validateInstData(String nombre, String queryValue) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");
        EntityManager entityManager = emf.createEntityManager();

        try {

            TypedQuery<InstitucionDeportiva> query = entityManager.createQuery(
                    "SELECT c FROM " + queryValue + " c WHERE c.nombre = :nombre",
                    InstitucionDeportiva.class);
            query.setParameter("nombre", nombre);

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

            e.printStackTrace();
            return false;
        } finally {
            entityManager.close();
            emf.close();
        }
    }

}
