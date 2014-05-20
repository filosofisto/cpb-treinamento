package com.javabasico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class AbstractDAO<T, K> {

	private Connection connection;
	
	private PreparedStatement pInsert;
	
	public AbstractDAO(Connection connection) {
		this.connection = connection;
	}
	
	public void incluir(T entidade) throws SQLException {
		PreparedStatement p = null;

		try {
			p = getPInsert();

			bindInsert(p, entidade);

			p.executeUpdate();
		} finally {
			if (p != null) {
				try {
					p.close();
				} catch (SQLException e) {
					// Ignore
				}
			}
		}
	}
	

	private PreparedStatement getPInsert() throws SQLException {
		if (pInsert == null) {
			pInsert = connection.prepareStatement(
				insertSQL()
			);
		}
		
		return pInsert;
	}
	
	protected abstract String insertSQL();
	
	protected abstract void bindInsert(
			PreparedStatement p, T entidade) throws SQLException;
	
	/*public void atualizar(T entidade) {
		
	}
	
	public T obter(K chave) {
		
	}

	public List<T> listar() {
		
	}
	
	public void excluir(K chave) {
		
	}*/
	
	public void closeConnection() {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
