package logic.Usuario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.MappedSuperclass;

import logic.Clase.Clase;

@MappedSuperclass
public abstract class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long id_usuario;
    protected String nickname;
    protected String email;
    protected String nombre, apellido;
    protected LocalDate fechaNac;
    protected String contrasena; // Nuevo campo para la contraseña
    @Column(name = "img", columnDefinition = "TEXT")
    protected String img;

    public Usuario() {
        super();
        // Constructor sin argumentos
    }

    public Usuario(String nickname, String nombre, String apellido, String email, LocalDate fechaNac, String contrasena,String img) {
        super();
        this.nickname = nickname;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.fechaNac = fechaNac;
        this.contrasena = contrasena; // Asignar la contraseña
        this.img =img;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public String getFechaNacFromatted() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Convert LocalDate to LocalDateTime to enable formatting
        String formattedDate = fechaNac.atStartOfDay().format(formatter);
        return formattedDate;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setImg(String img) {
    this.img = img;
    }
    
    public String getImg() {
        return img;
    }

}
