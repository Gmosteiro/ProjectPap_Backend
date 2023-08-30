package logic.Clase;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Clase {

    @Id
    private String nombre;

    private LocalDate fecha;
    private LocalTime hora;
    private String url;
    private LocalDate fechaReg;
    private String profesor;

    
    public Clase() {

    }

    public Clase(String nombre, LocalDate fecha, LocalTime hora, String url, LocalDate fechaReg, String profesor) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.url = url;
        this.fechaReg = fechaReg;
        this.profesor = profesor;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public LocalTime getHora() {
        return hora;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDate getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(LocalDate fechaReg) {
        this.fechaReg = fechaReg;
    }

}
