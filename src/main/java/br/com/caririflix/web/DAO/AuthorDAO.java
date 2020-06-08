package br.com.caririflix.web.DAO;

import javax.persistence.EntityManager;

import br.com.caririflix.web.DAO.util.*;
import br.com.caririflix.web.model.Author;

public class AuthorDAO {

    public void save(Author author) {
        EntityManager em = ConnectionFactory.getEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(author);
            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            if (em.isOpen() && em.getTransaction().isActive())
                em.close();
        }

    }

    public void update(Author author) {
        EntityManager em = ConnectionFactory.getEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(author);
            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            if (em.isOpen() && em.getTransaction().isActive())
                em.close();
        }

    }

    public void remove(Author author) {
        EntityManager em = ConnectionFactory.getEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(author);
            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            if (em.isOpen() && em.getTransaction().isActive())
                em.close();
        }

    }

    public Author findById(Integer code) {
        EntityManager em = ConnectionFactory.getEntityManager();

        try {
            Author b = em.find(Author.class, code);
            return b;
        } finally {
            if (em.isOpen() && em.getTransaction().isActive())
                em.close();
        }

    }
}