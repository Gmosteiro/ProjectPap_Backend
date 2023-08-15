package logic;

import javax.persistence.Id;

import datatypes.DtFecha;

public abstract class Usuario {

	// @Id
	// protected String nickname;

	// @Id
	// protected String email;

	protected String nickname;
	protected String nombre;
	protected String apellido;
	protected String email;
	protected DtFecha fechaNac;

	public Usuario() {
		// Constructor sin argumentos
	}

	public Usuario(String nickname, String nombre, String apellido, String email, DtFecha fechaNac) {
		this.nickname = nickname;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.fechaNac = fechaNac;
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

	public DtFecha getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(DtFecha fechaNac) {
		this.fechaNac = fechaNac;
	}

}
