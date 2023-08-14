package logic;

import datatypes.*;

public class Registro {
    private DtFecha fechaReg;
    private Socio socio;
    private Clase clase;

    public Registro(DtFecha fechaReg, Socio socio, Clase clase) {
        this.fechaReg = fechaReg;
        this.socio = socio;
        this.clase = clase;
    }

    // Métodos getters y setters para los atributos

    public DtFecha getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(DtFecha fechaReg) {
        this.fechaReg = fechaReg;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

}
