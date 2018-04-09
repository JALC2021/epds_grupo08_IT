/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.login.actions;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author susana
 */
public class LoginCheck extends ActionSupport {
    private String username;
    private String password;
    
    public LoginCheck() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String execute() throws Exception {
        String resultado=SUCCESS;
        if(this.username.equals(this.password)){
            resultado=SUCCESS;
        }else{
           resultado=ERROR; 
        }
        return resultado;
    }
    
}
