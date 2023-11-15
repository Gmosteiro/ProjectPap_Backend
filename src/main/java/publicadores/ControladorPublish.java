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
import java.time.format.DateTimeFormatter;
import java.util.List;

import logic.ActividadDeportiva.controllers.IControllerConsultaActividad;
import logic.Usuario.controllers.IControllerConsultaUsuario;
import logic.Usuario.controllers.IControllerInicioSesion;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.xml.ws.Endpoint;

import DataTypes.DtActividadDeportiva;
import DataTypes.DtClase;
import DataTypes.DtInstitucion;
import DataTypes.DtUsuario;
import logic.ActividadDeportiva.ActividadDeportiva;
import logic.ActividadDeportiva.ManejadorActividad;
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
import logic.Usuario.Profesor;
import logic.Usuario.Sesion;
import logic.Usuario.Socio;
import logic.Usuario.Usuario;
import logic.Usuario.controllers.IControllerEliminarRegClase;
import logic.Usuario.controllers.IControllerModificarUsuario;
import logic.Usuario.controllers.IControllerRegistroDictado;

@WebService
@SOAPBinding(style = Style.RPC, parameterStyle = ParameterStyle.WRAPPED)
public class ControladorPublish {

    private Endpoint endpoint;

    public ControladorPublish() {

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
        try {

            IControllerInicioSesion iControllerInicioSesion = new Fabrica().getControllerInicioSesion();
            return iControllerInicioSesion.iniciarSesion(nickname, contrasena);
        } catch (Exception e) {
            System.out.println("Catch iniciarSesion: " + e);
            return null;
        }
    }

    @WebMethod
    public DtActividadDeportiva obtenerActividadPorNombre(String nombreActividad) {
        try {

            Fabrica factory = new Fabrica();

            IControllerConsultaActividad iControllerConsultaActividad = factory.getControllerConsultaActividad();

            ActividadDeportiva ac = iControllerConsultaActividad.obtenerActividadPorNombre(nombreActividad);

            LocalDate fecha = ac.getFechaReg();

            DtActividadDeportiva dtActividaDeportiva = new DtActividadDeportiva(ac.getNombre(), ac.getDescripcion(),
                    ac.getDuracion(), (int) ac.getCosto(), fecha.toString(), ac.getImg());

            return dtActividaDeportiva;
        } catch (Exception e) {
            System.out.println("Catch obtenerActividadPorNombre: " + e);
            return null;
        }

    }

    @WebMethod
    public boolean modificarUsuarioWeb(String nickname, String nuevoNombre, String nuevoApellido, String nuevafechaStr,
            String img) {

        try {
            LocalDate nuevafecha = LocalDate.now();

            IControllerModificarUsuario iControllerModificarUsuario = new Fabrica().getControllerModificarUsuario();
            return iControllerModificarUsuario.modificarUsuarioWeb(nickname, nuevoNombre, nuevoApellido, nuevafecha,
                    img);
        } catch (Exception e) {
            System.out.println("Catch modificarUsuarioWeb: " + e);
            e.printStackTrace();
            return false;
        }
    }

    @WebMethod
    public void addClase(String nombre, String fechaStr, String horaStr, String url, String fechaRegStr,
            String nombreProfesor, String img, String actividad) {

        LocalDate fecha = LocalDate.now();
        LocalTime hora = LocalTime.now();
        LocalDate fechaReg = LocalDate.now();

        IControllerAltaClase iControllerAltaClase = new Fabrica().getControladorAltaClase();
        iControllerAltaClase.addClase(nombre, fecha, hora, url, fechaReg, nombreProfesor, img, actividad);
    }

    @WebMethod
    public DtActividadDeportiva[] getActividadesByProfe(String nicknameProfesor) {

        Fabrica factory = new Fabrica();

        IControllerConsultaActividad iControllerConsultaActividad = factory.getControllerConsultaActividad();

        List<ActividadDeportiva> listActividades = iControllerConsultaActividad.getActividadesByProfe(nicknameProfesor);
        int it = 0;

        DtActividadDeportiva[] actividadesTR = new DtActividadDeportiva[listActividades.size()];
        for (ActividadDeportiva ac : listActividades) {
            actividadesTR[it] = new DtActividadDeportiva(ac.getNombre(), ac.getDescripcion(), ac.getDuracion(),
                    (int) ac.getCosto(), ac.getFechaReg().toString(), ac.getImg());
            it = it + 1;

        }

        return actividadesTR;
    }

    @WebMethod
    public DtActividadDeportiva[] getActividadesByInstitucion(String nombreInstitucion) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");

        EntityManager entityManager = emf.createEntityManager();

        try {

            InstitucionDeportiva id = ManejadorInstitucion.getInstitucionesByName(nombreInstitucion);

            List<ActividadDeportiva> listActividades = id.getActividades();

            int it = 0;

            DtActividadDeportiva[] actividadesTR = new DtActividadDeportiva[listActividades.size()];
            for (ActividadDeportiva ac : listActividades) {
                actividadesTR[it] = new DtActividadDeportiva(ac.getNombre(), ac.getDescripcion(), ac.getDuracion(),
                        (int) ac.getCosto(), ac.getFechaReg().toString(), ac.getImg());
                it = it + 1;

            }

            return actividadesTR;

        } catch (Exception e) {
            System.out.println("Catch getActividadesByInstitucion: " + e);
            e.printStackTrace();
            return null;
        } finally {
            entityManager.close();
        }

    }

    @WebMethod
    public DtClase[] getClasesByActividad(String nombreActividad) {

        IControllerDictadoClase iControllerDictadoClase = new Fabrica().getControladorDictadoClase();
        List<Clase> listClases = iControllerDictadoClase.getClasesByActividad(nombreActividad);

        int it = 0;
        DtClase[] clasesTR = new DtClase[listClases.size()];
        for (Clase clase : listClases) {
            clasesTR[it] = new DtClase(clase.getNombre(), clase.getFechaFormatted(), clase.getFechaReg().toString(),
                    clase.getHora().toString(), clase.getUrl(), clase.getImg(), clase.getProfesor().getNickname());
            it = it + 1;

        }

        return clasesTR;
    }

    @WebMethod
    public boolean eliminarRegistroDeClase(String nombreInstitucion, String nombreActividad, String nombreClase,
            String nicknameSocio) {

        IControllerEliminarRegClase iControllerEliminarRegClase = new Fabrica().getControllerEliminarRegClase();
        return iControllerEliminarRegClase.eliminarRegistroDeClase(nombreInstitucion, nombreActividad, nombreClase,
                nicknameSocio);
    }

    @WebMethod
    public boolean existenElementos(String nombreInstitucion, String nombreActividad, String nombreClase,
            String nicknameSocio) {
        IControllerEliminarRegClase iControllerEliminarRegClase = new Fabrica().getControllerEliminarRegClase();

        return iControllerEliminarRegClase.existenElementos(nombreInstitucion, nombreActividad, nombreClase,
                nicknameSocio);
    }

    @WebMethod
    public boolean crearRegistro(DtUsuario dtSocio, DtClase dtClase) {

        try {

            Socio socio = new Socio(dtSocio.getNickname(), dtSocio.getNombre(), dtSocio.getApellido(),
                    dtSocio.getEmail(),
                    stringToLocalDate(dtSocio.getFechaNac()), dtSocio.getContrasena(), dtSocio.getImagen());

            Profesor profesorDeClase = ManejadorUsuarios.getProfesor(dtClase.getProfesor());

            Clase clase = new Clase(dtClase.getNombre(), stringToLocalDate(dtClase.getFecha()),
                    stringToLocalTime(dtClase.getHora()), dtClase.getUrl(),
                    stringToLocalDate(dtClase.getFechaRegistro()), profesorDeClase, dtClase.getImagen());

            IControllerEliminarRegClase iControllerEliminarRegClase = new Fabrica().getControllerEliminarRegClase();

            return iControllerEliminarRegClase.crearRegistro(socio, clase);

        } catch (Exception e) {
            System.out.println("Catch crearRegistro: " + e);
            return false;
        }
    }

    @WebMethod
    public DtInstitucion getInstitucionesByName(String nombre) {

        InstitucionDeportiva institucion = ManejadorInstitucion.getInstitucionesByName(nombre);

        DtInstitucion dtInstitucion = new DtInstitucion(institucion.getNombre(), institucion.getDescripcion(),
                institucion.getUrl());

        return dtInstitucion;
    }

    @WebMethod
    public DtClase[] getClasesByUser(String nickname) {

        IControllerConsultaUsuario iControllerConsultaUsuario = new Fabrica().getControladorConsultaUsuario();

        List<Clase> listClases = iControllerConsultaUsuario.getClasesByUser(nickname);
        int it = 0;
        DtClase[] clasesTR = new DtClase[listClases.size()];
        for (Clase clase : listClases) {
            clasesTR[it] = new DtClase(clase.getNombre(), clase.getFechaFormatted(), clase.getFechaReg().toString(),
                    clase.getHora().toString(), clase.getUrl(), clase.getImg(), clase.getProfesor().getNickname());
            it = it + 1;

        }

        return clasesTR;
    }

    @WebMethod
    public DtClase obtenerClasePorNombre(String nombreClase) {
        try {

            IControllerConsultaClases iControllerConsultaClases = new Fabrica().getControllerConsultaClases();
            Clase clase = iControllerConsultaClases.obtenerClasePorNombre(nombreClase);

            DtClase dtClase = new DtClase(clase.getNombre(), clase.getFechaFormatted(), clase.getFechaReg().toString(),
                    clase.getHora().toString(), clase.getUrl(), clase.getImg(), clase.getProfesor().getNickname());
            return dtClase;

        } catch (Exception e) {
            System.out.println("Catch obtenerClasePorNombre: " + e);
            return null;
        }
    }

    @WebMethod
    public DtClase[] obtenerClasesPorActividad(DtActividadDeportiva dtActividad) {

        ActividadDeportiva actividad = ManejadorActividad.obtenerActividadPorNombre(dtActividad.getNombre());

        IControllerConsultaClases iControllerConsultaClases = new Fabrica().getControllerConsultaClases();

        List<Clase> listClases = iControllerConsultaClases.obtenerClasesPorActividad(actividad);
        int it = 0;
        DtClase[] clasesTR = new DtClase[listClases.size()];
        for (Clase clase : listClases) {
            clasesTR[it] = new DtClase(clase.getNombre(), clase.getFechaFormatted(), clase.getFechaReg().toString(),
                    clase.getHora().toString(), clase.getUrl(), clase.getImg(), clase.getProfesor().getNickname());
            it = it + 1;

        }
        return clasesTR;
    }

    @WebMethod
    public DtInstitucion[] getInstituciones() {

        List<InstitucionDeportiva> listInstituciones = ManejadorInstitucion.getInstituciones();

        int it = 0;
        DtInstitucion[] institucionesTR = new DtInstitucion[listInstituciones.size()];
        for (InstitucionDeportiva id : listInstituciones) {

            institucionesTR[it] = new DtInstitucion(id.getNombre(), id.getDescripcion(), id.getUrl());

            it = it + 1;
        }

        return institucionesTR;

    }

    @WebMethod
    public DtUsuario[] getSociosByClase(DtClase dtClase) {

        List<Usuario> listSocios = ManejadorUsuarios
                .getSociosByClase(ManejadorClases.getClaseByNombre(dtClase.getNombre()));

        int it = 0;
        DtUsuario[] usuariosTR = new DtUsuario[listSocios.size()];
        for (Usuario u : listSocios) {

            usuariosTR[it] = new DtUsuario(u.getId_usuario(), u.getNickname(), u.getEmail(), u.getNombre(),
                    u.getApellido(), u.getFechaNacFromatted(), u.getContrasena(), u.getImg());

            it = it + 1;
        }

        return usuariosTR;

    }

    @WebMethod
    public DtActividadDeportiva[] obtenerRankingDeActividades() {

        IControllerRanking iControllerRanking = new Fabrica().getControladorRankingActividad();
        List<ActividadDeportiva> listActividades = iControllerRanking.obtenerRankingDeActividades();

        int it = 0;

        DtActividadDeportiva[] actividadesTR = new DtActividadDeportiva[listActividades.size()];
        for (ActividadDeportiva ac : listActividades) {
            actividadesTR[it] = new DtActividadDeportiva(ac.getNombre(), ac.getDescripcion(), ac.getDuracion(),
                    (int) ac.getCosto(), ac.getFechaReg().toString(), ac.getImg());
            it = it + 1;

        }

        return actividadesTR;
    }

    @WebMethod
    public DtClase[] obtenerRankingDeClases() {
        IControllerRanking iControllerRanking = new Fabrica().getControladorRankingActividad();

        List<Clase> listClases = iControllerRanking.obtenerRankingDeClases();

        int it = 0;
        DtClase[] clasesTR = new DtClase[listClases.size()];
        for (Clase clase : listClases) {
            clasesTR[it] = new DtClase(clase.getNombre(), clase.getFechaFormatted(), clase.getFechaReg().toString(),
                    clase.getHora().toString(), clase.getUrl(), clase.getImg(), clase.getProfesor().getNickname());
            it = it + 1;

        }

        return clasesTR;
    }

    @WebMethod
    public boolean validateDataWeb(String nicknameSocio, String nombreClase) {

        IControllerRegistroDictado iControllerRegistroDictado = new Fabrica().getControllerRegistroDictado();
        return iControllerRegistroDictado.validateDataWeb(nicknameSocio, nombreClase);
    }

    @WebMethod
    public boolean addRegistroDictadoWeb(String nicknameSocio, String nombreClase, String fechaRegStr) {
        LocalDate fechaReg = LocalDate.now();
        IControllerRegistroDictado iControllerRegistroDictado = new Fabrica().getControllerRegistroDictado();

        return iControllerRegistroDictado.addRegistroDictadoWeb(nicknameSocio, nombreClase, fechaReg);
    }

    @WebMethod
    public DtClase getClaseByNombre(String nombreClase) {
        try {

            Clase clase = ManejadorClases.getClaseByNombre(nombreClase);

            DtClase dtClase = new DtClase(clase.getNombre(), clase.getFechaFormatted(), clase.getFechaReg().toString(),
                    clase.getHora().toString(), clase.getUrl(), clase.getImg(), clase.getProfesor().getNickname());

            return dtClase;

        } catch (Exception e) {
            System.out.println("Catch getClasesBynombre: " + e);
            return null;
        }
    }

    @WebMethod
    public DtUsuario getSocio(String nicknameSocio) {
        try {

            Socio socio = ManejadorUsuarios.getSocio(nicknameSocio);

            DtUsuario user = new DtUsuario(socio.getId_usuario(), socio.getNickname(), socio.getEmail(),
                    socio.getNombre(),
                    socio.getApellido(), socio.getFechaNacFromatted(), socio.getContrasena(), socio.getImg());

            return user;
        } catch (Exception e) {
            System.out.println("Catch getSocio: " + e);
            return null;
        }
    }

    // Funciones de Utilidad, No publicar

    public LocalDate stringToLocalDate(String fechaComoString) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        return LocalDate.parse(fechaComoString, formatter);
    }

    public LocalTime stringToLocalTime(String tiempoComoString) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        return LocalTime.parse(tiempoComoString, formatter);
    }

}
