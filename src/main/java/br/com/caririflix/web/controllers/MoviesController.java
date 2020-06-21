package br.com.caririflix.web.controllers;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import java.util.List;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caririflix.web.DAO.MoviesDAO;
import br.com.caririflix.web.model.Movies;
import br.com.caririflix.web.service.MoviesService;
import br.com.caririflix.web.util.exceptions.CaririFlixException;

@Controller
@Path("/movies")
public class MoviesController {
    @Inject
    private Result result;
    @Inject
    private MoviesService moviesService;
    @Inject
    private MoviesDAO moviesDAO;
    @Get("new")
    public  void  create () {
    }
    
    @Post("new")
    public void save(Movies movies) {          
        try {
            moviesService.save(movies);
            result.redirectTo(this).getMovies(); 
        } catch (CaririFlixException ex) {
            result.include(ex.getMessage());
            result.redirectTo(this).create();
        }    
    }

    @Post("/update")
    public void update(Movies movies) {
        try {
            moviesService.update(movies);
            result.redirectTo(this);
        } catch (CaririFlixException e) {
            result.include(e.getMessage());
            result.redirectTo(this).update(movies);
        }
    }
    @Get("id/{id}")
    public void getMoviesById(Integer code){
        Movies movies = moviesService.findById(code);    
        result.include("moviesToUpdate", movies);
        result.of(this).update(null);
    }    
    
    @Get("/list")
    public void getMovies() {

        List<Movies> movies = moviesDAO.all();
        
        for( Movies movies1 : movies) {
            System.out.println(movies1.getCode());
        }
        result.include("movies", movies);
    }
    
    @Post("/remove")
    public void remove(Movies movies){
        moviesService.delete(movies);
        result.redirectTo(this).getMovies();          
    }
    
  /*  @Public
    @Post("busca")
    public void listaSearch(String donorName) {

        List<Movies> donor = (List<Movies>) moviesDAO.all(donorName);
        result.include("it", movies);
        result.of(this).listDonor();
    }*/

}