package com.javabasico;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReaderObject {

	public static void main(String[] args) {
		try {
			File file = new File(
					"/home/filosofisto/CPB/cpb-treinamento/workspace-treinamento-cpb/lista-5-01/dados.obj"
			);
			ObjectInputStream is = new ObjectInputStream(
					new FileInputStream(file)
			);
			Movimentacoes movimentacoes = (Movimentacoes) is.readObject();
			for (Movimentacao mov: movimentacoes.getLista()) {
				System.out.println(mov);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
