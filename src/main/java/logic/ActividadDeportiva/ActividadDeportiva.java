package logic.ActividadDeportiva;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import logic.Clase.Clase;

@Entity
public class ActividadDeportiva {

    @Id
    private String nombre;
    private String descripcion;
    private int duracion;
    private float costo;
    private LocalDate fechaReg;
    @Column(name = "img", columnDefinition = "TEXT")
    private String img;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Clase> Clases = new ArrayList<>();

    public ActividadDeportiva() {
    }

    public ActividadDeportiva(String nombre, String descripcion, int duracion, float costo, LocalDate fechaReg,
            String img) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.costo = costo;
        this.fechaReg = fechaReg;
        this.img = img;
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

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public LocalDate getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(LocalDate fechaReg) {
        this.fechaReg = fechaReg;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public List<Clase> getClases() {
        return Clases;
    }

    public void setClases(List<Clase> clases) {
        this.Clases = clases;
    }

}
