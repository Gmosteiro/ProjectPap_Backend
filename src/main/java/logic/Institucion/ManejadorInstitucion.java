package logic.Institucion;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import logic.ActividadDeportiva.ActividadDeportiva;

public class ManejadorInstitucion {
        private static EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("project_pap");
        private static EntityManager entityManager = emFactory.createEntityManager();

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

        public void actualizarInstitucion(InstitucionDeportiva institucion) {
                EntityManager entityManager = emFactory.createEntityManager();
                entityManager.getTransaction().begin();

                entityManager.merge(institucion);

                entityManager.getTransaction().commit();
                entityManager.close();
        }

        public static List<InstitucionDeportiva> getInstituciones() {

                EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("project_pap");
                EntityManager entityManager = emFactory.createEntityManager();
                List<InstitucionDeportiva> instituciones;

                instituciones = entityManager
                                .createQuery("SELECT e FROM InstitucionDeportiva e", InstitucionDeportiva.class)
                                .getResultList();

                return instituciones;
        }

        public static InstitucionDeportiva getInstitucionesByName(String nombre) {
                try {

                        if (!entityManager.isOpen()) {

                                if (!emFactory.isOpen()) {
                                        emFactory = Persistence.createEntityManagerFactory("project_pap");
                                }
                                entityManager = emFactory.createEntityManager();

                        }

                        InstitucionDeportiva institucion = entityManager.find(InstitucionDeportiva.class, nombre);

                        return institucion;
                } catch (Exception e) {
                        System.out.println("Error getInstitucionesbyName: " + e);
                        return null;
                } finally {
                        emFactory.close();
                        entityManager.close();
                }
        }

        public void agregarActividadI(ActividadDeportiva actividad, String nombrei) {
                try {
                        InstitucionDeportiva Institucion = getInstitucionesByName(nombrei);

                        // Institucion.setActividades(actividad);
                        Institucion.getActividades().add(actividad);
                        entityManager.getTransaction().begin();
                        entityManager.persist(Institucion);
                        entityManager.getTransaction().commit();

                } catch (Exception exceptionAgregarClase) {
                        System.out.println("Catch agregarActividadI: " + exceptionAgregarClase);
                        System.out.println("ERROR");
                }
        }

        public List<ActividadDeportiva> getActividades() {
                return getActividades();
        }

}
