package com.x25.logicajava;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		try {
			CreateTable createTable = new CreateTable();
			boolean criou = createTable.createPessoa();
			
			if (criou) {
				System.out.println("Tabela pessoa criada com sucesso");
			}
			
			System.out.println("Sistema iniciado");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
