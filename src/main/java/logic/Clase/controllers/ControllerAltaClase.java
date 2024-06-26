package logic.Clase.controllers;

import logic.Clase.Clase;
import logic.Usuario.ManejadorUsuarios;
import logic.Usuario.Profesor;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;
import logic.ActividadDeportiva.ManejadorActividad;

public class ControllerAltaClase implements IControllerAltaClase {

    @Override
    public void addClase(String nombre, LocalDate fecha, LocalTime hora, String url, LocalDate fechaReg,
            String nombreProfesor, String img, String actividad) {
        try {

            if (!validateClassData(nombre, "Clase")) {
                return;
            }

            if (nombreProfesor.length() == 0) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar un profesor ", "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            Profesor profesor = ManejadorUsuarios.getProfesor(nombreProfesor);

            Clase nuevaclase = new Clase(nombre, fecha, hora, url, fechaReg, profesor, img);
            ManejadorActividad manejadorA = new ManejadorActividad();
            manejadorA.agregarClaseA(nuevaclase, actividad);
            System.out.println("Clase Creada");

        } catch (Exception errorException) {
            System.out.println("Catch addClase: " + errorException);
            String errorMessage = extractErrorMessage(errorException.getMessage());

        }

    }

    private boolean validateClassData(String nombre, String queryValue) {
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("project_pap");
        EntityManager entityManager = emFactory.createEntityManager();

        try {
            TypedQuery<Clase> query = entityManager.createQuery(
                    "SELECT c FROM " + queryValue + " c WHERE c.nombre = :nombre",
                    Clase.class);
            query.setParameter("nombre", nombre);

            if (query.getResultList().isEmpty()) {// Si está vacío, no existe un usuario con esos datos
                return true;
            } else {

                Clase clase = query.getSingleResult();

                String queryNombre = clase.getNombre();
                String errorMessage = "";

                if (queryNombre.equals(nombre)) {
                    errorMessage = "Ya existe una Clase con ese nombre";
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
