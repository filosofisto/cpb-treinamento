/*
 * SecurityService.java
 *
 * Created on 1 de Mar�o de 2006, 11:09
 *
 */

package curso.web.security;

/**
 *
 * @author hp
 */
public class SecurityService {
    
    public boolean isUserValid(UserProfile user) {
        return "admin".equals(user.getUsername()) && "platao".equals(user.getPassword());
    }
}
