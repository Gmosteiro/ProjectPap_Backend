package logic.Usuario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.MappedSuperclass;

import persistance.UsuarioID;

@MappedSuperclass
@IdClass(UsuarioID.class)

public abstract class Usuario {

	@Id
	protected String nickname;

	@Id
	protected String email;

	protected String nombre, apellido;
	protected LocalDate fechaNac;

	public Usuario() {
		super();
		// Constructor sin argumentos
	}

	public Usuario(String nickname, String nombre, String apellido, String email, LocalDate fechaNac) {
		super();
		this.nickname = nickname;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.fechaNac = fechaNac;
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

}
