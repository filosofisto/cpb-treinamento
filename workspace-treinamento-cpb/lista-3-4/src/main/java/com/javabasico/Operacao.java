package com.javabasico;

public class Operacao {

	public static final String SAQUE = "Saque";
	public static final String DEPOSITO = "Deposito";
	public static final String TRANSFERENCIA = "Transferencia";
	
	private String nome;
	private double valor;
	private double saldo;
	
	public Operacao(String nome, double valor, double saldo) {
		setNome(nome);
		setValor(valor);
		setSaldo(saldo);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return getNome() + " - " + getValor() + " - " + getSaldo();
	}
}
