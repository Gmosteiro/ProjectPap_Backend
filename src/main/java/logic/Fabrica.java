package logic;

import logic.controllers.*;

public class Fabrica {

    public IControllerAltaUsuario getControladorAltaUsuario() {
        return new ControllerAltaUsuario();
    }
    
    public IControllerAltaInstitucionDeportiva getControladorAltaInstitucionDeportiva() {
        return new ControllerAltaInstitucionDeportiva();
    }

    // public IControllerClases getControladorClases() {
    // return new ControladorClases();
    // }

    // public IControllerInstitucion getControladorInstitucion() {
    // return new ControladoInstitucion();
    // }

    public IControllerAltaActividad getControladorAltaActividad() {
    return new ControllerAltaActividad();
}


}
