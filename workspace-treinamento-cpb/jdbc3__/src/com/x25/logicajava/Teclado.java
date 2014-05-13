package com.x25.logicajava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Teclado {

	private BufferedReader reader;
	
	public Teclado() {
		reader = new BufferedReader(
				new InputStreamReader(System.in));
	}
	
	public String read(String label) throws IOException {
		System.out.print(label + ": ");
	
		return reader.readLine();
	}
}
