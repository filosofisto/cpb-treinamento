package com.javabasico.modelo;

public class Gerente extends Funcionario {

	private double percentual;
	
	public Gerente(int matricula, double salario, double percentual) {
		super(matricula, salario);
		
		setPercentual(percentual);
	}
	
	public double salarioTotal() {
		return getSalario()*(1+getPercentual()/100)+getPlanoSaude();
	}
	
	public double getPercentual() {
		return percentual;
	}
	public void setPercentual(double percentual) {
		this.percentual = percentual;
	}
}
