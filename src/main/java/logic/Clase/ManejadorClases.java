package logic.Clase;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManejadorClases {

        public ManejadorClases() {
        }

        public void agregarClase(Clase clase) {
                try {

                        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("project_pap");
                        EntityManager entityManager = emFactory.createEntityManager();
                        entityManager.getTransaction().begin();

                        entityManager.persist(clase);

                        entityManager.getTransaction().commit();

                        entityManager.close();

                        emFactory.close();

                } catch (Exception exceptionAgregarClase) {
                        System.out.println("Catch agregarClase: " + exceptionAgregarClase);
                        System.out.println("ERROR");
                }
        }
}
