package br.com.caririflix.web.DAO;

import javax.persistence.EntityManager;

import br.com.caririflix.web.DAO.util.ConnectionFactory;
import br.com.caririflix.web.model.Actor;

public class ActorDAO {
    
    public void save(Actor actor) {
        EntityManager em = ConnectionFactory.getEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(actor);
            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
        }finally {
            if (em.isOpen() && em.getTransaction().isActive()) {
                em.close();
            }
        }
    }

    public void update(Actor actor) {
        EntityManager em = ConnectionFactory.getEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(actor);
            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            if (em.isOpen() && em.getTransaction().isActive())
                em.close();
        }

    }

    public void remove(Actor actor) {
        EntityManager em = ConnectionFactory.getEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(actor);
            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            if (em.isOpen() &&  em.getTransaction().isActive())
                em.close();
        }
    }
    public Actor findById(Integer code) {
        EntityManager em = ConnectionFactory.getEntityManager();

        try {
            Actor a = em.find(Actor.class, code);
            return a;
            
        } finally {
            if (em.isOpen() && em.getTransaction().isActive())
                em.close();
        
        }
    }
    
}