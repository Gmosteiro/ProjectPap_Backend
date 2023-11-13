package logic.Clase.controllers;

import logic.Clase.Clase;
import logic.Institucion.ManejadorInstitucion;
import logic.Usuario.ManejadorUsuarios;
import logic.Usuario.Profesor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.swing.JOptionPane;

import logic.ActividadDeportiva.ManejadorActividad;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ControllerAltaClase implements IControllerAltaClase {
    private ManejadorActividad manejadorActividades;
    private ManejadorInstitucion manejadorInstitucion;
    private ManejadorUsuarios manejadorUsuarios;
    private EntityManagerFactory emf;

    public ControllerAltaClase() {
        manejadorActividades = new ManejadorActividad();
        manejadorInstitucion = new ManejadorInstitucion();
        manejadorUsuarios = new ManejadorUsuarios();
        emf = Persistence.createEntityManagerFactory("project_pap");

    }

    @Override
    public void addClase(String nombre, LocalDate fecha, LocalTime hora, String url, LocalDate fechaReg,
            String nombreProfesor, String img, String actividad) {
        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            if (!validateClassData(nombre, "Clase")) {
                transaction.rollback();
                return;
            }

            if (nombreProfesor.length() == 0) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar un profesor ", "Error",
                        JOptionPane.ERROR_MESSAGE);
                transaction.rollback();
                return;
            }

            Profesor profesor = manejadorUsuarios.getProfesor(nombreProfesor);

            Clase nuevaClase = new Clase(nombre, fecha, hora, url, fechaReg, profesor, img);
            manejadorActividades.agregarClaseA(nuevaClase, actividad);

            transaction.commit();

        } catch (Exception errorException) {
            if (transaction != null && transaction.isActive()) {
            transaction.rollback();
            }
            String errorMessage = extractErrorMessage(errorException.getMessage());
            System.out.println("Catch addClase: " + errorMessage);
        } finally {
            entityManager.close();
        }
    }

    private boolean validateClassData(String nombre, String queryValue) {
        EntityManager entityManager = emf.createEntityManager();
        try {
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
