package logic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Socio extends Usuario {
    private List<Registro> clasesRegistradas;
    // Constructor, getters y setters

    public Socio(String nickname, String nombre, String apellido, String email, LocalDate fechaNac) {
        super(nickname, nombre, apellido, email, fechaNac);

        this.clasesRegistradas = new ArrayList<>();

    }
}
