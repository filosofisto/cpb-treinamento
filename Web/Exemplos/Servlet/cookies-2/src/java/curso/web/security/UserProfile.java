/*
 * UserProfile.java
 *
 * Created on 1 de Mar�o de 2006, 10:59
 *
 */

package curso.web.security;

/**
 *
 * @author hp
 */
public class UserProfile {
    
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
