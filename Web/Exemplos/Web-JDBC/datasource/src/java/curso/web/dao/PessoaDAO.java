package curso.web.dao;

import curso.web.entity.Pessoa;
import curso.web.util.JDBCHelper;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author filosofisto
 */
public class PessoaDAO extends AbstractDAO {

    public void incluir(Pessoa p) throws SQLException {
        PreparedStatement ps = null;
    
        try {
            ps = conn.prepareStatement(
                "INSERT INTO pessoa(id,nome) VALUES (?,?)");
            ps.setInt(1, p.getId());
            ps.setString(2, p.getNome());
        
            ps.executeUpdate();
        } finally {
            JDBCHelper.close(ps);
        }
    }
    
    public void atualizar(Pessoa p) throws SQLException {
        PreparedStatement ps = null;
    
        try {
            ps = conn.prepareStatement(
                "UPDATE pessoa set nome=? WHERE id=?");
            ps.setString(1, p.getNome());
            ps.setInt(2, p.getId());
        
            ps.executeUpdate();
        } finally {
            JDBCHelper.close(ps);
        }
    }
    
    public void excluir(Pessoa p) throws SQLException {
        PreparedStatement ps = null;
    
        try {
            ps = conn.prepareStatement(
                "delete from pessoa WHERE id=?");
            ps.setInt(1, p.getId());
        
            ps.executeUpdate();
        } finally {
            JDBCHelper.close(ps);
        }
    }
    
    public void excluirPessoas(Pessoa[] pessoas) throws SQLException {
        PreparedStatement ps = null;
    
        try {
            ps = conn.prepareStatement(
                "delete from pessoa WHERE id=?");
            
            for (Pessoa p: pessoas) {
                ps.setInt(1, p.getId());
        
                ps.executeUpdate();
            }
        } finally {
            JDBCHelper.close(ps);
        }
    }
    
    public Pessoa carregar(Integer id) throws SQLException {
        Pessoa ret = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            ps = conn.prepareStatement(
                "SELECT * FROM pessoa WHERE id=?");
            ps.setInt(1, id);
        
            rs = ps.executeQuery();
            if (rs.next()) {
                ret = new Pessoa();
                ret.setId(id);
                ret.setNome(rs.getString("nome"));
                
                return ret;
            } else {
                throw new SQLException("Registro não encontrado");
            }
        } finally {
            JDBCHelper.close(rs);
            JDBCHelper.close(ps);
        }
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
            JDBCHelper.close(rs);
            JDBCHelper.close(st);
        }
    }
}
