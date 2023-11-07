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
        if (instance == null) {
            instance = new DbManager();
        }
        return instance;
    }

    public EntityManager getEntityManager() {

        if (emf.isOpen()) {

            return emf.createEntityManager();
        } else {
            emf = Persistence.createEntityManagerFactory("project_pap");
            return emf.createEntityManager();

        }
    }

    public void closeEntityManager() {
        emf.close();
    }
}
