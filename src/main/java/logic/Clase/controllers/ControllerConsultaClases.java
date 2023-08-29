package logic.Clase.controllers;

import logic.Clase.Clase;
import logic.Clase.ManejadorClases;
import logic.Institucion.InstitucionDeportiva;
import logic.ActividadDeportiva.ActividadDeportiva;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ControllerConsultaClases implements IControllerConsultaClases {
    private EntityManagerFactory emf;

    public ControllerConsultaClases() {
        emf = Persistence.createEntityManagerFactory("project_pap");
    }

    public List<String> obtenerActividadesDeportivasPorInstitucion(String nombreInstitucion) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();

            Query query = em.createQuery(
                    "SELECT i FROM InstitucionDeportiva i WHERE i.nombre = :nombreInstitucion",
                    InstitucionDeportiva.class);
            query.setParameter("nombreInstitucion", nombreInstitucion);

            InstitucionDeportiva institucion = (InstitucionDeportiva) query.getSingleResult();

            List<String> nombresActividades = new ArrayList<>();
            for (ActividadDeportiva actividad : institucion.getActividades()) {
                nombresActividades.add(actividad.getNombre());
            }

            em.getTransaction().commit();

            return nombresActividades;
        } finally {
            em.close();
        }
    }

    public List<Clase> obtenerClasesPorActividad(String nombreActividad) {
        ManejadorClases manejadorClases = new ManejadorClases();
        return manejadorClases.getClasesByActividad(nombreActividad);
    }

    public Clase obtenerDetallesClase(String nombreClase) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
    
            Query query = em.createQuery(
                    "SELECT c FROM Clase c WHERE c.nombre = :nombreClase", Clase.class);
            query.setParameter("nombreClase", nombreClase);
    
            Clase clase = (Clase) query.getSingleResult();
    
            em.getTransaction().commit();
    
            return clase;
        } finally {
            em.close();
        }
    }
    

    public void closeEntityManagerFactory() {
        emf.close();
    }
}
