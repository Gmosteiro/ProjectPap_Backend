package logic.Usuario;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManejadorUsuarios {
	private static EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("project_pap");
	private static EntityManager entityManager = emFactory.createEntityManager();

	public ManejadorUsuarios() {
	}

	public void agregarUsuario(Usuario usuario) {
		try {

			entityManager.getTransaction().begin();

			entityManager.persist(usuario);
			entityManager.getTransaction().commit();

		} catch (Exception exceptionAgregarUsuario) {
			System.out.println("Catch agregarUsuario: " + exceptionAgregarUsuario);

			System.out.println("ERROR");

		}
	}

	public static List<Usuario> getUsuarios() {
		List<Usuario> usuarios = new ArrayList<>();

		List<Usuario> profesores = entityManager.createQuery(
				"SELECT p " +
						"FROM Profesor p",
				Usuario.class)
				.getResultList();

		List<Usuario> socios = entityManager.createQuery(
				"SELECT s " +
						"FROM Socio s",
				Usuario.class)
				.getResultList();

		usuarios.addAll(profesores);
		usuarios.addAll(socios);

		return usuarios;
	}

	public static List<Usuario> getProfesores() {

		List<Usuario> profesores = entityManager.createQuery(
				"SELECT p " +
						"FROM Profesor p",
				Usuario.class)
				.getResultList();

		return profesores;
	}

	public static Usuario getUser(String nickname) {
		try {

			List<Usuario> listUsuario;

			listUsuario = entityManager.createQuery(
					"SELECT p FROM Profesor p WHERE p.nickname LIKE :nickname", Usuario.class)
					.setParameter("nickname", "%" + nickname + "%")
					.getResultList();

			if (!listUsuario.isEmpty()) {
				return listUsuario.get(0);
			} else {
				listUsuario = entityManager.createQuery(
						"SELECT p FROM Socio p WHERE p.nickname LIKE :nickname", Usuario.class)
						.setParameter("nickname", "%" + nickname + "%")
						.getResultList();
			}

			if (!listUsuario.isEmpty()) {
				return listUsuario.get(0);
			} else {
				return null;
			}
		} catch (Exception e) {
			System.out.println("Error catch getUser " + e);
			return null;
		}
	}

	public static Profesor getProfesor(String nickname) {
		try {

			List<Profesor> listUsuario;

			listUsuario = entityManager.createQuery(
					"SELECT p FROM Profesor p WHERE p.nickname LIKE :nickname", Profesor.class)
					.setParameter("nickname", "%" + nickname + "%")
					.getResultList();

			if (!listUsuario.isEmpty()) {
				return listUsuario.get(0);
			} else {
				return null;
			}
		} catch (Exception e) {
			System.out.println("Error catch getProfesor " + e);
			return null;
		}
	}

}
