/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Miguel Lillo
 */
public class Login {
    private String u;
    private String password;
    private List<Usuario> users;

    public Login() {
        users = new ArrayList<>();
        users.add(new Usuario("Educando", "asdf", Usuario.Rol.EDU));
        users.add(new Usuario("Admin", "qwer", Usuario.Rol.ADMIN));
    }
    
    public String autenticar(){
        
        return "";
    }

    public String getU() {
        return u;
    }

    public void setU(String u) {
        this.u = u;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Usuario> getUsers() {
        return users;
    }

    public void setUsers(List<Usuario> users) {
        this.users = users;
    }
    
}
