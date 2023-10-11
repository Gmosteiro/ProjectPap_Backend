package logic.Usuario;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;
import logic.Clase.Clase;
import logic.Institucion.InstitucionDeportiva;
import logic.Clase.Clase;

public class ManejadorUsuarios {
	private static EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("project_pap");
	private static EntityManager entityManager = emFactory.createEntityManager();

	public ManejadorUsuarios() {
	}

	public static void agregarUsuario(Usuario usuario) {
		try {

			entityManager.getTransaction().begin();

			entityManager.persist(usuario);
			entityManager.getTransaction().commit();

		} catch (Exception exceptionAgregarUsuario) {
			System.out.println("Catch agregarUsuario: " + exceptionAgregarUsuario);

			System.out.println("ERROR");

		}
	}

	public static void agregarRegistro(Registro registro) {
		try {

			entityManager.getTransaction().begin();

			entityManager.persist(registro);
			entityManager.getTransaction().commit();

			System.out.println("Registro Creado");
			JOptionPane.showMessageDialog(
					null, // Parent component (null for default)
					"Registro Creado!", // Message text
					"Success", // Dialog title
					JOptionPane.INFORMATION_MESSAGE // Message type merecuetengue dijo el juan
			);

		} catch (Exception exceptionAgregarRegistro) {
			System.out.println("Catch agregarRegistro: " + exceptionAgregarRegistro);

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
        
        public static List<Usuario> getSocios() {

                    List<Usuario> usuarios = new ArrayList<>();
		List<Usuario> socios = entityManager.createQuery(
				"SELECT s " +
						"FROM Socio s",
				Usuario.class)
				.getResultList();

		usuarios.addAll(socios);

		return socios;
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

	public static Socio getSocio(String nickname) {
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
			System.out.println("Error catch getSocio " + e);
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

	public static Registro getRegistroBySocio(Socio socio) {

		try {

			List<Registro> listRegistros;

			listRegistros = entityManager.createQuery(
					"SELECT r FROM Registro r WHERE r.socio = :socio", Registro.class)
					.setParameter("socio", socio)
					.getResultList();

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
        
        public static List<Usuario> getSociosByClase(Clase clase) {

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
            System.out.println("Error catch getSociosByClase " + e);
            return null;
        }

    }

        public static void eliminarRegistro(Registro registro) {
    try {
        entityManager.getTransaction().begin();
        entityManager.remove(registro);
        entityManager.getTransaction().commit();
    } catch (Exception e) {
        System.out.println("Error al eliminar el registro: " + e);
        entityManager.getTransaction().rollback();
    }
}

    public static Registro getRegistroBySocioEnClase(Socio socio, Clase clase) {
    try {
        TypedQuery<Registro> query = entityManager.createQuery(
                "SELECT r FROM Registro r WHERE r.socio = :socio AND r.clase = :clase", Registro.class);
        query.setParameter("socio", socio);
        query.setParameter("clase", clase);
        List<Registro> registros = query.getResultList();

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
