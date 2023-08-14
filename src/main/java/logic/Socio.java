package logic;

import java.util.ArrayList;
import java.util.List;

import datatypes.DtFecha;

public class Socio extends Usuario {
    private List<Registro> clasesRegistradas;
    // Constructor, getters y setters

    public Socio(String nickname, String nombre, String apellido, String email, DtFecha fechaNac) {
        super(nickname, nombre, apellido, email, fechaNac);

        this.clasesRegistradas = new ArrayList<>();

    }
}
