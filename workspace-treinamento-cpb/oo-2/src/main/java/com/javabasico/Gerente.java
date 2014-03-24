package com.javabasico;

public class Gerente extends Funcionario {

	private double ajudaCusto;

	public Gerente() {
		super();
	}

	public Gerente(String nome, String cpf, int matricula, double salario,
			double ajudaCusto) {
		super(nome, cpf, matricula, salario);
		setAjudaCusto(ajudaCusto);
	}

	public Gerente(String nome, String cpf) {
		super(nome, cpf);
	}

	public Gerente(String nome) {
		super(nome);
	}

	public double getAjudaCusto() {
		return ajudaCusto;
	}

	public void setAjudaCusto(double ajudaCusto) {
		this.ajudaCusto = ajudaCusto;
	}

	@Override
	public double getSalarioTotal() {
		return super.getSalarioTotal()+getAjudaCusto();
	}
}
