package com.javabasico;


public class Main {

	public static void main(String[] args) {
		Pessoa eu = new Pessoa();
		eu.setNome("Pele");
		eu.setCpf("81646674987");
		
		System.out.println(eu.getNome());
		
		Pessoa xuxa = new Pessoa("Xuxa");
		System.out.println(xuxa.getNome());
		
		Pessoa jung = new Pessoa(
				"Carl Gustav Jung",
				"8181818181");
		System.out.println(
				jung.getNome() + " - " + jung.getCpf());
		
		Pessoa who = new Pessoa();
		System.out.println(who.getNome());
		
		Funcionario f = new Funcionario("Eduardo", "81646674987");
	}
}
