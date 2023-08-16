package logic;

import java.time.LocalDate;

// @Table(name = "Profesor") // Nombre de la tabla en la base de datos
import javax.persistence.Entity;

@Entity
public class Profesor extends Usuario {

	private String institucion;
	private String descripcion;
	private String biografia;
	private String sitioWeb;

	// Constructor, getters, setters y otros métodos

	public Profesor() {
		super();
		// Constructor sin argumentos
	}

	public Profesor(String nickname, String nombre, String apellido, String email, LocalDate fechaNac,
			String institucion, String descripcion, String biografia, String sitioWeb) {
		super(nickname, nombre, apellido, email, fechaNac);
		this.institucion = institucion;
		this.descripcion = descripcion;
		this.biografia = biografia;
		this.sitioWeb = sitioWeb;
	}

	// Getters y setters para los atributos adicionales de Profesor
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