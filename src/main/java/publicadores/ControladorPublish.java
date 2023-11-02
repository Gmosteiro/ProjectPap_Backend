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
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
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
import logic.ActividadDeportiva.ActividadDeportiva;
import logic.ActividadDeportiva.ManejadorActividad;
import logic.ActividadDeportiva.controllers.IControllerAltaActividad;
import logic.ActividadDeportiva.controllers.IControllerModificarActividad;
import logic.Clase.Clase;
import logic.Clase.controllers.IControllerAltaClase;
import logic.Clase.controllers.IControllerConsultaClases;
import logic.Clase.controllers.IControllerDictadoClase;
import logic.Clase.controllers.IControllerRanking;
import logic.Fabrica;
import logic.Institucion.InstitucionDeportiva;
import logic.Institucion.ManejadorInstitucion;
import logic.Institucion.controllers.IControllerAltaInstitucionDeportiva;
import logic.Institucion.controllers.IControllerModificarInstitucion;
import logic.Usuario.ManejadorUsuarios;
import logic.Usuario.Sesion;
import logic.Usuario.Socio;
import logic.Usuario.Usuario;
import logic.Usuario.controllers.IControllerEliminarRegClase;
import logic.Usuario.controllers.IControllerModificarUsuario;
import logic.Usuario.controllers.IControllerRegistroDictado;


@WebService
@SOAPBinding(style = Style.RPC, parameterStyle = ParameterStyle.WRAPPED)
public class ControladorPublish {
    private Fabrica fabrica;
    private IControllerConsultaActividad iconConsultaActividad;
    private IControllerAltaUsuario iconAltaUsuario;
    private IControllerConsultaUsuario iconConsultaUsuario;
    private IControllerInicioSesion iconInicioSesion;

    private IControllerAltaActividad iControllerAltaActividad;
    private IControllerConsultaActividad iControllerConsultaActividad;
    private IControllerModificarActividad iControllerModificarActividad;
    private IControllerAltaInstitucionDeportiva iControllerAltaInstitucionDeportiva;
    private IControllerAltaUsuario iControllerAltaUsuario;
    private IControllerConsultaUsuario iControllerConsultaUsuario;
    private IControllerModificarUsuario iControllerModificarUsuario;
    private IControllerRegistroDictado iControllerRegistroDictado;
    private IControllerInicioSesion iControllerInicioSesion;
    private IControllerAltaClase iControllerAltaClase;
    private IControllerConsultaClases iControllerConsultaClases;
    private IControllerDictadoClase iControllerDictadoClase;
    private IControllerRanking iControllerRanking;
    private IControllerModificarInstitucion iControllerModificarInstitucion;
    private IControllerEliminarRegClase iControllerEliminarRegClase;



    private WebServiceConfiguracion configuracion;
    private Endpoint endpoint;

    public ControladorPublish() {
        fabrica = new Fabrica();
       iControllerAltaActividad = fabrica.getControladorAltaActividad();
        iControllerConsultaActividad = fabrica.getControllerConsultaActividad();
        iControllerModificarActividad = fabrica.getControllerModificarActividad();
        iControllerAltaInstitucionDeportiva = fabrica.getControladorAltaInstitucionDeportiva();
        iControllerAltaUsuario = fabrica.getControladorAltaUsuario();
        iControllerConsultaUsuario = fabrica.getControladorConsultaUsuario();
        iControllerModificarUsuario = fabrica.getControllerModificarUsuario();
        iControllerRegistroDictado = fabrica.getControllerRegistroDictado();
        iControllerInicioSesion = fabrica.getControllerInicioSesion();
        iControllerAltaClase = fabrica.getControladorAltaClase();
        iControllerConsultaClases = fabrica.getControllerConsultaClases();
        iControllerDictadoClase = fabrica.getControllerDictadoClase();
        iControllerRanking = fabrica.getControladorRankingActividad();
        iControllerModificarInstitucion = fabrica.getControllerModificarInstitucion();
        iControllerEliminarRegClase = fabrica.getControllerEliminarRegClase();
        
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
    public Sesion iniciarSesion(String nickname, String contrasena) {
       return iconInicioSesion.iniciarSesion(nickname, contrasena);
    }

    @WebMethod
    public ActividadDeportiva obtenerActividadPorNombre(String nombreActividad) {
        return iconConsultaActividad.obtenerActividadPorNombre(nombreActividad);
    }
    
    
    @WebMethod
    public boolean modificarUsuarioWeb(String nickname, String nuevoNombre, String nuevoApellido, LocalDate nuevafecha,String img){
        return iControllerModificarUsuario.modificarUsuarioWeb(nickname,nuevoNombre,nuevoApellido,nuevafecha,img);
    }
    
    @WebMethod
    public void addClase(String nombre, LocalDate fecha, LocalTime hora, String url, LocalDate fechaReg, String nombreProfesor, String img, String actividad){
        iControllerAltaClase.addClase( nombre,  fecha,  hora,  url,  fechaReg,  nombreProfesor,  img,  actividad);
    }
    
    @WebMethod
    public List<ActividadDeportiva> getActividadesByProfe(String nicknameProfesor){
        return iControllerConsultaActividad.getActividadesByProfe(nicknameProfesor);
    }
    

     @WebMethod
    public List<Clase> getClasesByActividad(String nombreActividad){
        return iControllerDictadoClase.getClasesByActividad(nombreActividad);
    }

     @WebMethod
    public boolean eliminarRegistroDeClase(String nombreInstitucion, String nombreActividad, String nombreClase, String nicknameSocio){
        return iControllerEliminarRegClase.eliminarRegistroDeClase( nombreInstitucion,  nombreActividad,  nombreClase,  nicknameSocio);
    }
    
   
     @WebMethod
    public boolean existenElementos(String nombreInstitucion, String nombreActividad, String nombreClase, String nicknameSocio){
        return iControllerEliminarRegClase.existenElementos( nombreInstitucion,  nombreActividad,  nombreClase,  nicknameSocio);
    }
    
     @WebMethod
    public boolean crearRegistro(Socio socio, Clase clase){
        return iControllerEliminarRegClase.crearRegistro( socio, clase);
    }
    
    @WebMethod
    public InstitucionDeportiva getInstitucionesByName(String nombre){
       return  ManejadorInstitucion.getInstitucionesByName( nombre);
    }

    
   @WebMethod
    public  List<Clase> getClasesByUser(String nickname){
        return iControllerConsultaUsuario.getClasesByUser(nickname);
    }
    
    
    @WebMethod
    public Clase obtenerClasePorNombre(String nombreClase){
         return iControllerConsultaClases.obtenerClasePorNombre( nombreClase);
    }
         
    @WebMethod
    public  List<Clase> obtenerClasesPorActividad(ActividadDeportiva actividad){
        return iControllerConsultaClases.obtenerClasesPorActividad(actividad);
    }
    
     @WebMethod
    public  List<InstitucionDeportiva> getInstituciones( ){
        return ManejadorInstitucion.getInstituciones();
    }
    
     @WebMethod
    public  List<Usuario>  getSociosByClase(Clase clase){
        return ManejadorUsuarios.getSociosByClase(clase);
    }
    
    
      @WebMethod
    public  List<ActividadDeportiva>obtenerRankingDeActividades(){
        return iControllerRanking.obtenerRankingDeActividades();
    }
    
     @WebMethod
    public  List<Clase>obtenerRankingDeClases(){
        return iControllerRanking.obtenerRankingDeClases();
    }           
                
           
                
     @WebMethod
    public boolean validateDataWeb(String nicknameSocio, String nombreClase){
        return iControllerRegistroDictado.validateDataWeb( nicknameSocio, nombreClase);
    }
    
    @WebMethod
    public boolean  addRegistroDictadoWeb(String nicknameSocio, String nombreClase, LocalDate fechaReg){
        return iControllerRegistroDictado.addRegistroDictadoWeb( nicknameSocio,  nombreClase, fechaReg);
    }
    
                
    
    
  
    
}
