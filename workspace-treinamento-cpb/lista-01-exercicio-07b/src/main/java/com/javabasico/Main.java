package com.javabasico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com 3 notas:");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();
		
		System.out.println("(A) Media Aritmetica");
		System.out.println("(B) Media Ponderada [3,3,4]");
		System.out.println("(C) Media Harmonica");
		System.out.println("(S) Sair");
		
		float resultado = 0;
		
		for (;;) {
			String opcao = scanner.next();

			if (opcao.equals("A")) {
				resultado = mediaAritmetica(n1,n2,n3);
				System.out.printf("Resultado: %.2f", resultado);
			} else if (opcao.equals("B")) {
				resultado = mediaPonderada(n1,n2,n3);
				System.out.printf("Resultado: %.2f", resultado);
			} else if (opcao.equals("C")) {
				resultado = mediaHarmonica(n1,n2,n3);
				System.out.printf("Resultado: %.2f", resultado);
			} else if (opcao.equals("S")) {
				break;
			} else {
				System.out.println("Comando invalido, tente novamente");
			}
		}

		
		scanner.close();
	}

	private static float mediaHarmonica(int n1, int n2, int n3) {
		return 3.0f/(1f/n1+1f/n2+1/n3); 
	}

	private static float mediaPonderada(int n1, int n2, int n3) {
		return (n1*3+n2*3+n3*4)/10;
	}

	private static float mediaAritmetica(int n1, int n2, int n3) {
		return (n1+n2+n3)/3;
	}
}
