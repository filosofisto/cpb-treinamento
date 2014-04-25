package com.javabasico;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		String toFind = Teclado.ler(
				"Entre com o nome do arquivo desejado: ");
		String dirName = "c:/curso-java";
		File root = new File(dirName);
		
		String absPath = findFile(root, toFind);
		if (absPath != null) {
			System.out.printf("Achei em %s", absPath);
		} else {
			System.out.println("Nao encontrado :(");
		}
	}
	
	static String findFile(File dir, String toFind) {
		for (File f: dir.listFiles()) {
			if (f.isFile()) {
				if (f.getName().equals(toFind)) {
					return f.getAbsolutePath();
				}
			}
		}
		
		for (File f: dir.listFiles()) {
			if (f.isDirectory()) {
				String ret = findFile(f, toFind);
				if (ret != null) {
					return ret;
				}
			}
		}
		
		return null;
	}

}
