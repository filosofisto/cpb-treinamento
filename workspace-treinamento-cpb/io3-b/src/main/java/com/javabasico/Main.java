package com.javabasico;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		Teclado teclado = new Teclado();
		
		String toFind = teclado.ler(
			"Entre com o nome do arquivo desejado");
		String dirName = "/home/filosofisto/CPB/cpb-treinamento";
		File dir = new File(dirName);
		
		File file = findFile(dir, toFind);
		if (file != null) {
			System.out.printf("Achei em %s\n", file.getAbsolutePath());
			System.out.printf("Tamanho: %d bytes", file.length());
		} else {
			System.out.println("Nao encontrado :(");
		}
	}
	
	static File findFile(File dir, String toFind) {
		for (File f: dir.listFiles()) {
			if (f.isFile()) {
				if (f.getName().equals(toFind)) {
					return f;
				}
			}
		}
		
		for (File f: dir.listFiles()) {
			if (f.isDirectory()) {
				File ret = findFile(f, toFind);
				if (ret != null) {
					return ret;
				}
			}
		}
		
		return null;
	}
}
