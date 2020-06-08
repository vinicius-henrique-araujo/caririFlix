package br.com.caririflix.web.service;

import br.com.caririflix.web.DAO.AuthorDAO;
import br.com.caririflix.web.model.Author;
import br.com.caririflix.web.util.exceptions.CarirFlixException;

public class AuthorService {
    AuthorDAO authorDAO =  new AuthorDAO();
    
    public void save(Author author)throws CarirFlixException{
        if(author.getName() == null || author.getName().isEmpty())
            throw new CarirFlixException("Por favor insira o nome do Autor do filme");
        if(author.getFilme()== null || author.getFilme().isEmpty())
            throw new CarirFlixException("Por favor insira o nome do filme");
        authorDAO.save(author);
    }
    
}