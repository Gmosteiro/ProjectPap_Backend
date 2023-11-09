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
import java.util.ArrayList;
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
import org.primefaces.shaded.json.JSONArray;
import org.primefaces.shaded.json.JSONObject;

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
    public boolean modificarUsuarioWeb(String nickname, String nuevoNombre, String nuevoApellido, LocalDate nuevafecha,
            String img) {
        return iControllerModificarUsuario.modificarUsuarioWeb(nickname, nuevoNombre, nuevoApellido, nuevafecha, img);
    }

    @WebMethod
    public void addClase(String nombre, LocalDate fecha, LocalTime hora, String url, LocalDate fechaReg,
            String nombreProfesor, String img, String actividad) {
        iControllerAltaClase.addClase(nombre, fecha, hora, url, fechaReg, nombreProfesor, img, actividad);
    }

    @WebMethod
    public String getActividadesByProfe(String nicknameProfesor) {

        ArrayList<ActividadDeportiva> st = (ArrayList<ActividadDeportiva>)iControllerConsultaActividad.getActividadesByProfe(nicknameProfesor);
        JSONArray actividadesArray = new JSONArray();
        for (ActividadDeportiva actividadDeportiva : st) {
            JSONObject actividadJSON = new JSONObject();
            actividadJSON.put("nombre", actividadDeportiva.getNombre());
            actividadesArray.put(actividadJSON);
        }

        JSONObject jsonResponse = new JSONObject();
                jsonResponse.put("ERROR", false);
                jsonResponse.put("Actividades", actividadesArray);
        return jsonResponse.toString();
    }
    
    //    ArrayList<ListItem> myCustomList = .... // list filled with objects
//    JSONArray jsonArray = new JSONArray();
//   for (int i=0; i < myCustomList.size(); i++) {
//        jsonArray.put(myCustomList.get(i).getJSONObject());
//    }

    @WebMethod
    public ArrayList<Clase> getClasesByActividad(String nombreActividad) {
        return (ArrayList<Clase>) iControllerDictadoClase.getClasesByActividad(nombreActividad);
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
    public ArrayList<Clase> getClasesByUser(String nickname) {
        return (ArrayList<Clase>) iControllerConsultaUsuario.getClasesByUser(nickname);
    }

    @WebMethod
    public Clase obtenerClasePorNombre(String nombreClase) {
        return iControllerConsultaClases.obtenerClasePorNombre(nombreClase);
    }

    @WebMethod
    public ArrayList<Clase> obtenerClasesPorActividad(ActividadDeportiva actividad) {
        return (ArrayList<Clase>) iControllerConsultaClases.obtenerClasesPorActividad(actividad);
    }

    @WebMethod
    public ArrayList<String> getInstituciones() {
        List<InstitucionDeportiva> institucionesList = manejadorInstitucion.getInstituciones();
        ArrayList<InstitucionDeportiva> institucionesArrayList = new ArrayList<>(institucionesList);

        InstitucionDeportiva institucionPrueba = manejadorInstitucion.getInstitucionesByName("Esi");
        ArrayList<String> probando = new ArrayList<String>();

        probando.add(institucionPrueba.getNombre());

        System.out.println("Return de getInstituciones() backend: " + probando.size());
        return probando;
    }

    @WebMethod
    public ArrayList<Usuario> getSociosByClase(Clase clase) {
        return (ArrayList<Usuario>) manejadorUsuarios.getSociosByClase(clase);
    }

    @WebMethod
    public ArrayList<ActividadDeportiva> obtenerRankingDeActividades() {
        return (ArrayList<ActividadDeportiva>) iControllerRanking.obtenerRankingDeActividades();
    }

    @WebMethod
    public ArrayList<Clase> obtenerRankingDeClases() {
        return (ArrayList<Clase>) iControllerRanking.obtenerRankingDeClases();
    }

    @WebMethod
    public boolean validateDataWeb(String nicknameSocio, String nombreClase) {
        return iControllerRegistroDictado.validateDataWeb(nicknameSocio, nombreClase);
    }

    @WebMethod
    public boolean addRegistroDictadoWeb(String nicknameSocio, String nombreClase, LocalDate fechaReg) {
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
//  private static ArrayList SoapDeserialize()
//    {
//        ArrayList people = null;
//
//        using (FileStream str = File.OpenRead("people.soap"))
//        {
//            SoapFormatter sf = new SoapFormatter();
//            people = (ArrayList)sf.Deserialize(str);
//        }
//        return people;
//    }
}
