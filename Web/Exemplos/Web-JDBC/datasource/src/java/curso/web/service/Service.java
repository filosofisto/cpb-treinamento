/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.web.service;

import curso.web.dao.DAOFactory;
import curso.web.dao.PessoaDAO;
import curso.web.entity.Pessoa;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eduardo
 */
public class Service {
    
    public void incluirPessoa(Pessoa pessoa) {
        PessoaDAO dao = null;
        
        try {
            dao = DAOFactory.instance().createPessoaDAO();
            dao.incluir(pessoa);
        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException(ex);
        } finally {
            if (dao != null) {
                dao.releaseConnection();
            }
        }
    }
    
    public Pessoa carregarPessoa(Integer id) {
        PessoaDAO dao = null;
        
        try {
            dao = DAOFactory.instance().createPessoaDAO();
            return dao.carregar(id);
        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException(ex);
        } finally {
            if (dao != null) {
                dao.releaseConnection();
            }
        }
    }
    
    public void atualizarPessoa(Pessoa pessoa) {
        PessoaDAO dao = null;
        
        try {
            dao = DAOFactory.instance().createPessoaDAO();
            dao.atualizar(pessoa);
        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException(ex);
        } finally {
            if (dao != null) {
                dao.releaseConnection();
            }
        }
    }
    
    public void excluirPessoa(Pessoa pessoa) {
        PessoaDAO dao = null;
        
        try {
            dao = DAOFactory.instance().createPessoaDAO();
            dao.excluir(pessoa);
        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException(ex);
        } finally {
            if (dao != null) {
                dao.releaseConnection();
            }
        }
    }
    
    public void excluirPessoas(Pessoa[] pessoas) {
        PessoaDAO dao = null;
        
        try {
            dao = DAOFactory.instance().createPessoaDAO();
            dao.excluirPessoas(pessoas);
        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException(ex);
        } finally {
            if (dao != null) {
                dao.releaseConnection();
            }
        }
    }
    
    public List<Pessoa> listarPessoas() {
        PessoaDAO dao = null;
        
        try {
            dao = DAOFactory.instance().createPessoaDAO();
            return dao.listarPessoas();
        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException(ex);
        } finally {
            if (dao != null) {
                dao.releaseConnection();
            }
        }
    }
}
