package com.javabasico;

public class Main {

	public static void main(String[] args) {
		if (args.length != 1) {
			erro(-1);
		}
		if (!args[0].equals("banco") && !args[0].equals("rede")) {
			erro(-2);
		}
		
		Conectar c = new Conectar();
		c.calcular(args[0]);
	}

	private static void erro(int codigo) {
		System.out.println("Parametro: [banco|rede] ");
		System.exit(codigo);
	}
}
