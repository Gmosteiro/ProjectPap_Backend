package logic;

import logic.controllers.*;

public class Fabrica {

    public IControllerAltaUsuario getControladorAltaUsuario() {
        return new ControllerAltaUsuario();
    }

    // public IControllerClases getControladorClases() {
    // return new ControladorClases();
    // }

    // public IControllerInstitucion getControladorInstitucion() {
    // return new ControladoInstitucion();
    // }
}
