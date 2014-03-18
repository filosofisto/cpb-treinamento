package com.javabasico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe um numero: ");
		int n = scanner.nextInt();
		
		for (int i = 0; i <= n; i++) {
			System.out.printf("%d  ", fib(i));
		}
	}
	
	private static int fib(int n) {
		if (n == 0) {
			return 0; 
		} else if (n == 1) {
			return 1;
		} else {
			return fib(n-1) + fib(n-2);
		}
	}
}
