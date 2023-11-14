package logic.Usuario.controllers;

import java.time.LocalDate;

import logic.Usuario.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

public class ControllerModificarUsuario implements IControllerModificarUsuario {

    private ManejadorUsuarios manejadorUsuarios;

    public ControllerModificarUsuario() {

        manejadorUsuarios = new ManejadorUsuarios();

    }

    public void modificarUsuario(String nickname, String nuevoNombre, String nuevoApellido, LocalDate nuevafecha,
            String img) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");

        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {

            Usuario usuario = manejadorUsuarios.getUser(nickname);
            if (usuario != null) {
                if (usuario instanceof Profesor) {

                    transaction.begin();

                    Profesor profesor = entityManager.find(Profesor.class, usuario.getId_usuario());
                    profesor.setNombre(nuevoNombre);
                    profesor.setApellido(nuevoApellido);
                    profesor.setFechaNac(nuevafecha);
                    profesor.setImg(img);
                    entityManager.merge(profesor);

                    transaction.commit();

                } else if (usuario instanceof Socio) {

                    transaction.begin();

                    Socio socio = entityManager.find(Socio.class, usuario.getId_usuario());
                    socio.setNombre(nuevoNombre);
                    socio.setApellido(nuevoApellido);
                    socio.setFechaNac(nuevafecha);
                    socio.setImg(img);
                    entityManager.merge(socio);
                    transaction.commit();

                }

                System.out.println("Usuario modificado exitosamente.");
                JOptionPane.showMessageDialog(null, "Usuario Actualizado!", "Success", JOptionPane.INFORMATION_MESSAGE);

            } else {

                System.out.println("No se encontró el usuario.");

                JOptionPane.showMessageDialog(
                        null, // Parent component (null for default)
                        "No encontrado", // Message text
                        "Error", // Dialog title
                        JOptionPane.INFORMATION_MESSAGE // Message type merecuetengue dijo el juan
                );
            }

        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            System.out.println("Catch modificarUsuario: " + e);
            e.printStackTrace();
        } finally {
            entityManager.close();
            emf.close();
        }

    }

    public boolean modificarUsuarioWeb(String nickname, String nuevoNombre, String nuevoApellido, LocalDate nuevafecha,
            String img) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");

        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {

            Usuario usuario = manejadorUsuarios.getUser(nickname);
            if (usuario != null) {
                if (usuario instanceof Profesor) {
                    transaction.begin();

                    Profesor profesor = entityManager.find(Profesor.class, usuario.getId_usuario());
                    profesor.setNombre(nuevoNombre);
                    profesor.setApellido(nuevoApellido);
                    profesor.setFechaNac(nuevafecha);
                    profesor.setImg(img);
                    entityManager.merge(profesor);
                    transaction.commit();

                } else if (usuario instanceof Socio) {

                    transaction.begin();

                    Socio socio = entityManager.find(Socio.class, usuario.getId_usuario());
                    socio.setNombre(nuevoNombre);
                    socio.setApellido(nuevoApellido);
                    socio.setFechaNac(nuevafecha);
                    socio.setImg(img);
                    entityManager.merge(socio);
                    transaction.commit();

                }

                System.out.println("Usuario modificado exitosamente.");
                return true;
            } else {

                System.out.println("No se encontró el usuario.");

                return false;
            }

        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            System.out.println("Catch modificarUsuarioWeb: " + e);
            e.printStackTrace();
            return false;
        } finally {
            entityManager.close();
            emf.close();
        }

    }
}
