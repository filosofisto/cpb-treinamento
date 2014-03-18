package com.javabasico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com o valor:");
		long n = scanner.nextLong();

		System.out.printf("Fat(%d) = %d", n, fatorial(n));
		scanner.close();
	}

	private static long fatorialNormal(long n) {
		long resultado = 1;
		
		//for (int i = 2; i <= n; i++) {
		for (long i = n; i > 1; i--) {
			resultado = resultado * i;
		}
		
		return resultado;
	}
	
	private static long fatorial(long n) {
		 if (n < 2) {
			 return 1;
		 } else {
			 return n*fatorial(n-1);
		 }
	}
}
