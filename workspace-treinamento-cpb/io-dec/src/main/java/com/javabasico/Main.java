package com.javabasico;

public class Main {

	public static void main(String[] args) {
		Cafe c = new Cafe();
		System.out.printf("Cafe: %f\n", c.preco());
		
		Produto cafeComLeite = new Cafe(new Leite());
		System.out.printf("Cafe com leite: %f\n", cafeComLeite.preco());
		
		Produto cafeLeiteChantity = new Cafe(new Leite(new Chantily()));
		System.out.printf("Cafe com leite e chantily: %f\n", cafeLeiteChantity.preco());
		
		Produto cafeChantily = new Chantily(new Cafe());
		System.out.printf("Cafe com chantily: %f\n", cafeChantily.preco());
	}

}
