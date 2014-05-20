/*
 * AppListener.java
 *
 * Created on 27 de Fevereiro de 2006, 18:34
 *
 */

package curso.web.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 * @author hp
 */
public class AppListener implements ServletContextListener {
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        sce.getServletContext().log(
                "Inicializando a aplicacao...\n" + 
                "Aqui recursos sao alocados");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        sce.getServletContext().log("Destruindo a aplicacao...\n" + 
                " Libere todos os recursos alocados na inicializacao");
    }
}
