package logic.Usuario.controllers;

import logic.Usuario.ManejadorUsuarios;
import logic.Usuario.Profesor;
import logic.Usuario.Usuario;
import logic.Usuario.Sesion;

public class ControllerInicioSesion implements IControllerInicioSesion {

    @Override
    public Sesion iniciarSesion(String nickname, String contrasena) {
        // Intentamos obtener un Usuario con el nickname proporcionado
        Usuario usuario = ManejadorUsuarios.getUser(nickname);

        System.out.println("Usuario: " + usuario);
        System.out.println("usuario.getContrasena() " + usuario.getContrasena());

        if (usuario != null && usuario.getContrasena().equals(contrasena)) {

            return crearSesion(usuario);
        } else {
            return null;
        }

        // Si no encontramos un usuario con ese nickname o la contraseña es incorrecta,
    }

    private Sesion crearSesion(Usuario user) {
        try {

            String profileImage = "https://thumbs.dreamstime.com/b/default-avatar-profile-icon-vector-social-media-user-image-182145777.jpg";
            String type = user instanceof Profesor ? "Profesor" : "Socio";
            Sesion nuevaSesion = new Sesion(user.getNickname(), user.getEmail(), user.getNombre(), user.getApellido(),
                    type, profileImage);

            return nuevaSesion;
        } catch (Exception e) {
            System.out.println("Catch crearSesion: " + e);
            return null;
        }

    }
}
