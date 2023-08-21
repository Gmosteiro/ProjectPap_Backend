package logic.Institucion;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManejadorInstitucion {

	public ManejadorInstitucion() {
	}

	public void agregarInstitucion(InstitucionDeportiva institucion) {

		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("project_pap");
		EntityManager entityManager = emFactory.createEntityManager();
		entityManager.getTransaction().begin();

		entityManager.persist(institucion);
		entityManager.getTransaction().commit();

		entityManager.close();
		emFactory.close();

	}

	public static List<InstitucionDeportiva> getInstituciones() {

		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("project_pap");
		EntityManager entityManager = emFactory.createEntityManager();
		List<InstitucionDeportiva> instituciones;

		instituciones = entityManager
				.createQuery("SELECT e FROM InstitucionDeportiva e", InstitucionDeportiva.class).getResultList();

		return instituciones;
	}

}
