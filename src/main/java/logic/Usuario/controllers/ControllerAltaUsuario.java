package logic.Usuario.controllers;

import logic.Usuario.*;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;

public class ControllerAltaUsuario implements IControllerAltaUsuario {

    @Override
    public void addProfesor(String nickname, String nombre, String apellido, String email, LocalDate fechaNac,
            String descripcion, String biografia, String sitioWeb) {
        try {

            if (!validateUserData(nickname, email, "Profesor")) {
                return;
            }

            Profesor nuevoProfesor = new Profesor(nickname, nombre, apellido, email, fechaNac, email, descripcion,
                    biografia, sitioWeb);

            ManejadorUsuarios manejador = new ManejadorUsuarios();

            manejador.agregarUsuario(nuevoProfesor);

            System.out.println("Profesor Creado");

        } catch (Exception errorException) {
            // Obtener solo la descripción del error
            System.out.println("Catch addProfesor: " + errorException);
            String errorMessage = extractErrorMessage(errorException.getMessage());
            JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);

        }
    }

    @Override
    public void addSocio(String nickname, String nombre, String apellido, String email, LocalDate fechaNac) {
        try {

            if (!validateUserData(nickname, email, "Socio")) {
                return;
            }

            Socio nuevoSocio = new Socio(nickname, nombre, apellido, email, fechaNac);

            ManejadorUsuarios manejador = new ManejadorUsuarios();

            manejador.agregarUsuario(nuevoSocio);

            System.out.println("Socio Creado");

        } catch (Exception errorException) {
            System.out.println("Catch addSocio: " + errorException);
            String errorMessage = extractErrorMessage(errorException.getMessage());
            JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);

        }

    }

    private boolean validateUserData(String nickname, String email, String queryValue) {
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("project_pap");
        EntityManager entityManager = emFactory.createEntityManager();

        try {
            TypedQuery<Usuario> query = entityManager.createQuery(
                    "SELECT u FROM " + queryValue + " u WHERE u.nickname = :nickname OR u.email = :email",
                    Usuario.class);
            query.setParameter("nickname", nickname);
            query.setParameter("email", email);

            if (query.getResultList().isEmpty()) {// Si está vacío, no existe un usuario con esos datos
                return true;
            } else {

                Usuario user = query.getSingleResult();

                String queryEmail = user.getEmail();
                String queryNickname = user.getNickname();
                String errorMessage = "";

                if (queryNickname.equals(nickname)) {
                    errorMessage = "Ya existe un usuario con ese nickname";
                } else if (queryEmail.equals(email)) {
                    errorMessage = "Ya existe un usuario con ese email asociado";
                }
                JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } finally {
            entityManager.close();
            emFactory.close();
        }
    }

    // Función para extraer la descripción del error de la cadena completa
    private String extractErrorMessage(String fullErrorMessage) {
        int startIndex = fullErrorMessage.indexOf(":") + 1; // Encuentra la posición después del primer ":"

        return startIndex > 0 && startIndex < fullErrorMessage.length() ? fullErrorMessage.substring(startIndex).trim()
                : fullErrorMessage;
    }
}
