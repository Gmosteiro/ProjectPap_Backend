package logic;

import logic.interfaces.IControladorUsuario;
import logic.interfaces.IControladorClases;
import logic.interfaces.IControladorInstitucion;
import logic.controladores.ControladorUsuario;
import logic.controladores.ControladorClases;
import logic.controladores.ControladorInstitucion;

public class Fabrica {

    public IControladorUsuario getControladorUsuario() {
        return new ControladorUsuario();
    }

    public IControladorClases getControladorClases() {
        return new ControladorClases();
    }

    public IControladorInstitucion getControladorInstitucion() {
        return new ControladoInstitucion();
    }
}
