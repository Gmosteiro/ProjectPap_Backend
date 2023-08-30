package logic.Usuario.controllers;

import logic.Usuario.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ControllerModificarUsuario implements IControllerModificarUsuario {

    public void modificarUsuario(String nickname, String nuevoNombre, String nuevoApellido) {
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
                } else if (usuario instanceof Socio) {
                    Socio socio = (Socio) usuario;
                    socio.setNombre(nuevoNombre);
                    socio.setApellido(nuevoApellido);
                }

                em.merge(usuario); // Actualizar la entidad
                em.getTransaction().commit();

                System.out.println("Usuario modificado exitosamente.");
            } else {
                // Manejar el usuario no encontrado
                System.out.println("No se encontró el usuario.");
            }
        } catch (Exception e) {
            // Manejar excepciones
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }
}
