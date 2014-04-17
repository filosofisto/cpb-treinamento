package com.javabasico;

public class Main {

	public static void main(String[] args) {
		Pessoa pele = new Pessoa();
		pele.setNome("Edson Arantes do Nascimento");
		pele.setSexo(Sexo.MASCULINO);
		
		Pessoa xuxa = new Pessoa();
		xuxa.setNome("Xuxa");
		xuxa.setSexo(Sexo.FEMININO);
	}
}
