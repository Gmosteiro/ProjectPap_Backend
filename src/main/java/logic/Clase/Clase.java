package logic.Clase;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import logic.Usuario.Profesor;
import logic.Usuario.Registro;

@Entity
public class Clase {

    @Id
    private String nombre;
    private LocalDate fecha, fechaReg;
    private LocalTime hora;
    private String url;
    @Column(name = "img", columnDefinition = "TEXT")
    private String img;

    @ManyToOne
    @JoinColumn(name = "profesor")
    private Profesor profesor;

    @OneToMany(mappedBy = "socio", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Registro> registros;

    public Clase() {

    }

    public Clase(String nombre, LocalDate fecha, LocalTime hora, String url, LocalDate fechaReg, Profesor profesor,
            String img) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.url = url;
        this.fechaReg = fechaReg;
        this.img = img;
        this.profesor = profesor;

    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
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

    public List<Registro> getRegistros() {
        return registros;
    }

    public void setRegistros(List<Registro> registros) {
        this.registros = registros;
    }

    public void addRegistro(Registro registro) {
        this.registros.add(registro);
    }

    public String getFechaFormatted() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Convert LocalDate to LocalDateTime to enable formatting
        String formattedDate = fecha.atStartOfDay().format(formatter);
        return formattedDate;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getImg() {
        return img;
    }

}
