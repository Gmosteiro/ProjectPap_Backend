package logic.Usuario.controllers;

import logic.Usuario.ManejadorUsuarios;
import logic.Usuario.Profesor;
import logic.Usuario.Usuario;
import logic.Usuario.Sesion;

public class ControllerInicioSesion implements IControllerInicioSesion {
    private ManejadorUsuarios manejadorUsuarios;

    public ControllerInicioSesion() {
        manejadorUsuarios = new ManejadorUsuarios();
    }

    @Override
    public Sesion iniciarSesion(String nickname, String contrasena) {
        // Intentamos obtener un Usuario con el nickname proporcionado
        Usuario usuario = manejadorUsuarios.getUser(nickname);

        if (usuario != null && usuario.getContrasena() != null && usuario.getContrasena().equals(contrasena)) {

            return crearSesion(usuario);
        } else {
            return null;
        }

    }

    private Sesion crearSesion(Usuario user) {
        try {

            String type = user instanceof Profesor ? "Profesor" : "Socio";
            Sesion nuevaSesion = new Sesion(user.getNickname(), user.getEmail(), user.getNombre(), user.getApellido(),
                    type, user.getImg(), user.getFechaNacFromatted());

            return nuevaSesion;
        } catch (Exception e) {
            System.out.println("Catch crearSesion: " + e);
            return null;
        }

    }

    public Sesion actualizarSesion(String nickname) {

        Usuario usuario = manejadorUsuarios.getUser(nickname);

        if (usuario != null) {

            return crearSesion(usuario);
        } else {

            return null;
        }

    }

}
