package logic;

import logic.ActividadDeportiva.controllers.ControllerAltaActividad;
import logic.ActividadDeportiva.controllers.IControllerAltaActividad;
import logic.Institucion.controllers.ControllerAltaInstitucionDeportiva;
import logic.Institucion.controllers.IControllerAltaInstitucionDeportiva;
import logic.Usuario.controllers.ControllerAltaUsuario;
import logic.Usuario.controllers.IControllerAltaUsuario;

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
