package logic.Clase.controllers;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import logic.ActividadDeportiva.ActividadDeportiva;
import logic.Clase.Clase;

public class ControllerRanking implements IControllerRanking {

    private EntityManagerFactory emf;

    public ControllerRanking() {
        emf = Persistence.createEntityManagerFactory("project_pap");
    }

    @Override
    public List<ActividadDeportiva> obtenerRankingDeActividades() {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
    
            TypedQuery<ActividadDeportiva> query = em.createQuery(
                "SELECT a " +
                "FROM ActividadDeportiva a " +
                "LEFT JOIN a.Clases ac " +
                "GROUP BY a " +
                "ORDER BY COUNT(ac) DESC",
                ActividadDeportiva.class);
    
            List<ActividadDeportiva> resultados = query.getResultList();
    
            em.getTransaction().commit();
    
            return resultados;
        } finally {
            em.close();
        }
    }
    
    
//    public List<Clase> obtenerRankingDeClases() {
//        EntityManager em = emf.createEntityManager();
//        
//        try {
//            em.getTransaction().begin();
//    
//            TypedQuery<Clase> query = em.createQuery(
//                      "SELECT c " +
//                      "FROM Clase c " +
//                      "LEFT JOIN Registro r ON c.nombre = r.clase_id " +
//                      "LEFT JOIN Socio cr ON r.id_Usuario = cr.id_Usuario " +
//                      "GROUP BY c " + 
//                      "ORDER BY COUNT(r.id_Usuario) DESC",
//                    //"SELECT c " + "FROM Clase c " + "LEFT JOIN Registro r ON c.nombre = r.clase_id " + "LEFT JOIN Socio cr ON r.id_Usuario = cr.id_Usuario " + "GROUP BY c " + "ORDER BY COUNT(r.id_Usuario) DESC",
//                    /*
//                    public ArrayList<DtClase> obtRankClases(){
//                        Conexion conexion = Conexion.getInstancia();
//                        EntityManager em = conexion.getEntityManager();
//                        Query query = em.createQuery("select c from Clase c order by size(c.registros) desc");
//                        ArrayList<DtClase> ret = new ArrayList<>();
//                        for(Clase c:(List<Clase>) query.getResultList())
//                                ret.add(c.getDT());
//                        return ret;
//                }
//                    */
//                Clase.class);
//    
//            List<Clase> resultados = query.getResultList();
//    
//            em.getTransaction().commit();
//    
//            return resultados;
//        } finally {
//            em.close();
//        }
//    }
    

    @Override
    public ActividadDeportiva obtenerActividadPorNombre(String nombreActividad) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();

            ActividadDeportiva actividad = em.find(ActividadDeportiva.class, nombreActividad);

            em.getTransaction().commit();

            return actividad;
        } finally {
            em.close();
        }
    }
    
    @Override
    public List<Clase> obtenerRankingDeClases(){
                        EntityManager em = emf.createEntityManager();
                    try {
                        em.getTransaction().begin();
                        //Query query = em.createQuery("SELECT c FROM Registro r INNER JOIN r.clase c order by count(clase) desc");
                        String jpqlQuery = "SELECT c " +
                          "FROM Clase c " +
                          "INNER JOIN Registro r ON c.nombre = r.clase " +
                          "GROUP BY c.nombre " +
                          "ORDER BY COUNT(r.id) DESC";
                        
                        TypedQuery<Clase> query = em.createQuery(jpqlQuery, Clase.class);
                        List<Clase> resultados = query.getResultList();
                        em.getTransaction().commit();
                        return resultados;
                    } finally {
                                em.close();
                            }
                }

    @Override
    public void closeEntityManagerFactory() {
        emf.close();
    }
}