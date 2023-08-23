package logic;

import logic.ActividadDeportiva.controllers.ControllerAltaActividad;
import logic.ActividadDeportiva.controllers.IControllerAltaActividad;
import logic.Institucion.controllers.ControllerAltaInstitucionDeportiva;
import logic.Institucion.controllers.IControllerAltaInstitucionDeportiva;
import logic.Usuario.controllers.ControllerAltaUsuario;
import logic.Usuario.controllers.ControllerConsultaUsuario;
import logic.Usuario.controllers.IControllerAltaUsuario;
import logic.Usuario.controllers.IControllerConsultaUsuario;
import logic.Clase.controllers.ControllerAltaClase;
import logic.Clase.controllers.ControllerDictadoClase;
import logic.Clase.controllers.IControllerAltaClase;
import logic.Clase.controllers.IControllerDictadoClase;

public class Fabrica {

    public IControllerAltaUsuario getControladorAltaUsuario() {
        return new ControllerAltaUsuario();
    }

    public IControllerAltaInstitucionDeportiva getControladorAltaInstitucionDeportiva() {
        return new ControllerAltaInstitucionDeportiva();
    }

    public IControllerAltaClase getControladorAltaClase() {
        return new ControllerAltaClase();
    }

    public IControllerAltaActividad getControladorAltaActividad() {
        return new ControllerAltaActividad();
    }

    public IControllerDictadoClase getControladorDictadoClase() {
        return new ControllerDictadoClase();
    }

    public IControllerConsultaUsuario getControladorConsultaUsuario() {
        return new ControllerConsultaUsuario();
    }

}
