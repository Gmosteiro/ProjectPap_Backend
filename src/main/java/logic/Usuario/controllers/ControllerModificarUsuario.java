package logic.Usuario.controllers;

import java.time.LocalDate;
import logic.Usuario.*;

import javax.swing.JOptionPane;

public class ControllerModificarUsuario implements IControllerModificarUsuario {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");
    EntityManager em = emf.createEntityManager();

    public void modificarUsuario(String nickname, String nuevoNombre, String nuevoApellido, LocalDate nuevafecha,
            String img) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            Usuario usuario = ManejadorUsuarios.getUser(nickname);
            if (usuario != null) {
                if (usuario instanceof Profesor) {
                    Profesor profesor = em.find(Profesor.class, usuario.getId_usuario());
                    profesor.setNombre(nuevoNombre);
                    profesor.setApellido(nuevoApellido);
                    profesor.setFechaNac(nuevafecha);
                    profesor.setImg(img);
                    em.merge(profesor);
                    em.getTransaction().commit();
                } else if (usuario instanceof Socio) {
                    Socio socio = em.find(Socio.class, usuario.getId_usuario());
                    socio.setNombre(nuevoNombre);
                    socio.setApellido(nuevoApellido);
                    socio.setFechaNac(nuevafecha);
                    socio.setImg(img);
                    em.merge(socio);
                    em.getTransaction().commit();

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
        } catch (Exception e) {
            System.out.println("Catch modificarUsuario: " + e);
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }

    public boolean modificarUsuarioWeb(String nickname, String nuevoNombre, String nuevoApellido, LocalDate nuevafecha,
            String img) {
        try {
            em.getTransaction().begin();
            Usuario usuario = ManejadorUsuarios.getUser(nickname);
            if (usuario != null) {
                if (usuario instanceof Profesor) {
                    Profesor profesor = em.find(Profesor.class, usuario.getId_usuario());
                    profesor.setNombre(nuevoNombre);
                    profesor.setApellido(nuevoApellido);
                    profesor.setFechaNac(nuevafecha);
                    profesor.setImg(img);
                    em.merge(profesor);
                    em.getTransaction().commit();
                } else if (usuario instanceof Socio) {
                    Socio socio = em.find(Socio.class, usuario.getId_usuario());
                    socio.setNombre(nuevoNombre);
                    socio.setApellido(nuevoApellido);
                    socio.setFechaNac(nuevafecha);
                    socio.setImg(img);
                    em.merge(socio);
                    em.getTransaction().commit();

                }
                em.close();
                emf.close();
                System.out.println("Usuario modificado exitosamente.");
                return true;
            } else {
                // Manejar el usuario no encontrado
                em.close();
                emf.close();
                System.out.println("No se encontró el usuario.");

                return false;
            }
        } catch (Exception e) {
            System.out.println("Catch modificarUsuario: " + e);
            return false;
        }
    }
}
