/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.web.dao;

import java.sql.SQLException;
import javax.sql.DataSource;

/**
 *
 * @author eduardo
 */
public class DAOFactory {

    private static DAOFactory instance = new DAOFactory();
    
    private DataSource ds;
    
    private DAOFactory() { }
    
    public static DAOFactory instance() {
        return instance;
    }
    
    public void setDataSource(DataSource ds) {
        this.ds = ds;
    }
    
    public PessoaDAO createPessoaDAO() throws SQLException {
        PessoaDAO dao = new PessoaDAO();
        dao.setConn(ds.getConnection());
        
        return dao;
    }
}
