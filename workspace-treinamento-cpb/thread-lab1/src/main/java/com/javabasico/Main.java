package com.javabasico;

public class Main {

	public static void main(String[] args) {
		Atleta[] atletas = new Atleta[8];
		
		for (int i = 0; i < atletas.length; i++) {
			atletas[i] = new Atleta(i+1);
		}
		
		for (Atleta atleta: atletas) {
			atleta.start();
		}
	}
}
