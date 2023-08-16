package logic.manejadores;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import logic.ActividadDeportiva;

public class ManejadorActividad {

    public ManejadorActividad() {
    }

    public void agregarActividad(ActividadDeportiva actividad) {
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("project_pap");
        EntityManager entityManager = emFactory.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(actividad);

        entityManager.getTransaction().commit();
        entityManager.close();
        emFactory.close();
    }

    public void actualizarActividad(ActividadDeportiva actividad) {
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("project_pap");
        EntityManager entityManager = emFactory.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.merge(actividad);

        entityManager.getTransaction().commit();
        entityManager.close();
        emFactory.close();
    }

    public void eliminarActividad(ActividadDeportiva actividad) {
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("project_pap");
        EntityManager entityManager = emFactory.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.remove(entityManager.contains(actividad) ? actividad : entityManager.merge(actividad));

        entityManager.getTransaction().commit();
        entityManager.close();
        emFactory.close();
    }

    public ActividadDeportiva obtenerActividadPorNombre(String nombre) {
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("project_pap");
        EntityManager entityManager = emFactory.createEntityManager();

        ActividadDeportiva actividad = entityManager.find(ActividadDeportiva.class, nombre);

        entityManager.close();
        emFactory.close();

        return actividad;
    }

}


