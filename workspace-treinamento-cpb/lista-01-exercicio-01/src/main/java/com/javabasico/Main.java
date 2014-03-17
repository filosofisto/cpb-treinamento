package com.javabasico;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/*System.out.println("Entre com o primeiro numero:");
		int a = scanner.nextInt();
		
		System.out.println("Entre com o segundo numero:");
		int b = scanner.nextInt();
		
		System.out.println("Entre com o terceiro numero:");
		int c = scanner.nextInt();
		
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
				terceiro);*/
		
		int[] lista = new int[3];
		for (int i = 0; i < lista.length; i++) {
			System.out.println("Entre com o valor:");
			lista[i] = scanner.nextInt();
		}
		
		Arrays.sort(lista);
		
		for (int i = 0; i < lista.length; i++) {
			System.out.printf("%d\n", lista[i]);
		}
		
		scanner.close();
	}
}
