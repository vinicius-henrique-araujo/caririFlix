package  br.com.caririflix.web.DAO;
import javax.persistence.EntityManager;

import br.com.caririflix.web.DAO.util.*;
import br.com.caririflix.web.model.Author;




public class AuthorDAO {
    EntityManager em = ConnectionFactory.getEntityManager();

    public void save(Author author) {
        try {
            em.getTransaction().begin();
            em.persist(author);
            em.getTransaction().commit();
        
        }
        catch (Exception e){
            em.getTransaction().rollback();
        }finally{
            if(em.isOpen() && em.getTransaction().isActive())
            em.close();
        }
        
    }
}