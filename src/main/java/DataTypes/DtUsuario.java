package DataTypes;

public class DtUsuario {

    private Long id_usuario;
    private String nickname, email, nombre, apellido, fechaNac, contrasena;

    // Atributos de Profesor
    private String descripcion, biografia, sitioWeb;

    public DtUsuario() {
        super();
    }

    public DtUsuario(Long id_usuario, String nickname, String email, String nombre, String apellido, String fechaNac,
            String contrasena) {
        super();
        this.id_usuario = id_usuario;
        this.nickname = nickname;
        this.email = email;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.contrasena = contrasena;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    // Getters y Setters de Profesor

    public void setProfesor(String descripcion, String biografia, String sitioWeb) {

        this.descripcion = descripcion;
        this.biografia = biografia;
        this.sitioWeb = sitioWeb;

    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

}
