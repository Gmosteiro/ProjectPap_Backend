package logic.Usuario;

import java.time.LocalDate;
import java.util.ArrayList;
// import java.util.List;
import java.util.List;

import javax.persistence.CascadeType;
//import javax.persistence.CascadeType;
import javax.persistence.Entity;
//import javax.persistence.OneToMany;
import javax.persistence.OneToMany;

import logic.Registro;

@Entity
public class Socio extends Usuario {
    // @OneToMany(mappedBy = "socio", cascade = CascadeType.ALL, orphanRemoval =
    // true)
    // private List<Registro> clasesRegistradas;
    // getters y setters

    public Socio() {
        super();
    }

    public Socio(String nickname, String nombre, String apellido, String email, LocalDate fechaNac) {
        super(nickname, nombre, apellido, email, fechaNac);
        // this.clasesRegistradas = new ArrayList<>();
    }

    // public List<Registro> getClasesRegistradas() {
    // return clasesRegistradas;
    // }

    // public void setClasesRegistradas(List<Registro> clasesRegistradas) {
    // this.clasesRegistradas = clasesRegistradas;
    // }
}
