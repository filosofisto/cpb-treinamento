package com.javabasico;

public class ContaBancaria {

	private int numero;
	private double saldo;
	private Operacao[] extrato;
	private int count;
	
	public ContaBancaria() {
		extrato = new Operacao[10];
	}
	
	public void deposita(double valor) {
		saldo += valor;
		extrato[count++] = new Operacao(Operacao.DEPOSITO, valor, getSaldo());
	}
	
	public void retira(double valor) throws SaldoInsuficienteException {
		operacaoRetira(valor);
		extrato[count++] = new Operacao(Operacao.SAQUE, valor, getSaldo());
	}
	
	private void operacaoRetira(double valor) throws SaldoInsuficienteException {
		if (valor > saldo) {
			throw new SaldoInsuficienteException(saldo, valor);
		}
		
		saldo -= valor; 
	}
	
	public void transfere(double valor, ContaBancaria contaDestino) 
			throws SaldoInsuficienteException {
		operacaoRetira(valor);
		contaDestino.deposita(valor);
		extrato[count++] = new Operacao(Operacao.TRANSFERENCIA, valor, getSaldo());
	}
	
	public double saldoAtual() {
		return getSaldo();
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Operacao[] extrato() {
		Operacao[] ret = new Operacao[count];
		for (int i = 0; i < count; i++) {
			ret[i] = extrato[i];
		}
		return ret;
	}
	
}
