package com.javabasico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Teclado {

	private BufferedReader reader;
	
	public Teclado() {
		reader = new BufferedReader(
				new InputStreamReader(System.in));
	}
	
	public String lerComando() throws IOException {
		System.out.print("Digite comando: ");
	
		return reader.readLine();
	}
}
