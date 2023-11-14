package logic.Usuario;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import logic.Clase.Clase;

@Entity
public class Registro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    private Socio socio;

    @ManyToOne
    @JoinColumn(name = "nombre", referencedColumnName = "nombre")
    private Clase clase;

    private LocalDate fechaReg;

    public Registro() {
    }

    public Registro(LocalDate fechaReg, Socio socio, Clase clase) {
        this.fechaReg = fechaReg;
        this.socio = socio;
        this.clase = clase;
    }

    // Métodos getters y setters para los atributos

    public LocalDate getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(LocalDate fechaReg) {
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
