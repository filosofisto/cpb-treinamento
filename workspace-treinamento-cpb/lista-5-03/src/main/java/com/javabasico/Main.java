package com.javabasico;

import java.io.File;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		File arquivo = new File(
			"/home/filosofisto/CPB/cpb-treinamento/workspace-treinamento-cpb/lista-5-01/dados.txt"
		);

		Importador importador = new Importador();
		
		try {
			List<Movimentacao> list = importador.importar(
					arquivo, 
					Movimentacao.class, 
					new String[] {"banco", "agencia", "cpf", "saldo"}
					//new String[] {"cpf", "saldo"}
			);
			
			Date hoje = new Date();
			
			for (Movimentacao mov: list) {
				mov.setData(hoje);
				System.out.println(mov);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
