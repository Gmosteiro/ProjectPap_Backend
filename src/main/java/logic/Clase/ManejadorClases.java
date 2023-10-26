package logic.Clase;

import java.util.List;

import javax.persistence.EntityManager;

import DataBase.DbManager;
import logic.Usuario.Profesor;
import logic.Usuario.Socio;

public class ManejadorClases {
    private DbManager controllerBD;
    private EntityManager entityManager;

    public ManejadorClases() {
        controllerBD = DbManager.getInstance();
    }

    public void agregarClase(Clase clase) {
        try {
            entityManager = controllerBD.getEntityManager();

            entityManager.getTransaction().begin();
            entityManager.persist(clase);
            entityManager.getTransaction().commit();

            controllerBD.closeEntityManager();

        } catch (Exception exceptionAgregarClase) {
            System.out.println("Catch agregarClase: " + exceptionAgregarClase);
        }
    }

    public List<Clase> getClasesByProfe(Profesor profesor) {
        try {

            entityManager = controllerBD.getEntityManager();

            List<Clase> listClase;
            listClase = entityManager.createQuery(
                    "SELECT c FROM Clase c WHERE c.profesor = :profesor", Clase.class)
                    .setParameter("profesor", profesor)
                    .getResultList();

            controllerBD.closeEntityManager();

            return listClase;
        } catch (Exception e) {
            System.out.println("Error catch getClasesByProfe " + e);
            return null;
        }
    }

    public List<Clase> getClasesBySocio(Socio socio) {
        try {

            entityManager = controllerBD.getEntityManager();

            List<Clase> resultList = entityManager.createQuery(
                    "SELECT c " +
                            "FROM Registro r " +
                            "INNER JOIN r.socio s " +
                            "INNER JOIN r.clase c " +
                            "WHERE s = :socio",
                    Clase.class)
                    .setParameter("socio", socio)
                    .getResultList();

            controllerBD.closeEntityManager();

            return resultList;
        } catch (Exception e) {
            System.out.println("Error catch getClasesBySocio " + e);
            return null;
        }
    }

    public List<Clase> getClasesByActividad(String nombreActividad) {
        try {

            entityManager = controllerBD.getEntityManager();

            List<Clase> listClase;
            listClase = entityManager.createQuery(
                    "SELECT c FROM Clase c WHERE c.ClaseACT = :nombreActividad", Clase.class)
                    .setParameter("nombreActividad", nombreActividad)
                    .getResultList();

            controllerBD.closeEntityManager();

            return listClase;
        } catch (Exception e) {
            System.out.println("Error catch getClasesByActividad " + e);
            return null;
        }
    }

    public List<Clase> getClasesByNombre(String nombreActividad) {
        try {

            entityManager = controllerBD.getEntityManager();

            List<Clase> listClase;
            listClase = entityManager.createQuery(
                    "SELECT c FROM Clase c WHERE c.ClaseACT = :nombreActividad", Clase.class)
                    .setParameter("nombreActividad", nombreActividad)
                    .getResultList();

            controllerBD.closeEntityManager();

            return listClase;
        } catch (Exception e) {
            System.out.println("Error catch getClasesByActividad " + e);
            return null;
        }
    }

    public Clase getClaseByNombre(String nombreClase) {
        try {

            entityManager = controllerBD.getEntityManager();

            entityManager.getTransaction().begin();

            Clase clase = entityManager.find(Clase.class, nombreClase);

            entityManager.getTransaction().commit();

            controllerBD.closeEntityManager();

            return clase;
        } catch (Exception e) {
            System.out.println("Error catch getClaseByNombre " + e);
            return null;
        }
    }

    public List<Clase> getClases() {

        entityManager = controllerBD.getEntityManager();

        List<Clase> clases = entityManager
                .createQuery("SELECT c FROM Clase c", Clase.class)
                .getResultList();

        controllerBD.closeEntityManager();

        return clases;
    }

}
