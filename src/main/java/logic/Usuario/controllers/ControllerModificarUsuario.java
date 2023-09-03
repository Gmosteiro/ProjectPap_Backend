package logic.Usuario.controllers;

import java.time.LocalDate;
import logic.Usuario.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

public class ControllerModificarUsuario implements IControllerModificarUsuario {

    public void modificarUsuario(String nickname, String nuevoNombre, String nuevoApellido, LocalDate nuevafecha) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            Usuario usuario = ManejadorUsuarios.getUser(nickname);
            if (usuario != null) {
                if (usuario instanceof Profesor) {
                    Profesor profesor = (Profesor) usuario;
                    profesor.setNombre(nuevoNombre);
                    profesor.setApellido(nuevoApellido);
                    profesor.setFechaNac(nuevafecha);
                } else if (usuario instanceof Socio) {
                    Socio socio = (Socio) usuario;
                    socio.setNombre(nuevoNombre);
                    socio.setApellido(nuevoApellido);
                    socio.setFechaNac(nuevafecha);
                }
                em.merge(usuario); // Actualizar la entidad ACA ESTA EL PROBLEMA
                em.getTransaction().commit();

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
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }
}
