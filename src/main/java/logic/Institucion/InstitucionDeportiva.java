package logic.Institucion;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import logic.ActividadDeportiva.ActividadDeportiva;

@Entity
public class InstitucionDeportiva {
    @Id
    private String nombre;

    private String descripcion;

    private String url;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ActividadDeportiva> actividades = new ArrayList<>();

    // Métodos getters y setters para los atributos

    public InstitucionDeportiva() {
    }

    public InstitucionDeportiva(String nombre, String descripcion, String url) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.url = url;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public List<ActividadDeportiva> getActividades(){
        return actividades;
    }
    
    public void setActividades(List<ActividadDeportiva> actividades) {
        this.actividades = actividades;
    }
    
}
