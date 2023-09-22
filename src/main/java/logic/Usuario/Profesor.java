package logic.Usuario;

import java.time.LocalDate;

// @Table(name = "Profesor") // Nombre de la tabla en la base de datos
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import logic.Institucion.InstitucionDeportiva;

@Entity
public class Profesor extends Usuario {

	@ManyToOne
	@JoinColumn(name = "institucion")
	private InstitucionDeportiva institucion;

	private String descripcion;
	private String biografia;
	private String sitioWeb;

	// Constructor, getters, setters y otros métodos

	public Profesor() {
		super();
		// Constructor sin argumentos
	}

	public Profesor(String nickname, String nombre, String apellido, String email, LocalDate fechaNac,
			InstitucionDeportiva institucion, String descripcion, String biografia, String sitioWeb,String contrasena, byte[] img) {
		super(nickname, nombre, apellido, email, fechaNac,contrasena, img);
		this.institucion = institucion;
		this.descripcion = descripcion;
		this.biografia = biografia;
		this.sitioWeb = sitioWeb;
	}

	// Getters y setters para los atributos adicionales de Profesor
	public InstitucionDeportiva getInstitucion() {
		return institucion;
	}

	public void setInstitucion(InstitucionDeportiva institucion) {
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