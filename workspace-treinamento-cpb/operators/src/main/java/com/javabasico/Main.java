package com.javabasico;

public class Main {

	public static void main(String[] args) {
		//-----------------------------------
		//Atribuicao: =
		//-----------------------------------
		int x = 10;
		int y;
		
		y = x;
		
		System.out.println("x == y: " + (x==y));
		
		//-----------------------------------
		//Operadores logicos
		//-----------------------------------
		int a, b;
		a = 1;
		b = 2;
		
		if (b > a) {
			System.out.println("B maior que A");
		} else {
			System.out.println("B nao eh maiore que A");
		}
		
		if (a < b) {
			System.out.println("A menor que B");
		} else {
			System.out.println("A nao eh menor que B");
		}
		
		if (a == b) {
			System.out.println("A igual a B");
		} else {
			System.out.println("A nao eh igual a B");
		}
		
		if (a != b) {
			System.out.println("A eh diferente de B");
		} else {
			System.out.println("A eh igual B");
		}
		
		boolean k = false;
		System.out.println("k: " + k);
		System.out.println("~k: " + !k);
		System.out.println("~(~k) = k: " + ((!(!k)) == k));
		
		if (a != b && b > a) {
			System.out.println("A eh diferente de B E B eh maior do que A");
		} else {
			System.out.println("A eh igual a B OU A eh maior do que B");
		}
		
		if (a == b || b > a) {
			System.out.println("A eh igual a B OU B eh maior que A");
		}
		
		if (true) {
			System.out.println("Sempre imprimira esta mensagem");
		}
		
		if (false || true) {
			System.out.println("Sempre imprimira esta mensagem tambem");
		}
		
		//-----------------------------------
		//Operador ~ (inverte os bytes)
		//-----------------------------------
		byte bin = 0;
		System.out.println("bin: " + bin);
		System.out.println("~bin: " + ~bin);

		//-----------------------------------
		//Operador Ternario
		//-----------------------------------
		System.out.println((a > b) ? "A maior que B" : "A nao eh maior que B");
		System.out.println((a > b) ? "A maior que B" : (b > a) ? "B maior que A" : "Ambos sao iguais");
	}
}
