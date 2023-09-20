package logic.Usuario.controllers;

import logic.Usuario.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;

public class ControllerInicioSesion implements IControllerInicioSesion{

    public Usuario iniciarSesion(String nickname, String contrasena) {
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("project_pap");
        EntityManager entityManager = emFactory.createEntityManager();

        try {
            TypedQuery<Usuario> query = entityManager.createQuery(
                    "SELECT u FROM Usuario u WHERE u.nickname = :nickname AND u.contrasena = :contrasena",
                    Usuario.class);
            query.setParameter("nickname", nickname);
            query.setParameter("contrasena", contrasena);

            if (!query.getResultList().isEmpty()) {
                return query.getSingleResult();
            } else {
                // Si no se encuentra un usuario con esos datos, devolver null
                return null;
            }
        } finally {
            entityManager.close();
            emFactory.close();
        }
    }
}
