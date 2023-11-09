package DataBase;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DbManager {

    private static DbManager instance;
    private EntityManagerFactory emf;

    private DbManager() {
        emf = Persistence.createEntityManagerFactory("project_pap");
    }

    public static synchronized DbManager getInstance() {

        try {

            if (instance == null) {
                instance = new DbManager();
            }
            return instance;

        } catch (Exception e) {
            System.out.println("Catch DbManager getInstance: " + e);
            return null;
        }
    }

    public EntityManager getEntityManager() {
        try {

            if (emf.isOpen()) {

                return emf.createEntityManager();
            } else {
                emf = Persistence.createEntityManagerFactory("project_pap");
                return emf.createEntityManager();

            }
        } catch (Exception e) {
            System.out.println("Catch getEntityManager: " + e);
            return null;
        }
    }

    public void closeEntityManager() {
        try {

            emf.close();
        } catch (Exception e) {
            System.out.println("Catch closeEntityManager: " + e);
        }
    }
}
