package com.javabasico;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		File arquivo = new File(
			"/home/filosofisto/CPB/cpb-treinamento/workspace-treinamento-cpb/lista-5-01/dados.txt"
		);
		File b = new File(
			"/home/filosofisto/CPB/cpb-treinamento/workspace-treinamento-cpb/lista-5-01/formatoB.txt"
		);
		File sql = new File(
				"/home/filosofisto/CPB/cpb-treinamento/workspace-treinamento-cpb/lista-5-01/dados.sql"
		);
		File obj = new File(
				"/home/filosofisto/CPB/cpb-treinamento/workspace-treinamento-cpb/lista-5-01/dados.obj"
		);

		Exportador exportador = new Exportador();
		
		try {
			exportador.toFormatoB(
					arquivo, 
					b
			);
			exportador.toSQL(arquivo, sql);
			exportador.toObject(arquivo, obj);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
