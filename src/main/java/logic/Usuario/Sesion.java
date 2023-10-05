package logic.Usuario;

import java.util.Base64;


public class Sesion {

    
    private String nickname, email, nombre, apellido, userType, profileImage;

    public Sesion(String nickname, String email, String nombre, String apellido, String userType, String profileImage) {
        this.nickname = nickname;
        this.email = email;
        this.nombre = nombre;
        this.apellido = apellido;
        this.userType = userType;
        this.profileImage = profileImage;
    }

    public String getProfileImageBase64() {
        return profileImage;
    }

    public void setProfileImageBase64(String base64Image) {
        this.profileImage = base64Image;
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

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

}
