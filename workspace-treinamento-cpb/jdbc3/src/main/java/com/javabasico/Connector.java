package com.javabasico;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

	public Connection makeConnection() throws ClassNotFoundException, SQLException {
		String fileDB = null;
		
		if (File.separatorChar == '/') {
			//linux based
			fileDB = "/home/filosofisto/CPB/cpb-treinamento/workspace-treinamento-cpb/jdbc1/data/filedb";
		} else {
			//Windows
			fileDB = "//G:/eduardo/project_history/treinamentos/instituicoes/x25/2011/logica e programacao Java6/etc/filedb/db";
		}
		
		Class.forName("org.hsqldb.jdbc.JDBCDriver");
		
		String url = "jdbc:hsqldb:file:" + fileDB;
		return DriverManager.getConnection(url, "SA", "");
	}
}
