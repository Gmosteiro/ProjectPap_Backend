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
                        
                        System.out.println("ManejadorClases despues del begin: ");

                        entityManager.persist(clase);
                        
                        System.out.println("despues del persis: ");
                        
                        entityManager.getTransaction().commit();
                        
                        System.out.println("despues del commit: ");
                        
                        entityManager.close();
                        
                        System.out.println("despues del close: ");
                        
                        emFactory.close();
                        
                        System.out.println("despues del close 2: ");
                        
                } catch (Exception exceptionAgregarClase){
			System.out.println("Catch agregarClase: " + exceptionAgregarClase);

			Throwable error = exceptionAgregarClase.getCause().getCause().getCause();
			System.out.println("ERROR");
}
	}
}


