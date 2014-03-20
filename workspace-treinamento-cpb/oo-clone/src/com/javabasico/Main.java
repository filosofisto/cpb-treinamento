package com.javabasico;

public class Main {

	public static void main(String[] args) {
		Ponto p1 = new Ponto(10, 20);
		
		Ponto p2 = (Ponto) p1.clone();
		System.out.println(p2);
		
		if (p1 == p2) {
			System.out.println("Mesmo objeto");
		} else {
			System.out.println("Objetos diferentes");
		}
		
		if (p1.equals(p2)) {
			System.out.println("Iguais");
		} else {
			System.out.println("Diferentes");
		}
		
		Retangulo r = new Retangulo(10, 5);
		r.setPonto(new Ponto(5, 2));
		
		Retangulo rClone = (Retangulo) r.clone();
		rClone.getPonto().setX(50);
		
		System.out.println("X do retangulo clonado: " 
				+ rClone.getPonto().getX());
		System.out.println("X do retangulo original: " 
				+ r.getPonto().getX());
	}

}
