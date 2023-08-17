package logic.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManejadorUsuarios {

	public ManejadorUsuarios() {
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

}
