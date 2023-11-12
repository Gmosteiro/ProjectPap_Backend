package DataTypes;

public class DtActividadDeportiva {
    private int id;
    private String nombre;
    private Turno turno;

    public DtClase() {
		super();
	}

    public DtClase(final int id,final String nombre,final Turno turno) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.turno = turno;
	}

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "ID = " + id + "\nNOMBRE = " + nombre + "\nTURNO = " + turno;
    }

}
