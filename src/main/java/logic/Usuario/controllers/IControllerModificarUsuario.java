package logic.Usuario.controllers;

import java.time.LocalDate;

public interface IControllerModificarUsuario {
    void modificarUsuario(String nickname, String nuevoNombre, String nuevoApellido, LocalDate nuevafecha,
            String img);

    boolean modificarUsuarioWeb(String nickname, String nuevoNombre, String nuevoApellido, LocalDate nuevafecha,
            String img);
}
