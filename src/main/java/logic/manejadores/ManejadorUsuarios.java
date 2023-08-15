package logic.manejadores;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import logic.Profesor;
import logic.Usuario;

public class ManejadorUsuarios {
	private List<Usuario> coleccionUsuarios;

	public ManejadorUsuarios() {
		coleccionUsuarios = new ArrayList<>();
	}

	public void agregarUsuario(Usuario usuario) {

		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("project_pap");
		EntityManager entityManager = emFactory.createEntityManager();
		entityManager.getTransaction().begin();

		entityManager.persist(usuario);
		entityManager.getTransaction().commit();

		entityManager.close();
		emFactory.close();

	}

	public List<Usuario> obtenerUsuarios() {
		return coleccionUsuarios;
	}
}
