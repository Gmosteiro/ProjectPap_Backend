package logic.Usuario.controllers;

import java.time.LocalDate;

import logic.Usuario.*;

import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

import DataBase.DbManager;

public class ControllerModificarUsuario implements IControllerModificarUsuario {

    private DbManager controllerBD;
    private ManejadorUsuarios manejadorUsuarios;

    private EntityManager entityManager;

    public ControllerModificarUsuario() {
        controllerBD = DbManager.getInstance();
        manejadorUsuarios = new ManejadorUsuarios();

    }

    public void modificarUsuario(String nickname, String nuevoNombre, String nuevoApellido, LocalDate nuevafecha,
            String img) {
        try {

            entityManager = controllerBD.getEntityManager();

            Usuario usuario = manejadorUsuarios.getUser(nickname);
            if (usuario != null) {
                if (usuario instanceof Profesor) {

                    entityManager.getTransaction().begin();

                    Profesor profesor = entityManager.find(Profesor.class, usuario.getId_usuario());
                    profesor.setNombre(nuevoNombre);
                    profesor.setApellido(nuevoApellido);
                    profesor.setFechaNac(nuevafecha);
                    profesor.setImg(img);
                    entityManager.merge(profesor);
                    entityManager.getTransaction().commit();

                } else if (usuario instanceof Socio) {

                    entityManager.getTransaction().begin();

                    Socio socio = entityManager.find(Socio.class, usuario.getId_usuario());
                    socio.setNombre(nuevoNombre);
                    socio.setApellido(nuevoApellido);
                    socio.setFechaNac(nuevafecha);
                    socio.setImg(img);
                    entityManager.merge(socio);
                    entityManager.getTransaction().commit();

                }

                System.out.println("Usuario modificado exitosamente.");
                JOptionPane.showMessageDialog(null, "Usuario Actualizado!", "Success", JOptionPane.INFORMATION_MESSAGE);

            } else {
                // Manejar el usuario no encontrado
                System.out.println("No se encontró el usuario.");

                JOptionPane.showMessageDialog(
                        null, // Parent component (null for default)
                        "No encontrado", // Message text
                        "Error", // Dialog title
                        JOptionPane.INFORMATION_MESSAGE // Message type merecuetengue dijo el juan
                );
            }

            controllerBD.closeEntityManager();

        } catch (Exception e) {
            System.out.println("Catch modificarUsuario: " + e);

        }
    }

    public boolean modificarUsuarioWeb(String nickname, String nuevoNombre, String nuevoApellido, LocalDate nuevafecha,
            String img) {
        try {
            entityManager = controllerBD.getEntityManager();

            Usuario usuario = manejadorUsuarios.getUser(nickname);
            if (usuario != null) {
                if (usuario instanceof Profesor) {
                    entityManager.getTransaction().begin();

                    Profesor profesor = entityManager.find(Profesor.class, usuario.getId_usuario());
                    profesor.setNombre(nuevoNombre);
                    profesor.setApellido(nuevoApellido);
                    profesor.setFechaNac(nuevafecha);
                    profesor.setImg(img);
                    entityManager.merge(profesor);
                    entityManager.getTransaction().commit();
                } else if (usuario instanceof Socio) {

                    entityManager.getTransaction().begin();

                    Socio socio = entityManager.find(Socio.class, usuario.getId_usuario());
                    socio.setNombre(nuevoNombre);
                    socio.setApellido(nuevoApellido);
                    socio.setFechaNac(nuevafecha);
                    socio.setImg(img);
                    entityManager.merge(socio);
                    entityManager.getTransaction().commit();

                }
                controllerBD.closeEntityManager();

                System.out.println("Usuario modificado exitosamente.");
                return true;
            } else {

                System.out.println("No se encontró el usuario.");

                return false;
            }
        } catch (Exception e) {
            System.out.println("Catch modificarUsuario: " + e);
            return false;
        }
    }
}
