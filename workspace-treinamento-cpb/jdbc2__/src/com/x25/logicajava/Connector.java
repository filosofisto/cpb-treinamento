package com.x25.logicajava;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

	public Connection makeConnection() throws ClassNotFoundException, SQLException {
		String fileDB = null;
		
		if (File.separatorChar == '/') {
			//linux based
			fileDB = "/home/eduardo/projetos/treinamentos/instituicoes/x25/2011/logica e programacao Java6/etc/filedb/db";
		} else {
			//Windows
			fileDB = "//G:/eduardo/project_history/treinamentos/instituicoes/x25/2011/logica e programacao Java6/etc/filedb/db";
		}
		
		Class.forName("org.hsqldb.jdbc.JDBCDriver");
		
		String url = "jdbc:hsqldb:file:" + fileDB;
		return DriverManager.getConnection(url, "SA", "");
	}
}
