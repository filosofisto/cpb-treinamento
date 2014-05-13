package com.x25.logicajava;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	
	private static final String SQL_CREATE_PESSOA = 
		"CREATE TABLE PESSOA (CPF CHAR(11) NOT NULL PRIMARY KEY, NOME VARCHAR(30) NOT NULL, IDADE INTEGER NOT NULL)";

	private Connection conn;
	
	public boolean createPessoa() throws SQLException, ClassNotFoundException {
		try {
			if (!existPessoa()) {
				createTablePessoa();
				
				return true;
			}
			
			return false;
		} finally {
			if (conn != null) {
				conn.close();
			}
		}
	}
	
	private void createTablePessoa() throws SQLException, ClassNotFoundException {
		Statement stm = null;
		try {
			stm = getConnection().createStatement();
			stm.executeUpdate(SQL_CREATE_PESSOA);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stm != null) {
				try {
					stm.close();
				} catch (SQLException e) {
					//Ignore
					e.printStackTrace();
				}
			}
		}
	}

	private Connection getConnection() throws ClassNotFoundException, SQLException {
		if (conn == null) {
			Connector connector = new Connector();
			conn = connector.makeConnection();
		}
		
		return conn;
	}

	private boolean existPessoa() throws SQLException, ClassNotFoundException {
		Statement stm = getConnection().createStatement();
		
		try {
			stm.execute("select cpf from pessoa");
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			try {
				stm.close();
			} catch (SQLException e) {
				//Ignore
				e.printStackTrace();
			}
		}
	}
}
