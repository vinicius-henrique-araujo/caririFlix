package br.com.caririflix.web.service;

import br.com.caririflix.web.DAO.ActorDAO;
import br.com.caririflix.web.model.Actor;
import br.com.caririflix.web.util.exceptions.CaririFlixException;

public class ActorService {
    ActorDAO actorDAO = new ActorDAO();

    public void save(Actor actor)throws CaririFlixException{
        if (actor.getName() == null || actor.getName().isEmpty())
            throw new CaririFlixException("Digite o nome");

        if (actor.getIdade() == null || actor.getIdade().isEmpty())
            throw new CaririFlixException("Digite a Idade");

        if (actor.getBirth() == null || actor.getBirth().isEmpty())
            throw new CaririFlixException("Digite a data de nascimento");

        if (actor.getCharacter() == null || actor.getCharacter().isEmpty())
            throw new CaririFlixException("Digite o nome do personagem");
        actorDAO.save(actor);

    }



}