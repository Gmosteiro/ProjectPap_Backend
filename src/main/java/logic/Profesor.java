package logic;

import datatypes.DtFecha;
import javax.persistence.*;

@Entity
@Table(name = "Profesor") // Nombre de la tabla en la base de datos

public class Profesor extends Usuario {

	@Id
	protected String nickname;

	private String institucion;
	private String descripcion;
	private String biografia;
	private String sitioWeb;
	// Constructor, getters y setters

	public Profesor() {
		// Constructor sin argumentos
	}

	public Profesor(String nickname, String nombre, String apellido, String email, DtFecha fechaNac, String institucion,
			String descripcion, String biografia, String sitioWeb) {
		// super(nickname, nombre, apellido, email, fechaNac);
		this.nickname = nickname;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.fechaNac = fechaNac;
		this.institucion = institucion;
		this.descripcion = descripcion;
		this.biografia = biografia;
		this.sitioWeb = sitioWeb;
	}

	public String getInstitucion() {
		return institucion;
	}

	public void setInstitucion(String institucion) {
		this.institucion = institucion;
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
