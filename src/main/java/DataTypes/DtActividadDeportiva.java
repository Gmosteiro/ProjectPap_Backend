package DataTypes;

public class DtActividadDeportiva {
    private int duracion;
    private float costo;

    private String nombre, descripcion, fechaRegistro;

    public DtActividadDeportiva() {
        super();
    }

    public DtActividadDeportiva(final String nombre, final String descripcion, final int duracion,
            final float costo,
            final String fechaRegistro) {
        super();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.costo = costo;
        this.fechaRegistro = fechaRegistro;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
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

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

}
