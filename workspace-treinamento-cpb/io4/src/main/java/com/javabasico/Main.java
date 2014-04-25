package com.javabasico;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		try {
			File file = new File("/home/filosofisto/CPB/cpb-treinamento/workspace-treinamento-cpb/io4/dados.dat");
			
			if (!file.exists()) {
				gerarDados(file);
			}
			
			lerDados(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void lerDados(File file) throws IOException {
		DataInputStream in = new DataInputStream(
				new FileInputStream(file));
		int valor;
		int total = 0;
		int count = 0;
		
		for (;;) {
			try {
				valor = in.readInt();
				
				System.out.println(valor);
				total += valor;
				count++;
			} catch (EOFException e) {
				break;
			}
		}
		
		System.out.printf("Media: %d", total/count);
	}

	private static void gerarDados(File file) throws IOException {
		Random r = new Random();
		DataOutputStream out = new DataOutputStream(
				new FileOutputStream(file));
		
		for (int i = 1; i < 100; i++) {
			out.writeInt(r.nextInt(100)+1);
		}
		
		out.close();
	}
	
}
