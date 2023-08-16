package logic;

import java.time.LocalDate;

public class ActividadDeportiva {
    private String nombre;
    private String descripcion;
    private int duracion;
    private float costo;
    private LocalDate fechaReg;

    public ActividadDeportiva(String nombre, String descripcion, int duracion, float costo, LocalDate fechaReg) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.costo = costo;
        this.fechaReg = fechaReg;
    }

    // Métodos getters y setters para los atributos

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

}
