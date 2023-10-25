/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author santi
 */

package publicadores;


import Configuraciones.WebServiceConfiguracion;
import logic.ActividadDeportiva.controllers.IControllerConsultaActividad;
import logic.Usuario.controllers.IControllerAltaUsuario;
import logic.Usuario.controllers.IControllerConsultaUsuario;
import logic.Usuario.controllers.IControllerInicioSesion;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.Endpoint;
import logic.Fabrica;


@WebService
@SOAPBinding(style = Style.RPC, parameterStyle = ParameterStyle.WRAPPED)
public class ControladorPublish {
    private Fabrica fabrica;
    private IControllerConsultaActividad iconConsultaActividad;
    private IControllerAltaUsuario iconAltaUsuario;
    private IControllerConsultaUsuario iconConsultaUsuario;
    private IControllerInicioSesion iconInicioSesion;

    private WebServiceConfiguracion configuracion;
    private Endpoint endpoint;

    public ControladorPublish() {
        fabrica = new Fabrica();
        iconConsultaActividad = fabrica.getControllerConsultaActividad();
        iconAltaUsuario = fabrica.getControladorAltaUsuario();
        iconConsultaUsuario = fabrica.getControladorConsultaUsuario();
        iconInicioSesion = fabrica.getControllerInicioSesion();

        try {
            configuracion = new WebServiceConfiguracion();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @WebMethod(exclude = true)
    public void publicar() {
//        endpoint = Endpoint.publish("http://" + configuracion.getConfigOf("#WS_IP") + ":" + configuracion.getConfigOf("#WS_PORT") + "/controlador", this);
//        System.out.println("http://" + configuracion.getConfigOf("#WS_IP") + ":" + configuracion.getConfigOf("#WS_PORT") + "/controlador");
endpoint = Endpoint.publish("http://127.0.0.1:1942/controlador", this);
    System.out.println("http://127.0.0.1:1942/controlador");
    }

    @WebMethod(exclude = true)
    public Endpoint getEndpoint() {
        return endpoint;
    }

    @WebMethod
    public void iniciarSesion(String nickname, String contrasena) {
        iconInicioSesion.iniciarSesion(nickname, contrasena);
    }

    @WebMethod
    public void obtenerActividadPorNombre(String nombreActividad) {
        iconConsultaActividad.obtenerActividadPorNombre(nombreActividad);
    }
}
