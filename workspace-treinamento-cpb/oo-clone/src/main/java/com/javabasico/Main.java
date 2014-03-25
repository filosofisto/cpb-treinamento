package com.javabasico;

public class Main {

	public static void main(String[] args) {
		Ponto p1 = new Ponto(10, 20);
		
		Ponto p2 = p1.clone();
		System.out.println(p2);
		
		if (p1 == p2) {
			System.out.println("As referencias apontam para a mesma area da memoria");
		} else {
			System.out.println("Referencias diferentes");
		}
		
		if (p1.equals(p2)) {
			System.out.println("Semanticamente Iguais");
		} else {
			System.out.println("Semanticamente Diferentes");
		}
		
		p1.setX(5);
		System.out.println(p2.getX());
		
		//----------------------------------------------------------------------------------
		
		Cidade fpolis = new Cidade();
		fpolis.setNome("Florianopolis");
		
		Pessoa pele = new Pessoa();
		pele.setNome("Edson Arantes do Nascimento");
		pele.setIdade(70);
		pele.setCidade(fpolis);
		
		Pessoa outroPele = pele.clone();
		outroPele.getCidade().setNome("Porto Alegre");
		
		System.out.println("Cidade do Pele Original: " 
				+ pele.getCidade().getNome());
		System.out.println("Cidade do Pele Clonado: " 
				+ outroPele.getCidade().getNome());
	}
}
