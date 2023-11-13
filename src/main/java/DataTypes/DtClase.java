package DataTypes;

public class DtClase {

    public DtClase() {
        super();
    }

    public DtClase(String nombre, String fecha, String fechaRegistro, String hora, String url) {
        super();
        this.nombre = nombre;
        this.fecha = fecha;
        this.fechaRegistro = fechaRegistro;
        this.hora = hora;
        this.url = url;
    }

    private String nombre, fecha, fechaRegistro, hora, url;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
