/*
 * Usuario.java
 *
 * Created on 6 de Mar�o de 2006, 13:00
 *
 */

package curso.web.beans;

/**
 *
 * @author hp
 */
public class Usuario extends Pessoa {
    
    private String username;
    private String password;

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
