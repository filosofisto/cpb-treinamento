/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.web.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Web application lifecycle listener.
 * @author 81646674987
 */
@WebListener()
public class TransactionListener implements ServletRequestListener {

    public void requestDestroyed(ServletRequestEvent sre) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void requestInitialized(ServletRequestEvent sre) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
