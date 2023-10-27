package logic.Usuario;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

import DataBase.DbManager;
import logic.Clase.Clase;

public class ManejadorUsuarios {

	private DbManager controllerBD;

	private EntityManager entityManager;

	public ManejadorUsuarios() {
		controllerBD = DbManager.getInstance();

	}

	public void agregarUsuario(Usuario usuario) {
		try {

			entityManager = controllerBD.getEntityManager();
			entityManager.getTransaction().begin();

			entityManager.persist(usuario);
			entityManager.getTransaction().commit();

			controllerBD.closeEntityManager();

		} catch (Exception exceptionAgregarUsuario) {
			System.out.println("Catch agregarUsuario: " + exceptionAgregarUsuario);
		}
	}

	public void agregarRegistro(Registro registro) {
		try {

			entityManager = controllerBD.getEntityManager();

			entityManager.getTransaction().begin();

			entityManager.persist(registro);
			entityManager.getTransaction().commit();

			JOptionPane.showMessageDialog(
					null, // Parent component (null for default)
					"Registro Creado!", // Message text
					"Success", // Dialog title
					JOptionPane.INFORMATION_MESSAGE // Message type merecuetengue dijo el juan
			);

			controllerBD.closeEntityManager();

		} catch (Exception exceptionAgregarRegistro) {
			System.out.println("Catch agregarRegistro: " + exceptionAgregarRegistro);

		}
	}

	public boolean agregarRegistroWeb(Registro registro) {
		try {
			entityManager = controllerBD.getEntityManager();

			entityManager.getTransaction().begin();

			entityManager.persist(registro);
			entityManager.getTransaction().commit();

			controllerBD.closeEntityManager();
			return true;

		} catch (Exception exceptionAgregarRegistro) {
			System.out.println("Catch agregarRegistro: " + exceptionAgregarRegistro);
			return false;

		}
	}

	public List<Usuario> getUsuarios() {
		List<Usuario> usuarios = new ArrayList<>();

		entityManager = controllerBD.getEntityManager();

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

		controllerBD.closeEntityManager();
		return usuarios;
	}

	public List<Usuario> getProfesores() {

		entityManager = controllerBD.getEntityManager();

		List<Usuario> profesores = entityManager.createQuery(
				"SELECT p " +
						"FROM Profesor p",
				Usuario.class)
				.getResultList();

		controllerBD.closeEntityManager();

		return profesores;
	}

	public List<Usuario> getSocios() {

		entityManager = controllerBD.getEntityManager();

		List<Usuario> usuarios = new ArrayList<>();
		List<Usuario> socios = entityManager.createQuery(
				"SELECT s " +
						"FROM Socio s",
				Usuario.class)
				.getResultList();

		usuarios.addAll(socios);

		controllerBD.closeEntityManager();
		return socios;
	}

	public Usuario getUser(String nickname) {
		try {

			List<Usuario> listUsuario;

			entityManager = controllerBD.getEntityManager();

			listUsuario = entityManager.createQuery(
					"SELECT p FROM Profesor p WHERE p.nickname LIKE :nickname", Usuario.class)
					.setParameter("nickname", "%" + nickname + "%")
					.getResultList();

			controllerBD.closeEntityManager();

			if (!listUsuario.isEmpty()) {
				return listUsuario.get(0);
			} else {
				entityManager = controllerBD.getEntityManager();

				listUsuario = entityManager.createQuery(
						"SELECT p FROM Socio p WHERE p.nickname LIKE :nickname", Usuario.class)
						.setParameter("nickname", "%" + nickname + "%")
						.getResultList();

				controllerBD.closeEntityManager();

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

	public Socio getSocio(String nickname) {
		try {

			List<Socio> listUsuario;

			entityManager = controllerBD.getEntityManager();

			listUsuario = entityManager.createQuery(
					"SELECT p FROM Socio p WHERE p.nickname LIKE :nickname", Socio.class)
					.setParameter("nickname", "%" + nickname + "%")
					.getResultList();

			controllerBD.closeEntityManager();

			if (!listUsuario.isEmpty()) {
				return listUsuario.get(0);
			} else {
				return null;
			}
		} catch (Exception e) {
			System.out.println("Error catch getSocio " + e);
			return null;
		}
	}

	public Profesor getProfesor(String nickname) {
		try {

			List<Profesor> listUsuario;

			entityManager = controllerBD.getEntityManager();

			listUsuario = entityManager.createQuery(
					"SELECT p FROM Profesor p WHERE p.nickname LIKE :nickname", Profesor.class)
					.setParameter("nickname", "%" + nickname + "%")
					.getResultList();

			controllerBD.closeEntityManager();

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

	public Registro getRegistroBySocio(Socio socio) {

		try {

			entityManager = controllerBD.getEntityManager();

			List<Registro> listRegistros = entityManager.createQuery(
					"SELECT r FROM Registro r WHERE  r.socio = :socio", Registro.class)
					.setParameter("socio", socio)
					.getResultList();

			controllerBD.closeEntityManager();

			if (!listRegistros.isEmpty()) {
				return listRegistros.get(0);
			} else {
				return null;
			}
		} catch (Exception e) {
			System.out.println("Error catch getRegistroBySocio " + e);
			return null;
		}
	}

	public Boolean existeRegistroBySocioYClase(Socio socio, Clase clase) {

		try {

			entityManager = controllerBD.getEntityManager();

			List<Registro> listRegistros = entityManager.createQuery(
					"SELECT r FROM Registro r WHERE  r.socio = :socio  AND r.clase = :clase", Registro.class)
					.setParameter("socio", socio)
					.setParameter("clase", clase)
					.getResultList();

			controllerBD.closeEntityManager();

			if (listRegistros.isEmpty()) {
				return false;
			} else {
				return true;
			}
		} catch (Exception e) {
			System.out.println("Error catch getRegistroBySocio " + e);
			return null;
		}
	}

	public List<Usuario> getSociosByClase(Clase clase) {

		try {

			entityManager = controllerBD.getEntityManager();
			List<Usuario> resultList = entityManager.createQuery(
					"SELECT r.socio " +
							"FROM Registro r " +
							"WHERE r.clase = :clase",
					Usuario.class)
					.setParameter("clase", clase)
					.getResultList();

			controllerBD.closeEntityManager();

			return resultList;
		} catch (Exception e) {
			System.out.println("Error catch getSociosByClase " + e);
			return null;
		}

	}

	public void eliminarRegistro(Registro registro) {
		try {

			entityManager = controllerBD.getEntityManager();
			entityManager.getTransaction().begin();
			entityManager.remove(registro);
			entityManager.getTransaction().commit();

			controllerBD.closeEntityManager();
		} catch (Exception e) {
			System.out.println("Error al eliminar el registro: " + e);
		}
	}

	public Registro getRegistroBySocioEnClase(Socio socio, Clase clase) {
		try {

			entityManager = controllerBD.getEntityManager();

			List<Registro> registros = entityManager.createQuery(
					"SELECT r FROM Registro r WHERE r.socio = :socio AND r.clase = :clase", Registro.class)
					.setParameter("socio", socio).setParameter("clase", clase).getResultList();

			controllerBD.closeEntityManager();

			if (!registros.isEmpty()) {
				return registros.get(0);
			} else {
				return null;
			}
		} catch (Exception e) {
			System.out.println("Error al obtener el registro: " + e);
			return null;
		}
	}

}
