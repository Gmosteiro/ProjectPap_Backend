package logic.Usuario.controllers;

import java.time.LocalDate;

public interface IControllerModificarUsuario {
    boolean modificarUsuario(String nickname, String nuevoNombre, String nuevoApellido, LocalDate nuevafecha,
            String img);
}
