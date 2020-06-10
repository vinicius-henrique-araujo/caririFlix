package br.com.caririflix.web.service;

import br.com.caririflix.web.DAO.UserDAO;
import br.com.caririflix.web.model.User;
import br.com.caririflix.web.util.exceptions.CaririFlixException;

public class UserService {
    UserDAO userDAO = new UserDAO();

    public void save(User user)throws CaririFlixException{
        if (user.getName() == null || user.getName().isEmpty()) 
            throw new CaririFlixException("Digite seu nome");

        if (user.getEmail() == null || user.getEmail().isEmpty())
            throw new CaririFlixException("Por favor insira o nome");

        if (user.getPassword() == null || user.getPassword().isEmpty())
            throw new CaririFlixException("Por favor insira a senha");
        userDAO.save(user);
    }
}