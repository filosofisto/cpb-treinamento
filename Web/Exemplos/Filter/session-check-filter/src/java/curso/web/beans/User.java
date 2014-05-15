/*
 * User.java
 *
 * Created on 8 de Marco de 2006, 19:26
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package curso.web.beans;

/**
 *
 * @author filosofisto
 */
public class User {
    
    private String username;
    private String password;
    
    public User() {
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
    
}
