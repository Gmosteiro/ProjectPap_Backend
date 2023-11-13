package logic.Clase.controllers;

import logic.Clase.Clase;
import logic.Usuario.ManejadorUsuarios;
import logic.Usuario.Profesor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.swing.JOptionPane;

import logic.ActividadDeportiva.ManejadorActividad;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class ControllerAltaClase implements IControllerAltaClase {
    private ManejadorUsuarios manejadorUsuarios;
    private ManejadorActividad manejadorActividades;
    private EntityManager entityManager;

    public ControllerAltaClase() {
        manejadorUsuarios = new ManejadorUsuarios();
        manejadorActividades = new ManejadorActividad();
        entityManager = Persistence.createEntityManagerFactory("project_pap").createEntityManager();
    }

    @Override
    public void addClase(String nombre, LocalDate fecha, LocalTime hora, String url, LocalDate fechaReg,
                         String nombreProfesor, String img, String actividad) {
        try {
            entityManager.getTransaction().begin();

            if (!validateClassData(nombre, "Clase")) {
                entityManager.getTransaction().rollback();
                return;
            }

            if (nombreProfesor.length() == 0) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar un profesor ", "Error",
                        JOptionPane.ERROR_MESSAGE);
                entityManager.getTransaction().rollback();
                return;
            }

            Profesor profesor = manejadorUsuarios.getProfesor(nombreProfesor);

            Clase nuevaClase = new Clase(nombre, fecha, hora, url, fechaReg, profesor, img);
            manejadorActividades.agregarClaseA(nuevaClase, actividad);

            entityManager.getTransaction().commit();
        } catch (Exception errorException) {
            entityManager.getTransaction().rollback();
            String errorMessage = extractErrorMessage(errorException.getMessage());
            System.out.println("Catch addClase: " + errorMessage);
        } finally {
            entityManager.close();
        }
    }

    private boolean validateClassData(String nombre, String queryValue) {
        try {
            if (entityManager == null || !entityManager.isOpen()) {
                entityManager = Persistence.createEntityManagerFactory("project_pap").createEntityManager();
            }

            List<Clase> listaClases = entityManager.createQuery(
                    "SELECT c FROM " + queryValue + " c WHERE c.nombre = :nombre",
                    Clase.class)
                    .setParameter("nombre", nombre)
                    .getResultList();

            if (listaClases.isEmpty()) {
                return true;
            } else {
                Clase clase = listaClases.get(0);
                String nommbreClase = clase.getNombre();
                String errorMessage = "";

                if (nommbreClase.equals(nombre)) {
                    errorMessage = "Ya existe una Clase con ese nombre";
                }
                JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (Exception e) {
            System.out.println("Catch " + e);
            return false;
        }
    }

    private String extractErrorMessage(String fullErrorMessage) {
        int startIndex = fullErrorMessage.indexOf(":") + 1;

        return startIndex > 0 && startIndex < fullErrorMessage.length() ? fullErrorMessage.substring(startIndex).trim()
                : fullErrorMessage;
    }
}
