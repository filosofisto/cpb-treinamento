package com.javabasico;

import java.util.Scanner;

public class Main {

	private static Scanner scanner;
	
	public static void main(String[] args) {
		inicializaConsole();
		
		String valor1 = leConsole("Entre com o primeiro numero:");
		String valor2 = leConsole("Entre com o segundo numero:");
		String valor3 = leConsole("Entre com o terceiro numero:");
		
		int a = Integer.parseInt(valor1);
		int b = Integer.parseInt(valor2);
		int c = Integer.parseInt(valor3);
		int primeiro, segundo, terceiro;
		
		if (a >= b && a >= c) {
			terceiro = a;
			if (b >= c) {
				segundo = b;
				primeiro = c;
			} else {
				segundo = c;
				primeiro = b;
			}
		} else if (b >= a && b >= c) {
			terceiro = b;
			if (a >= c) {
				segundo = a;
				primeiro = c;
			} else {
				segundo = c;
				primeiro = a;
			}
		} else {
			terceiro = c;
			if (a >= c) {
				segundo = a;
				primeiro = b;
			} else {
				segundo = b;
				primeiro = a;
			}
		}
		
		System.out.printf("Primeiro: %d\nSegundo: %d\nTerceiro: %d",
				primeiro,
				segundo,
				terceiro);
		
		fechaConsole();
	}
	
	private static void inicializaConsole() {
		scanner = new Scanner(System.in);
	}
	
	private static void fechaConsole() {
		scanner.close();
	}
	
	private static String leConsole(String label) {
		System.out.print(label);
		String input = scanner.next();
		
		return input;
	}
}
