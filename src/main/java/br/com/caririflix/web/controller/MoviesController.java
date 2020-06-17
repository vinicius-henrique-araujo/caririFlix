package br.com.caririflix.web.controller;



import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.interceptor.IncludeParameters;
import br.com.caririflix.web.model.Movies;
import br.com.caririflix.web.service.MoviesService;

@Controller
@Path("/movies")
public class MoviesController {
    @Inject
    private Result result;
    @Inject
    private MoviesService moviesService;
    
    @Post
    public  void  create () {
        
    }
    
    @Post("")
    @IncludeParameters
    public void store(Movies movies) {          
        try {
            moviesService.save(movies);
            result.redirectTo(this); //Observação, Tiramos o get Customer
        } catch (Exception ex) {
            result.include(ex.getMessage());
            result.redirectTo(this).create();
        }    
    }

    @Post("/update")
    public void update(Movies movies) {
        try {
            moviesService.update(movies);
            result.redirectTo(this);
        } catch (Exception e) {
            //TODO: handle exception
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
    
    @Get("")
    public void getMovies() {
       result.include("moviesList", moviesService);
    }
    
    @Post("/remove")
    public void remove(Movies movies){
        moviesService.delete(movies);
        result.redirectTo(this).getMovies();          
    }

}