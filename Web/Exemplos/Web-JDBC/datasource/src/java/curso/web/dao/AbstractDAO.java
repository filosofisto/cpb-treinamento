/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.web.dao;

import curso.web.util.JDBCHelper;
import java.sql.Connection;

/**
 *
 * @author 81646674987
 */
public abstract class AbstractDAO {

    protected Connection conn;

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public void releaseConnection() {
        JDBCHelper.close(conn);
    }
}
