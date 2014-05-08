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

		Exportador exportador = new Exportador();
		
		try {
			exportador.toFormatoB(
					arquivo, 
					b
			);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
