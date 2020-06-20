package br.com.caririflix.web.components;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;


@SessionScoped
public class AuthSession implements Serializable{
    
    private boolean isLogged;
    private String userName;

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public boolean isLogged(){
        System.out.println("isLogged " + isLogged);
        return isLogged;
    }

    public String getUserName() {
        return userName;
    }

    public void setIsLogged(Boolean isLogged) {
        this.isLogged = isLogged;
    }
    
    public void signout(){
        this.isLogged = false;
        this.userName = null;
    }
}