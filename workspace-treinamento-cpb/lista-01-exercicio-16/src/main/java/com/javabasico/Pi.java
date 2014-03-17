package com.javabasico;

public class Pi {

	public static void main(String[] args) {
		double pi = 1, piAnterior = 0;
		float denominador = 1;
		int sinal = -1;
		int count = 0;
		
		while (Math.abs(pi-piAnterior) > 0.0000001) {
			piAnterior = pi;
			denominador += 2;
			pi = pi + sinal * 1/denominador;
			sinal = -sinal;
			
			count++;
		}
		
		System.out.printf("PI: %f, Iteracoes: %d", 
				pi*4, count);
	}
}
