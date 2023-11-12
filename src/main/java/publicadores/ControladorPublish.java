/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author santi
 */

package publicadores;

import java.time.LocalDate;
import java.time.LocalTime;

import java.util.List;

import logic.ActividadDeportiva.controllers.IControllerConsultaActividad;
import logic.Usuario.controllers.IControllerConsultaUsuario;
import logic.Usuario.controllers.IControllerInicioSesion;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.Endpoint;
import logic.ActividadDeportiva.ActividadDeportiva;
import logic.Clase.Clase;
import logic.Clase.ManejadorClases;
import logic.Clase.controllers.IControllerAltaClase;
import logic.Clase.controllers.IControllerConsultaClases;
import logic.Clase.controllers.IControllerDictadoClase;
import logic.Clase.controllers.IControllerRanking;
import logic.Fabrica;
import logic.Institucion.InstitucionDeportiva;
import logic.Institucion.ManejadorInstitucion;
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

    private IControllerConsultaActividad iControllerConsultaActividad;

    private IControllerConsultaUsuario iControllerConsultaUsuario;
    private IControllerModificarUsuario iControllerModificarUsuario;
    private IControllerRegistroDictado iControllerRegistroDictado;
    private IControllerAltaClase iControllerAltaClase;
    private IControllerConsultaClases iControllerConsultaClases;
    private IControllerDictadoClase iControllerDictadoClase;
    private IControllerRanking iControllerRanking;
    private IControllerEliminarRegClase iControllerEliminarRegClase;
    private IControllerInicioSesion iControllerIniciarSesion;
    private ManejadorInstitucion manejadorInstitucion;
    private ManejadorUsuarios manejadorUsuarios;
    private ManejadorClases manejadorClases;
    private Endpoint endpoint;

    public ControladorPublish() {
        fabrica = new Fabrica();

        iControllerConsultaActividad = fabrica.getControllerConsultaActividad();
        iControllerConsultaUsuario = fabrica.getControladorConsultaUsuario();
        iControllerModificarUsuario = fabrica.getControllerModificarUsuario();
        iControllerRegistroDictado = fabrica.getControllerRegistroDictado();
        iControllerIniciarSesion = fabrica.getControllerInicioSesion();
        iControllerAltaClase = fabrica.getControladorAltaClase();
        iControllerConsultaClases = fabrica.getControllerConsultaClases();
        iControllerDictadoClase = fabrica.getControllerDictadoClase();
        iControllerRanking = fabrica.getControladorRankingActividad();
        iControllerEliminarRegClase = fabrica.getControllerEliminarRegClase();
        manejadorInstitucion = new ManejadorInstitucion();
        manejadorUsuarios = new ManejadorUsuarios();
        manejadorClases = new ManejadorClases();

    }

    @WebMethod(exclude = true)
    public void publicar() {

        endpoint = Endpoint.publish("http://127.0.0.1:1942/controlador", this);
        System.out.println("http://127.0.0.1:1942/controlador");
    }

    @WebMethod(exclude = true)
    public Endpoint getEndpoint() {
        return endpoint;
    }

    @WebMethod
    public Sesion iniciarSesion(String nickname, String contrasena) {

        return iControllerIniciarSesion.iniciarSesion(nickname, contrasena);
    }

    @WebMethod
    public ActividadDeportiva obtenerActividadPorNombre(String nombreActividad) {
        return iControllerConsultaActividad.obtenerActividadPorNombre(nombreActividad);
    }

    @WebMethod
    public boolean modificarUsuarioWeb(String nickname, String nuevoNombre, String nuevoApellido, String nuevafechaStr,
            String img) {

        LocalDate nuevafecha = LocalDate.now();
        return iControllerModificarUsuario.modificarUsuarioWeb(nickname, nuevoNombre, nuevoApellido, nuevafecha, img);
    }

    @WebMethod
    public void addClase(String nombre, String fechaStr, String horaStr, String url, String fechaRegStr,
            String nombreProfesor, String img, String actividad) {

        LocalDate fecha = LocalDate.now();
        LocalTime hora = LocalTime.now();
        LocalDate fechaReg = LocalDate.now();
        iControllerAltaClase.addClase(nombre, fecha, hora, url, fechaReg, nombreProfesor, img, actividad);
    }

    @WebMethod
    public ActividadDeportiva[] getActividadesByProfe(String nicknameProfesor) {
        List<ActividadDeportiva> listActividades = iControllerConsultaActividad.getActividadesByProfe(nicknameProfesor);

        ActividadDeportiva[] arrayActividades = listActividades.toArray(new ActividadDeportiva[0]);

        return arrayActividades;
    }

    @WebMethod
    public Clase[] getClasesByActividad(String nombreActividad) {
        Clase[] arrayClases = iControllerDictadoClase.getClasesByActividad(nombreActividad).toArray(new Clase[0]);

        return arrayClases;
    }

    @WebMethod
    public boolean eliminarRegistroDeClase(String nombreInstitucion, String nombreActividad, String nombreClase,
            String nicknameSocio) {
        return iControllerEliminarRegClase.eliminarRegistroDeClase(nombreInstitucion, nombreActividad, nombreClase,
                nicknameSocio);
    }

    @WebMethod
    public boolean existenElementos(String nombreInstitucion, String nombreActividad, String nombreClase,
            String nicknameSocio) {
        return iControllerEliminarRegClase.existenElementos(nombreInstitucion, nombreActividad, nombreClase,
                nicknameSocio);
    }

    @WebMethod
    public boolean crearRegistro(Socio socio, Clase clase) {
        return iControllerEliminarRegClase.crearRegistro(socio, clase);
    }

    @WebMethod
    public InstitucionDeportiva getInstitucionesByName(String nombre) {
        return manejadorInstitucion.getInstitucionesByName(nombre);
    }

    @WebMethod
    public Clase[] getClasesByUser(String nickname) {

        Clase[] arraryClases = iControllerConsultaUsuario.getClasesByUser(nickname).toArray(new Clase[0]);
        return arraryClases;
    }

    @WebMethod
    public Clase obtenerClasePorNombre(String nombreClase) {
        return iControllerConsultaClases.obtenerClasePorNombre(nombreClase);
    }

    @WebMethod
    public Clase[] obtenerClasesPorActividad(ActividadDeportiva actividad) {
        return iControllerConsultaClases.obtenerClasesPorActividad(actividad).toArray(new Clase[0]);
    }

    @WebMethod
    public InstitucionDeportiva[] getInstituciones() {
        return manejadorInstitucion.getInstituciones().toArray(new InstitucionDeportiva[0]);

    }

    @WebMethod
    public Usuario[] getSociosByClase(Clase clase) {
        return manejadorUsuarios.getSociosByClase(clase).toArray(new Usuario[0]);
    }

    @WebMethod
    public ActividadDeportiva[] obtenerRankingDeActividades() {
        return iControllerRanking.obtenerRankingDeActividades().toArray(new ActividadDeportiva[0]);
    }

    @WebMethod
    public Clase[] obtenerRankingDeClases() {
        return iControllerRanking.obtenerRankingDeClases().toArray(new Clase[0]);
    }

    @WebMethod
    public boolean validateDataWeb(String nicknameSocio, String nombreClase) {
        return iControllerRegistroDictado.validateDataWeb(nicknameSocio, nombreClase);
    }

    @WebMethod
    public boolean addRegistroDictadoWeb(String nicknameSocio, String nombreClase, String fechaRegStr) {
        LocalDate fechaReg = LocalDate.now();
        return iControllerRegistroDictado.addRegistroDictadoWeb(nicknameSocio, nombreClase, fechaReg);
    }

    @WebMethod
    public Clase getClaseByNombre(String clase) {
        return manejadorClases.getClaseByNombre(clase);
    }

    @WebMethod
    public Socio getSocio(String nicknameSocio) {
        return manejadorUsuarios.getSocio(nicknameSocio);
    }

}
