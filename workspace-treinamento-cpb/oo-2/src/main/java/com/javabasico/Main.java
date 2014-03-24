package com.javabasico;


public class Main {

	public static void main(String[] args) {
		Pessoa pele = new Pessoa();
		pele.setNome("Edson");
		pele.setCpf("800000000");
		
		Funcionario f = new Funcionario();
		f.setCpf("800000000");
		
		if (f.equals(pele)) {
			System.out.println("The same");
		} else {
			System.out.println("Diferente");
		}
		/*Pessoa pele = new Pessoa();
		pele.setNome("Pele");
		pele.setCpf("81646674987");
		System.out.println(pele.toString());
		
		System.out.println(pele.getNome());
		
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
		System.out.println(f.getNome());
		f.setSalario(15000);
		
		Gerente gg = new Gerente();
		gg.setCpf("00001313123");
		if (pele.equals(gg)) {
			System.out.println("Ops!!!");
		} else {
			System.out.println("Thank God");
		}
		
		System.out.printf("Salario: %.2f\n", f.getSalario());
		System.out.printf("Beneficio: %.2f\n", f.calcBeneficio());
		System.out.printf("Salario Total: %.2f\n", f.getSalarioTotal());
		
		Funcionario g = new Gerente();
		g.setSalario(1000);
		((Gerente) g).setAjudaCusto(10.0);
		System.out.printf("Valor Total Gerente: %.2f\n", g.getSalarioTotal());*/
	}
}
