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

import DataTypes.DtActividadDeportiva;
import DataTypes.DtClase;
import DataTypes.DtInstitucion;
import DataTypes.DtUsuario;
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
    public DtActividadDeportiva obtenerActividadPorNombre(String nombreActividad) {
        ActividadDeportiva ac = iControllerConsultaActividad.obtenerActividadPorNombre(nombreActividad);

        LocalDate fecha = ac.getFechaReg();

        DtActividadDeportiva dtActividaDeportiva = new DtActividadDeportiva(ac.getNombre(), ac.getDescripcion(),
                ac.getDuracion(), ac.getCosto(), fecha.toString());

        return dtActividaDeportiva;

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
    public DtActividadDeportiva[] getActividadesByProfe(String nicknameProfesor) {
        List<ActividadDeportiva> listActividades = iControllerConsultaActividad.getActividadesByProfe(nicknameProfesor);
        int it = 0;

        DtActividadDeportiva[] actividadesTR = new DtActividadDeportiva[listActividades.size()];
        for (ActividadDeportiva ac : listActividades) {
            actividadesTR[it] = new DtActividadDeportiva(ac.getNombre(), ac.getDescripcion(), ac.getDuracion(),
                    ac.getCosto(), ac.getFechaReg().toString());
            it = it + 1;

        }

        return actividadesTR;
    }

    @WebMethod
    public DtClase[] getClasesByActividad(String nombreActividad) {
        List<Clase> listClases = iControllerDictadoClase.getClasesByActividad(nombreActividad);

        int it = 0;
        DtClase[] clasesTR = new DtClase[listClases.size()];
        for (Clase clase : listClases) {
            clasesTR[it] = new DtClase(clase.getNombre(), clase.getFechaFormatted(), clase.getFechaReg().toString(),
                    clase.getHora().toString(), clase.getUrl());
            it = it + 1;

        }

        return clasesTR;
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
    public DtInstitucion getInstitucionesByName(String nombre) {
        InstitucionDeportiva institucion = manejadorInstitucion.getInstitucionesByName(nombre);

        DtInstitucion dtInstitucion = new DtInstitucion(institucion.getNombre(), institucion.getDescripcion(),
                institucion.getUrl());

        return dtInstitucion;
    }

    @WebMethod
    public DtClase[] getClasesByUser(String nickname) {

        List<Clase> listClases = iControllerConsultaUsuario.getClasesByUser(nickname);
        int it = 0;
        DtClase[] clasesTR = new DtClase[listClases.size()];
        for (Clase clase : listClases) {
            clasesTR[it] = new DtClase(clase.getNombre(), clase.getFechaFormatted(), clase.getFechaReg().toString(),
                    clase.getHora().toString(), clase.getUrl());
            it = it + 1;

        }

        return clasesTR;
    }

    @WebMethod
    public DtClase obtenerClasePorNombre(String nombreClase) {
        Clase clase = iControllerConsultaClases.obtenerClasePorNombre(nombreClase);

        DtClase dtClase = new DtClase(clase.getNombre(), clase.getFechaFormatted(), clase.getFechaReg().toString(),
                clase.getHora().toString(), clase.getUrl());
        return dtClase;
    }

    @WebMethod
    public DtClase[] obtenerClasesPorActividad(ActividadDeportiva actividad) {
        List<Clase> listClases = iControllerConsultaClases.obtenerClasesPorActividad(actividad);
        int it = 0;
        DtClase[] clasesTR = new DtClase[listClases.size()];
        for (Clase clase : listClases) {
            clasesTR[it] = new DtClase(clase.getNombre(), clase.getFechaFormatted(), clase.getFechaReg().toString(),
                    clase.getHora().toString(), clase.getUrl());
            it = it + 1;

        }
        return clasesTR;
    }

    @WebMethod
    public DtInstitucion[] getInstituciones() {
        List<InstitucionDeportiva> listInstituciones = manejadorInstitucion.getInstituciones();

        int it = 0;
        DtInstitucion[] institucionesTR = new DtInstitucion[listInstituciones.size()];
        for (InstitucionDeportiva id : listInstituciones) {

            institucionesTR[it] = new DtInstitucion(id.getNombre(), id.getDescripcion(), id.getUrl());

            it = it + 1;
        }

        return institucionesTR;

    }

    @WebMethod
    public DtUsuario[] getSociosByClase(Clase clase) {
        List<Usuario> listSocios = manejadorUsuarios.getSociosByClase(clase);

        int it = 0;
        DtUsuario[] usuariosTR = new DtUsuario[listSocios.size()];
        for (Usuario u : listSocios) {

            usuariosTR[it] = new DtUsuario(u.getId_usuario(), u.getNickname(), u.getEmail(), u.getNombre(),
                    u.getApellido(), u.getFechaNacFromatted(), u.getContrasena());

            it = it + 1;
        }

        return usuariosTR;

    }

    @WebMethod
    public DtActividadDeportiva[] obtenerRankingDeActividades() {
        List<ActividadDeportiva> listActividades = iControllerRanking.obtenerRankingDeActividades();

        int it = 0;

        DtActividadDeportiva[] actividadesTR = new DtActividadDeportiva[listActividades.size()];
        for (ActividadDeportiva ac : listActividades) {
            actividadesTR[it] = new DtActividadDeportiva(ac.getNombre(), ac.getDescripcion(), ac.getDuracion(),
                    ac.getCosto(), ac.getFechaReg().toString());
            it = it + 1;

        }

        return actividadesTR;
    }

    @WebMethod
    public DtClase[] obtenerRankingDeClases() {
        List<Clase> listClases = iControllerRanking.obtenerRankingDeClases();

        int it = 0;
        DtClase[] clasesTR = new DtClase[listClases.size()];
        for (Clase clase : listClases) {
            clasesTR[it] = new DtClase(clase.getNombre(), clase.getFechaFormatted(), clase.getFechaReg().toString(),
                    clase.getHora().toString(), clase.getUrl());
            it = it + 1;

        }

        return clasesTR;
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
