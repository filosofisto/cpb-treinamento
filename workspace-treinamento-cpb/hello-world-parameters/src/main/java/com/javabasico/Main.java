package com.javabasico;

public class Main {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println(
				"Passe um numero para verificar se o mesmo eh par ou impar");
			System.exit(-1);
		}
		
		int n = Integer.parseInt(args[0]);
		if (n % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
	}
}
