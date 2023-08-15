package logic.manejadores;

import java.util.ArrayList;
import java.util.List;
import logic.Usuario;

public class ManejadorUsuarios {
	private List<Usuario> coleccionUsuarios;

	public ManejadorUsuarios() {
		coleccionUsuarios = new ArrayList<>();
	}

	public void agregarUsuario(Usuario usuario) {
		coleccionUsuarios.add(usuario);
	}

	public List<Usuario> obtenerUsuarios() {
		return coleccionUsuarios;
	}
}
