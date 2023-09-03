package logic.ActividadDeportiva;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import logic.Clase.Clase;
import logic.Institucion.InstitucionDeportiva;
import logic.Usuario.Profesor;

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

    public static ActividadDeportiva obtenerActividadPorNombre(String nombre) {
        ActividadDeportiva actividad = entityManager.find(ActividadDeportiva.class, nombre);
        return actividad;
    }

    public void agregarClaseA(Clase clase, String actividad) {
        try {
            ActividadDeportiva Actividad = obtenerActividadPorNombre(actividad);
            Actividad.getClases().add(clase);
            entityManager.getTransaction().begin();
            entityManager.persist(Actividad);
            entityManager.getTransaction().commit();
            entityManager.close();
            emFactory.close();
        } catch (Exception exceptionAgregarClase) {
            System.out.println("Catch agregarClase: " + exceptionAgregarClase);
            System.out.println("ERROR");
        }
    }

    public static List<ActividadDeportiva> getActividades() {

        List<ActividadDeportiva> actividades;

        actividades = entityManager
                .createQuery("SELECT a FROM ActividadDeportiva a", ActividadDeportiva.class).getResultList();

        return actividades;
    }

    public static List<ActividadDeportiva> getActividadesByInstitucion(InstitucionDeportiva institucion) {

        /*try {
            return institucion.getActividades();
        } catch (Exception e) {
            System.out.println("Error catch getActividadesByInstitucionDeportiva " + e);
            return null;
        }*/
        List<ActividadDeportiva> actividades;

        // actividades = entityManager.createQuery("SELECT a FROM ActividadDeportiva a WHERE a.", ActividadDeportiva.class).getResultList();
        actividades = entityManager.createQuery("SELECT a FROM ActividadDeportiva a WHERE a.institucion = :nombreInstitucion", ActividadDeportiva.class).setParameter("nombreInstitucion", institucion).getResultList();
        return actividades;
    }

     public static List<ActividadDeportiva> getActividadesByProfe(Profesor profesor) {

         try {
             List<ActividadDeportiva> resultList = entityManager.createQuery(
                     "SELECT a " +
                             "FROM ActividadDeportiva a " +
                             "INNER JOIN a.Clases c " +
                             "INNER JOIN c.profesor p " +
                             "WHERE p = :profesor",
                     ActividadDeportiva.class)
                     .setParameter("profesor", profesor)
                     .getResultList();

             return resultList;
         } catch (Exception e) {
             System.out.println("Error catch getClasesByProfe " + e);
             return null;
         }

     }


    public List<Clase> getClases() {
        return getClases();
    }

}
