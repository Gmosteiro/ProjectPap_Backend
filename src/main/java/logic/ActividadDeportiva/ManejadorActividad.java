package logic.ActividadDeportiva;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManejadorActividad {
    private static EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("project_pap");
    private static EntityManager entityManager = emFactory.createEntityManager();

    public ManejadorActividad() {
    }

    public void agregarActividad(ActividadDeportiva actividad) {
        entityManager.getTransaction().begin();

        entityManager.persist(actividad);

        entityManager.getTransaction().commit();
        entityManager.close();
        emFactory.close();
    }

    public void actualizarActividad(ActividadDeportiva actividad) {
        entityManager.getTransaction().begin();

        entityManager.merge(actividad);

        entityManager.getTransaction().commit();
        entityManager.close();
        emFactory.close();
    }

    public void eliminarActividad(ActividadDeportiva actividad) {
        entityManager.getTransaction().begin();

        entityManager.remove(entityManager.contains(actividad) ? actividad : entityManager.merge(actividad));

        entityManager.getTransaction().commit();
        entityManager.close();
        emFactory.close();
    }

    public ActividadDeportiva obtenerActividadPorNombre(String nombre) {
        ActividadDeportiva actividad = entityManager.find(ActividadDeportiva.class, nombre);

        entityManager.close();
        emFactory.close();

        return actividad;
    }

    public static List<ActividadDeportiva> getActividades() {

        List<ActividadDeportiva> actividades;

        actividades = entityManager
                .createQuery("SELECT a FROM ActividadDeportiva a", ActividadDeportiva.class).getResultList();

        return actividades;
    }

}
