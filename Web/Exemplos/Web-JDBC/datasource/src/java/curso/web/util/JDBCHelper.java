/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.web.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eduardo
 */
public final class JDBCHelper {
    
    private JDBCHelper() { }
    
    public static void close(Connection conn) {
        if (conn == null) {
            return;
        }
        
        try {
            conn.close();
        } catch (SQLException e) {
            Logger.getLogger(JDBCHelper.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public static void close(Statement stm) {
        if (stm == null) {
            return;
        }
        
        try {
            stm.close();
        } catch (SQLException e) {
            Logger.getLogger(JDBCHelper.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public static void close(ResultSet rs) {
        if (rs == null) {
            return;
        }
        
        try {
            rs.close();
        } catch (SQLException e) {
            Logger.getLogger(JDBCHelper.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
