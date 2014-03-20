package com.javabasico.modelo;

public class Diretor extends Gerente {

	private double auxilioMoradia;
	
	public Diretor(
			int matricula,
			double salario,
			double percentual,
			double auxilioMoradia) {
		super(matricula, salario, percentual);
		
		setAuxilioMoradia(auxilioMoradia);
	}
	
	@Override
	public double salarioTotal() {
		return super.salarioTotal()+getAuxilioMoradia();
	}

	public double getAuxilioMoradia() {
		return auxilioMoradia;
	}
	public void setAuxilioMoradia(double auxilioMoradia) {
		this.auxilioMoradia = auxilioMoradia;
	}
}
