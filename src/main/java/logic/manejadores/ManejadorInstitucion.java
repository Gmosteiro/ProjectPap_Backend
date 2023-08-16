package logic.manejadores;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import logic.InstitucionDeportiva;

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

}
