package logic;

import logic.ActividadDeportiva.controllers.ControllerAltaActividad;
import logic.ActividadDeportiva.controllers.IControllerAltaActividad;
import logic.ActividadDeportiva.controllers.IControllerConsultaActividad;
import logic.ActividadDeportiva.controllers.IControllerModificarActividad;
import logic.Institucion.controllers.ControllerAltaInstitucionDeportiva;
import logic.Institucion.controllers.IControllerAltaInstitucionDeportiva;
import logic.Usuario.controllers.ControllerAltaUsuario;
import logic.Usuario.controllers.ControllerConsultaUsuario;
import logic.Usuario.controllers.ControllerInicioSesion;
import logic.ActividadDeportiva.controllers.ControllerConsultaActividad;
import logic.Usuario.controllers.ControllerModificarUsuario;
import logic.Usuario.controllers.ControllerRegistroDictado;
import logic.Usuario.controllers.IControllerAltaUsuario;
import logic.Usuario.controllers.IControllerConsultaUsuario;
import logic.Usuario.controllers.IControllerModificarUsuario;
import logic.Usuario.controllers.IControllerRegistroDictado;
import logic.Usuario.controllers.IControllerInicioSesion;
import logic.Clase.controllers.ControllerAltaClase;
import logic.Clase.controllers.ControllerDictadoClase;
import logic.Clase.controllers.ControllerRanking;
import logic.Clase.controllers.IControllerAltaClase;
import logic.Clase.controllers.IControllerDictadoClase;
import logic.Clase.controllers.IControllerRanking;
import logic.ActividadDeportiva.controllers.ControllerModificarActividad;
import logic.Institucion.controllers.ControllerModificarInstitucion;
import logic.Institucion.controllers.IControllerModificarInstitucion;

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

    public IControllerRanking getControladorRankingActividad() {
        return new ControllerRanking();
    }

    public IControllerModificarActividad getControllerModificarActividad() {
        return new ControllerModificarActividad();
    }

    public IControllerModificarUsuario getControllerModificarUsuario() {
        return new ControllerModificarUsuario();
    }

    public IControllerConsultaActividad getControllerConsultaActividad() {
        return new ControllerConsultaActividad();
    }

    public IControllerRegistroDictado getControllerRegistroDictado() {
        return new ControllerRegistroDictado();

    }

    public IControllerDictadoClase getControllerDictadoClase() {
        return new ControllerDictadoClase();
    }

    public IControllerModificarInstitucion getControllerModificarInstitucion() {
        return new ControllerModificarInstitucion();
    }

    public IControllerInicioSesion getControllerInicioSesion() {
        return new ControllerInicioSesion();
    }

}
