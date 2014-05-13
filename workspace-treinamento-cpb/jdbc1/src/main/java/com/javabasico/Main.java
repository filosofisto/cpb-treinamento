package com.javabasico;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		try {
			String fileDB = null;
			
			if (File.separatorChar == '/') {
				//linux based
				fileDB = "/home/filosofisto/CPB/cpb-treinamento/workspace-treinamento-cpb/jdbc1/data/filedb";
			} else {
				//TODO: Alterar para Windows 
				//Windows
				fileDB = "G:\\eduardo\\project_history\\treinamentos\\instituicoes\\x25\\2011\\logica e programacao Java6\\etc\\filedb\\db";
			}
			
			Class.forName("org.hsqldb.jdbc.JDBCDriver");
			
			String url = "jdbc:hsqldb:file:" + fileDB;
			Connection c = DriverManager.getConnection(url, "x25", "!@#sx5!@#");
			
			System.out.println("Conexao realizada com sucesso");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
