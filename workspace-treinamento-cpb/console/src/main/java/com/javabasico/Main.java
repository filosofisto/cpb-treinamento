package com.javabasico;

import java.io.Console;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//linhaComando();
		ideConsole();
	}
	
	private static void linhaComando() {
		Console co = System.console();
		
		System.out.print("Entre com o seu nome: ");
		String input = co.readLine();
		co.printf("Parabens %s", input);
	}
	
	private static void ideConsole() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Entre com o seu nome: ");
		String input = s.next();
		System.out.printf("Parabens %s", input);
	}
}
