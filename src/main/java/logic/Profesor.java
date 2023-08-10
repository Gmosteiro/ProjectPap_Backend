package logic;

	public class Profesor extends Usuario {
	    private String institucion;
	    private String descripcion;
	    private String biografia;
	    private String sitioWeb;
	    // Constructor, getters y setters
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

