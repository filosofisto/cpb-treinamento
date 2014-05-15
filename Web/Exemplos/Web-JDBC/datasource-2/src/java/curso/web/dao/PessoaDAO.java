package curso.web.dao;

import curso.web.entity.Pessoa;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author filosofisto
 */
public class PessoaDAO {

    private Connection conn;

    public void setConn(Connection conn) {
        this.conn = conn;
    }
    
    public List<Pessoa> listarPessoas() throws SQLException {
        List<Pessoa> ret = new ArrayList<Pessoa>();
        Statement st = null;
        ResultSet rs = null;
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM pessoa ORDER BY nome");
            Pessoa p;
            
            while (rs.next()) {
                p = new Pessoa();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                
                ret.add(p);
            }
            
            return ret;
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    //Ignore
                }
            }
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException e) {
                    //Ignore
                }
            }
        }
    }
}
