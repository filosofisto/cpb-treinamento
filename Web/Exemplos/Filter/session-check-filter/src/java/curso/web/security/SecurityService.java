/*
 * SecurityService.java
 *
 * Created on 8 de Marco de 2006, 20:43
 *
 */

package curso.web.security;

import curso.web.beans.User;
import java.util.Properties;

/**
 *
 * @author hp
 */
public class SecurityService {
    
    private Properties properties; 
    
    public boolean authenticate(User user) {
        if (properties.containsKey(user.getUsername())) {
            return properties.getProperty(user.getUsername()).equals(user.getPassword());
        }
        
        return false;
    }
    
    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
    
}
