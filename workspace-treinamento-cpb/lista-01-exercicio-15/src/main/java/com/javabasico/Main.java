package com.javabasico;

public class Main {

	public static void main(String[] args) {

		double total = 1;
		double totalAnterior = 2;
		double denominador = 2; 
		int count = 0;
				
		while (Math.abs(total-totalAnterior) > 0.0000000000000001) {
		//for (int i = 1; i < 100; i++) {
			totalAnterior = total;
			
			total += 1/denominador;
			denominador *= 2;
			count++;
		}
		
		System.out.printf("Resultado: %.30f\nIteracoes: %d", total, count);
	}
}
