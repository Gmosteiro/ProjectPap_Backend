package logic;

import java.util.List;

import datatypes.*;

public class Clase {
    private String nombre;
    private DtFecha fecha;
    private DtHora hora;
    private String url;
    private DtFecha fechaReg;
    private List<Registro> clasesRegistradas;

    public Clase(String nombre, DtFecha fecha, DtHora hora, String url, DtFecha fechaReg) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.url = url;
        this.fechaReg = fechaReg;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public DtFecha getFecha() {
        return fecha;
    }

    public void setFecha(DtFecha fecha) {
        this.fecha = fecha;
    }

    public void setHora(DtHora hora) {
        this.hora = hora;
    }

    public DtHora getHora() {
        return hora;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public DtFecha getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(DtFecha fechaReg) {
        this.fechaReg = fechaReg;
    }

}
