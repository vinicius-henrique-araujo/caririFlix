package br.com.caririflix.web.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caririflix.web.components.AuthSession;
import br.com.caririflix.web.model.User;
import br.com.caririflix.web.components.*;
import javax.inject.Inject;

/**
 *
 * @author leonardo
 */
@Controller
public class AuthController {
    
    @Inject
    private AuthSession authSession;

    @Inject
    private Result result;
    
    @Get("signin")
    public void login(){
        
    }
    
    @Post("auth")
    public void authenticate(User user){
      
        if (user.getName().equalsIgnoreCase("joao") && 
                user.getPassword().equals("123")){
            user.setName(user.getName());
            user.getIsLogged(true);
            result.redirectTo(MoviesController.class).getMovies();
        }else{
            result.include("loginErrorMsg", "Login inválido!");
            result.redirectTo(this).login();
        }   
    }
    
    @Get("signout")
    public void signout(){
       User.signout();
       result.redirectTo(this).login();
    }

}   