package logic.Usuario.controllers;

import logic.Usuario.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


// El caso de uso comienza cuando el administrador desea modificar el perfil de un usuario.
//  Para ello el sistema muestra la lista de todos los usuarios y el administrador elige uno.
//   Luego, el sistema muestra todos los datos básicos del usuario. 
//   El administrador puede editar todos los datos básicos, menos el nickname y el correo electrónico.
//    Cuando termina la edición, el sistema actualiza los datos del usuario.

// CUANDO HAGAN LA VENTANA EL LIST ESTA EN EL MANEJADOR (LLAMALO DE AHI, ESTA FUNCION NO LO TIENE XQ LLAMAR)

public class ControllerModificarUsuario implements IControllerModificarUsuario {
    private final ManejadorUsuarios manejadorUsuarios;

    public ControllerModificarUsuario() {
        manejadorUsuarios = new ManejadorUsuarios();
    }

    public void modificarUsuario(String nickname, String nuevoNombre, String nuevoApellido) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

            Usuario usuario = manejadorUsuarios.getUser(nickname);
            if (usuario != null) {
                // Actualizar los datos del usuario con los valores editados
                usuario.setNombre(nuevoNombre);
                usuario.setApellido(nuevoApellido);

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
