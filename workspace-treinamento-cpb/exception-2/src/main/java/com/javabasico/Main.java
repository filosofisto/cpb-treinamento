package com.javabasico;


public class Main {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("Maradona");
		
		try {
			p.setIdade(-1);
		} catch (Exception e) {
			System.out.println("Sr usuario lamendo mas a idade nao eh valida");
			//e.printStackTrace();
		}
	}
}
