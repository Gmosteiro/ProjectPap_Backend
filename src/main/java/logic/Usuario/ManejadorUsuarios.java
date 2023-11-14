package logic.Usuario;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import logic.Clase.Clase;

public class ManejadorUsuarios {

	public ManejadorUsuarios() {

	}

	public void agregarUsuario(Usuario usuario) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");

		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		try {
			transaction.begin();

			entityManager.persist(usuario);

			transaction.commit();
		} catch (Exception e) {
			if (transaction != null && transaction.isActive()) {
				transaction.rollback();
			}
			System.out.println("Catch agregarUsuario: " + e);
			e.printStackTrace();
		} finally {
			entityManager.close();
			emf.close();
		}

	}

	public void agregarRegistro(Registro registro) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");

		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		try {
			transaction.begin();

			entityManager.persist(registro);

			JOptionPane.showMessageDialog(
					null, // Parent component (null for default)
					"Registro Creado!", // Message text
					"Success", // Dialog title
					JOptionPane.INFORMATION_MESSAGE // Message type merecuetengue dijo el juan
			);

			transaction.commit();
		} catch (Exception e) {
			if (transaction != null && transaction.isActive()) {
				transaction.rollback();
			}
			System.out.println("Catch agregarRegistro: " + e);
			e.printStackTrace();
		} finally {
			entityManager.close();
			emf.close();
		}

	}

	public boolean agregarRegistroWeb(Registro registro) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");

		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		try {
			transaction.begin();

			entityManager.persist(registro);

			transaction.commit();

			return true;

		} catch (Exception e) {
			if (transaction != null && transaction.isActive()) {
				transaction.rollback();
			}
			System.out.println("Catch agregarRegistroWeb: " + e);
			e.printStackTrace();
			return false;
		} finally {
			entityManager.close();
			emf.close();
		}

	}

	public List<Usuario> getUsuarios() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");

		EntityManager entityManager = emf.createEntityManager();

		try {

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

		} catch (Exception e) {

			System.out.println("Catch getUsuarios: " + e);
			e.printStackTrace();
			return null;

		} finally {
			entityManager.close();
			emf.close();
		}

	}

	public List<Usuario> getProfesores() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");

		EntityManager entityManager = emf.createEntityManager();

		try {

			List<Usuario> profesores = entityManager.createQuery(
					"SELECT p " +
							"FROM Profesor p",
					Usuario.class)
					.getResultList();

			return profesores;

		} catch (Exception e) {

			System.out.println("Catch getProfesores: " + e);
			e.printStackTrace();
			return null;

		} finally {
			entityManager.close();
			emf.close();
		}

	}

	public List<Usuario> getSocios() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");

		EntityManager entityManager = emf.createEntityManager();

		try {

			List<Usuario> usuarios = new ArrayList<>();
			List<Usuario> socios = entityManager.createQuery(
					"SELECT s " +
							"FROM Socio s",
					Usuario.class)
					.getResultList();

			usuarios.addAll(socios);

			return socios;

		} catch (Exception e) {

			System.out.println("Catch getSocios: " + e);
			e.printStackTrace();
			return null;

		} finally {
			entityManager.close();
			emf.close();
		}

	}

	public Usuario getUser(String nickname) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");

		EntityManager entityManager = emf.createEntityManager();

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

			System.out.println("Catch getUser: " + e);
			e.printStackTrace();
			return null;

		} finally {
			entityManager.close();
			emf.close();
		}

	}

	public Socio getSocio(String nickname) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");

		EntityManager entityManager = emf.createEntityManager();

		try {

			List<Socio> listUsuario;

			listUsuario = entityManager.createQuery(
					"SELECT p FROM Socio p WHERE p.nickname LIKE :nickname", Socio.class)
					.setParameter("nickname", "%" + nickname + "%")
					.getResultList();

			if (!listUsuario.isEmpty()) {
				return listUsuario.get(0);
			} else {
				return null;
			}

		} catch (Exception e) {

			System.out.println("Catch getSocio: " + e);
			e.printStackTrace();
			return null;

		} finally {
			entityManager.close();
			emf.close();
		}

	}

	public Profesor getProfesor(String nickname) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");

		EntityManager entityManager = emf.createEntityManager();

		try {

			List<Profesor> listUsuario = entityManager.createQuery(
					"SELECT p FROM Profesor p WHERE p.nickname LIKE :nickname", Profesor.class)
					.setParameter("nickname", "%" + nickname + "%")
					.getResultList();

			if (!listUsuario.isEmpty()) {
				return listUsuario.get(0);
			} else {
				return null;
			}

		} catch (Exception e) {

			System.out.println("Catch getProfesores: " + e);
			e.printStackTrace();
			return null;

		} finally {
			entityManager.close();
			emf.close();
		}

	}

	public Registro getRegistroBySocio(Socio socio) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");

		EntityManager entityManager = emf.createEntityManager();

		try {

			List<Registro> listRegistros = entityManager.createQuery(
					"SELECT r FROM Registro r WHERE  r.socio = :socio", Registro.class)
					.setParameter("socio", socio)
					.getResultList();

			if (!listRegistros.isEmpty()) {
				return listRegistros.get(0);
			} else {
				return null;
			}

		} catch (Exception e) {

			System.out.println("Catch getRegistroBySocio: " + e);
			e.printStackTrace();
			return null;

		} finally {
			entityManager.close();
			emf.close();
		}

	}

	public Boolean existeRegistroBySocioYClase(Socio socio, Clase clase) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");

		EntityManager entityManager = emf.createEntityManager();

		try {

			List<Registro> listRegistros = entityManager.createQuery(
					"SELECT r FROM Registro r WHERE  r.socio = :socio  AND r.clase = :clase", Registro.class)
					.setParameter("socio", socio)
					.setParameter("clase", clase)
					.getResultList();

			if (listRegistros.isEmpty()) {
				return false;
			} else {
				return true;
			}
		} catch (Exception e) {

			System.out.println("Catch existeRegistroBySocioYClase: " + e);
			e.printStackTrace();
			return null;

		} finally {
			entityManager.close();
			emf.close();
		}

	}

	public List<Usuario> getSociosByClase(Clase clase) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");

		EntityManager entityManager = emf.createEntityManager();

		try {

			List<Usuario> resultList = entityManager.createQuery(
					"SELECT r.socio " +
							"FROM Registro r " +
							"WHERE r.clase = :clase",
					Usuario.class)
					.setParameter("clase", clase)
					.getResultList();

			return resultList;

		} catch (Exception e) {

			System.out.println("Catch getSociosByClase: " + e);
			e.printStackTrace();
			return null;

		} finally {
			entityManager.close();
			emf.close();
		}

	}

	public void eliminarRegistro(Registro registro) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");

		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		try {
			transaction.begin();

			entityManager.remove(registro);

			transaction.commit();
		} catch (Exception e) {
			if (transaction != null && transaction.isActive()) {
				transaction.rollback();
			}
			System.out.println("Catch eliminarRegistro: " + e);
			e.printStackTrace();
		} finally {
			entityManager.close();
			emf.close();
		}

	}

	public Registro getRegistroBySocioEnClase(Socio socio, Clase clase) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_pap");

		EntityManager entityManager = emf.createEntityManager();

		try {

			List<Registro> registros = entityManager.createQuery(
					"SELECT r FROM Registro r WHERE r.socio = :socio AND r.clase = :clase", Registro.class)
					.setParameter("socio", socio).setParameter("clase", clase).getResultList();

			if (!registros.isEmpty()) {
				return registros.get(0);
			} else {
				return null;
			}

		} catch (Exception e) {
			System.out.println("Catch eliminarRegistro: " + e);
			e.printStackTrace();
			return null;

		} finally {
			entityManager.close();
			emf.close();
		}

	}

}
