package logic.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManejadorUsuarios {

	public ManejadorUsuarios() {
	}

	public void agregarUsuario(Usuario usuario) {
		try {

			EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("project_pap");
			EntityManager entityManager = emFactory.createEntityManager();
			entityManager.getTransaction().begin();

			entityManager.persist(usuario);
			entityManager.getTransaction().commit();

			entityManager.close();
			emFactory.close();
		} catch (Exception exceptionAgregarUsuario) {
			System.out.println("Catch agregarUsuario: " + exceptionAgregarUsuario);

			Throwable error = exceptionAgregarUsuario.getCause().getCause().getCause();
			System.out.println("ERROR");

		}
	}

}
