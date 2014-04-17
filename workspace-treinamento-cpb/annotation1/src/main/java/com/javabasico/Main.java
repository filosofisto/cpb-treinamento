package com.javabasico;

import static java.lang.System.out;

public class Main {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.setId(1L);
		
		Pessoa p2 = new Pessoa();
		p2.setId(1L);
		
		if (p1.equals(p2)) {
			out.println("p1 igual a p2");
		} else {
			out.println("p1 diferente de p2");
		}
		
		Pessoa p3 = new Pessoa();
		p3.setId(2L);
		
		if (p1.equals(p3)) {
			out.println("p1 igual a p3");
		} else {
			out.println("p1 diferente de p3");
		}
		
		Veiculo v1 = new Veiculo();
		v1.setPlaca("AAA1020");
		Veiculo v2 = new Veiculo();
		v2.setPlaca("AAA1020");
		
		if (v1.equals(v2)) {
			System.out.println("Veiculos IGUAIS");
		} else {
			System.out.println("Veiculos Diferentes");
		}
	}
}
