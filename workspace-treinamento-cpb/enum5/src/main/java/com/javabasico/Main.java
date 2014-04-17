package com.javabasico;

public class Main {

	public static void main(String[] args) {
		if (Automovel.FERRARI.cor() == Cor.VERMELHO) {
			System.out.println("Eh um classico!!!");
		}
		
		Automovel auto = Automovel.FERRARI_BRANCA;
		
		if (auto.cor() == Cor.BRANCO && auto.isMetalico()) {
			System.out.println("Ferrari branca metalica");
		}
	}

}
