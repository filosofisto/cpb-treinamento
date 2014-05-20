package com.javabasico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

	private static final String SQL = 
			"INSERT INTO PESSOA(CPF,NOME,IDADE) VALUES (?,?,?)";

	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/cpb_treinamento";
			conn = DriverManager.getConnection(
					url, "root", "socrates"
			);
			
			PreparedStatement p = conn.prepareStatement(SQL);
			
			conn.setAutoCommit(false);
			
			p.setString(1, "87654321234");
			p.setString(2, "Pele");
			p.setInt(3, 70);
			p.executeUpdate();
			
			p.setString(1, "37654321234");
			p.setString(2, "Xuxa");
			p.setInt(3, 50);
			p.executeUpdate();
			
			p.setString(1, "50654321234");
			p.setString(2, "Maradona");
			p.setInt(3, 70);
			p.executeUpdate();
			
			conn.commit();
		} catch (Exception e) {
			if (conn != null) {
				try {
					conn.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			
			e.printStackTrace();
		}
		
	}
}
