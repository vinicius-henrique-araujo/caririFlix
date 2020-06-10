package br.com.caririflix.web.DAO;

import javax.persistence.EntityManager;

import br.com.caririflix.web.DAO.util.ConnectionFactory;
import br.com.caririflix.web.model.User;

public class UserDAO {
    
    public void save(User user) {
        EntityManager em = ConnectionFactory.getEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
        }finally {
            if (em.isOpen() && em.getTransaction().isActive()) {
                em.close();
            }
        }
    }

    public void update(User user) {
        EntityManager em = ConnectionFactory.getEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
        }finally {
            if (em.isOpen() && em.getTransaction().isActive()) {
                em.close();
            }
        }
    }

    public void remove(User user) {
        EntityManager em = ConnectionFactory.getEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            if (em.isOpen() &&  em.getTransaction().isActive())
                em.close();
        }
    }

    public User findById(Integer code) {
        EntityManager em = ConnectionFactory.getEntityManager();

        try {
            User u = em.find(User.class, code);
            return u;
            
        } finally {
            if (em.isOpen() && em.getTransaction().isActive())
                em.close();
        
        }
    }
}