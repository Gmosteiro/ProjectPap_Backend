package logic.Institucion;

import java.util.List;

import javax.persistence.EntityManager;

import DataBase.DbManager;
import logic.ActividadDeportiva.ActividadDeportiva;

public class ManejadorInstitucion {
        private DbManager controllerBD;
        private EntityManager entityManager;

        public ManejadorInstitucion() {
                controllerBD = DbManager.getInstance();
                entityManager = controllerBD.getEntityManager();
        }

        public void agregarInstitucion(InstitucionDeportiva institucion) {

                entityManager = controllerBD.getEntityManager();

                entityManager.getTransaction().begin();

                entityManager.persist(institucion);
                entityManager.getTransaction().commit();

                controllerBD.closeEntityManager();

        }

        public void actualizarInstitucion(InstitucionDeportiva institucion) {

                entityManager = controllerBD.getEntityManager();

                entityManager.getTransaction().begin();

                entityManager.merge(institucion);

                entityManager.getTransaction().commit();

                controllerBD.closeEntityManager();
        }

        public List<InstitucionDeportiva> getInstituciones() {

                entityManager = controllerBD.getEntityManager();

                List<InstitucionDeportiva> instituciones = entityManager
                                .createQuery("SELECT e FROM InstitucionDeportiva e", InstitucionDeportiva.class)
                                .getResultList();

                controllerBD.closeEntityManager();

                return instituciones;
        }

        public InstitucionDeportiva getInstitucionesByName(String nombre) {

                entityManager = controllerBD.getEntityManager();

                InstitucionDeportiva institucion = entityManager.find(InstitucionDeportiva.class, nombre);

                controllerBD.closeEntityManager();

                return institucion;
        }

        public void agregarActividadI(ActividadDeportiva actividad, String nombrei) {
                try {
                        InstitucionDeportiva Institucion = getInstitucionesByName(nombrei);

                        entityManager = controllerBD.getEntityManager();

                        // Institucion.setActividades(actividad);
                        Institucion.getActividades().add(actividad);
                        entityManager.getTransaction().begin();
                        entityManager.persist(Institucion);
                        entityManager.getTransaction().commit();

                        controllerBD.closeEntityManager();

                } catch (Exception exceptionAgregarClase) {
                        System.out.println("Catch agregarActividadI: " + exceptionAgregarClase);
                }
        }

}
