package logic.ActividadDeportiva;

import java.util.List;

import DataBase.DbManager;
import javax.persistence.EntityManager;

import logic.Clase.Clase;
import logic.Institucion.InstitucionDeportiva;
import logic.Usuario.Profesor;

public class ManejadorActividad {
    private DbManager controllerBD;
    private EntityManager entityManager;

    public ManejadorActividad() {
        controllerBD = DbManager.getInstance();
    }

    public void agregarActividad(ActividadDeportiva actividad) {

        entityManager = controllerBD.getEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(actividad);

        entityManager.getTransaction().commit();
        controllerBD.closeEntityManager();
    }

    public void actualizarActividad(ActividadDeportiva actividad) {
        entityManager = controllerBD.getEntityManager();
        entityManager.getTransaction().begin();

        entityManager.merge(actividad);

        entityManager.getTransaction().commit();
        controllerBD.closeEntityManager();
    }

    public void eliminarActividad(ActividadDeportiva actividad) {
        entityManager = controllerBD.getEntityManager();
        entityManager.getTransaction().begin();

        entityManager.remove(entityManager.contains(actividad) ? actividad : entityManager.merge(actividad));

        entityManager.getTransaction().commit();
        controllerBD.closeEntityManager();
    }

    public ActividadDeportiva obtenerActividadPorNombre(String nombre) {
        entityManager = controllerBD.getEntityManager();
        ActividadDeportiva actividad = entityManager.find(ActividadDeportiva.class, nombre);
        controllerBD.closeEntityManager();
        return actividad;
    }

    public void agregarClaseA(Clase clase, String actividad) {
        try {
            entityManager = controllerBD.getEntityManager();

            ActividadDeportiva Actividad = obtenerActividadPorNombre(actividad);
            Actividad.getClases().add(clase);
            entityManager.getTransaction().begin();
            entityManager.persist(Actividad);
            entityManager.getTransaction().commit();

            controllerBD.closeEntityManager();

        } catch (Exception exceptionAgregarClase) {
            System.out.println("Catch agregarClase: " + exceptionAgregarClase);
        }
    }

    public List<ActividadDeportiva> getActividades() {
        entityManager = controllerBD.getEntityManager();

        List<ActividadDeportiva> actividades = entityManager
                .createQuery("SELECT a FROM ActividadDeportiva a", ActividadDeportiva.class).getResultList();

        controllerBD.closeEntityManager();

        return actividades;
    }

    public List<ActividadDeportiva> getActividadesByInstitucion(InstitucionDeportiva institucion) {

        try {
            entityManager = controllerBD.getEntityManager();

            List<ActividadDeportiva> actividades = institucion.getActividades();

            controllerBD.closeEntityManager();
            return actividades;

        } catch (Exception e) {
            System.out.println("Error catch getActividadesByInstitucionDeportiva " + e);
            return null;
        }
    }

    public List<ActividadDeportiva> getActividadesByProfe(Profesor profesor) {

        try {
            entityManager = controllerBD.getEntityManager();
            List<ActividadDeportiva> actividades = entityManager.createQuery(
                    "SELECT a " +
                            "FROM ActividadDeportiva a " +
                            "INNER JOIN a.Clases c " +
                            "INNER JOIN c.profesor p " +
                            "WHERE p = :profesor",
                    ActividadDeportiva.class)
                    .setParameter("profesor", profesor)
                    .getResultList();

            controllerBD.closeEntityManager();
            return actividades;
        } catch (Exception e) {
            System.out.println("Error catch getActividadesByProfe " + e);
            return null;
        }

    }

    public List<Clase> getClases() {
        entityManager = controllerBD.getEntityManager();
        List<Clase> clases = getClases();

        controllerBD.closeEntityManager();
        return clases;
    }

}
