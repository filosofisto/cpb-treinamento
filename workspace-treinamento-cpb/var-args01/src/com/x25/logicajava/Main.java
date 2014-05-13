package com.x25.logicajava;

public class Main {

	public static void main(String[] args) {
		System.out.printf(
				"A média é %f, e a outra é %f", 
				media(10f, 4f),
				media(1, 5, 6, 7, 9, 15));
		System.out.printf("E já");
	}
	
	static float media(float... valores) {
		float soma = 0f;
		
		for (int i = 0; i < valores.length; i++) {
			soma += valores[i];
		}
		
		return soma/valores.length;
	}
}
