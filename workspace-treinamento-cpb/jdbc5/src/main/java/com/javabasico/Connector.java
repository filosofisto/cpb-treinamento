package com.javabasico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

	public Connection makeConnection() 
			throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost/cpb_treinamento";
		return DriverManager.getConnection(url, "root", "socrates");
	}
}
