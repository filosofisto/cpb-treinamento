package com.javabasico;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rnd = new Random();
		int nota1 = rnd.nextInt(10);
		int nota2 = rnd.nextInt(10);
		int nota3 = rnd.nextInt(10);
		
		float media = (nota1+nota2+nota3)/3;
		
		System.out.printf("Media: %.2f - %s",
				media, media < 6 ? "Reprovado" : "Aprovado");
	}
}
