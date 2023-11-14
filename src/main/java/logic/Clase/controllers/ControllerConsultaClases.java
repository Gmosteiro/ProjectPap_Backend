
package logic.Clase.controllers;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import logic.ActividadDeportiva.ActividadDeportiva;
import logic.Clase.Clase;
import logic.Clase.ManejadorClases;

public class ControllerConsultaClases implements IControllerConsultaClases {

    private EntityManagerFactory emf;

    public ControllerConsultaClases() {
        emf = Persistence.createEntityManagerFactory("project_pap");
    }

    public List<ActividadDeportiva> obtenerActividadesPorInstitucion(String nombreInstitucion) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();

            Query query = em.createQuery(
                    "SELECT a FROM ActividadDeportiva a WHERE a.institucion.nombre = :nombreInstitucion",
                    ActividadDeportiva.class);
            query.setParameter("nombreInstitucion", nombreInstitucion);

            final List<ActividadDeportiva> actividades = query.getResultList();

            em.getTransaction().commit();
            em.close();
            return actividades;
        } catch (Exception e) {
            System.out.println("Catch obtenerActividadesPorInstitucion: " + e);
            return null;

        }
    }

    public List<Clase> obtenerClasesPorActividad(ActividadDeportiva actividad) {
        EntityManager em = emf.createEntityManager();
        try {

            List<Clase> clases = actividad.getClases(); // Obtén las clases asociadas a la actividad.

            return clases;
        } finally {
            em.close();
        }
    }

    public Clase obtenerClasePorNombre(String nombreClase) {
        return ManejadorClases.getClaseByNombre(nombreClase);
    }

    public void closeEntityManagerFactory() {
        emf.close();
    }
}
