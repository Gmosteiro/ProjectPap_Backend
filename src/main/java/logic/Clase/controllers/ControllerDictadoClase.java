package logic.Clase.controllers;

import logic.Institucion.InstitucionDeportiva;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import java.util.List;

public class ControllerDictadoClase implements IControllerDictadoClase {
    public List<InstitucionDeportiva> instituciones;

    @Override
    public List<InstitucionDeportiva> getInstituciones() {
        try {

            EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("project_pap");
            EntityManager entityManager = emFactory.createEntityManager();

            instituciones = entityManager
                    .createQuery("SELECT e FROM InstitucionDeportiva e", InstitucionDeportiva.class).getResultList();

            return instituciones;
        } catch (Exception errorException) {
            System.out.println("Catch addSocio: " + errorException);
            String errorMessage = extractErrorMessage(errorException.getMessage());
            JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
            return instituciones;

        }
    }

    private String extractErrorMessage(String fullErrorMessage) {
        int startIndex = fullErrorMessage.indexOf(":") + 1; // Encuentra la posición después del primer ":"

        return startIndex > 0 && startIndex < fullErrorMessage.length() ? fullErrorMessage.substring(startIndex).trim()
                : fullErrorMessage;
    }

}
