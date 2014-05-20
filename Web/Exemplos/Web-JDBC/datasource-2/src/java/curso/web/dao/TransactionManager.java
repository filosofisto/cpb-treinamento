/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.web.dao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author 81646674987
 */
public class TransactionManager {
    
    private static TransactionManager instance = new TransactionManager();
    
    public static TransactionManager instance() {
        return instance;
    }

    private ThreadLocal<Connection> local;
    
    public void setConnection(Connection conn) throws SQLException {
        conn.setAutoCommit(true);
        local.set(conn);
    }
    
    public void start() throws SQLException {
        local.get().setAutoCommit(true);
    }
    
    public void commit() throws SQLException {
        local.get().commit();
        reset();
    }
    
    public void rollback() throws SQLException {
        local.get().rollback();
        reset();
    }
    
    private void reset() {
        local.set(null);
    }
}
