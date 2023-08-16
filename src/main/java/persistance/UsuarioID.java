package persistance;

import java.io.Serializable;

public class UsuarioID implements Serializable {

    private String email;
    private String nickname;

    public UsuarioID() {
        // Constructor sin argumentos requerido para JPA
    }

    public UsuarioID(String email, String nickname) {
        this.email = email;
        this.nickname = nickname;
    }

    // Getters, setters, equals y hashCode
    // ...

    // Implementación de equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        UsuarioID usuarioID = (UsuarioID) o;

        if (!email.equals(usuarioID.email))
            return false;
        return nickname.equals(usuarioID.nickname);
    }

    @Override
    public int hashCode() {
        int result = email.hashCode();
        result = 31 * result + nickname.hashCode();
        return result;
    }
}