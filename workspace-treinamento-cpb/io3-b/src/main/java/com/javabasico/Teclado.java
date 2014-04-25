package com.javabasico;

import java.util.Scanner;

public class Teclado {

	private Scanner scanner;
	
	public Teclado() {
		scanner = new Scanner(System.in);
	}
	
	public String ler(String texto) {
		System.out.println(texto + ": ");
		
		return scanner.nextLine();
	}
	
	

}
