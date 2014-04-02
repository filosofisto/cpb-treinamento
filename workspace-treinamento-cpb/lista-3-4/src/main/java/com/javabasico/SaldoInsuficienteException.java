package com.javabasico;

@SuppressWarnings("serial")
public class SaldoInsuficienteException extends Exception {

	private double saldoAtual;
	private double valor;
	
	public SaldoInsuficienteException(double saldoAtual, double valor) {
		this.saldoAtual = saldoAtual;
		this.valor = valor;
	}

	@Override
	public String getMessage() {
		return "Saldo insuficiente - " 
				+ "saldo atual: " + saldoAtual
				+ " valor da operacao: " + valor;
	}
}
