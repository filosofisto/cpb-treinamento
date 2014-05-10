package com.javabasico;

import java.io.Serializable;

public class Movimentacao implements Serializable {

	private static final long serialVersionUID = -6789521245672466828L;
	
	private String cpf;
	private String banco;
	private String agencia;
	private Float saldo;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public Float getSaldo() {
		return saldo;
	}
	public void setSaldo(Float saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Movimentacao [cpf=" + cpf + ", banco=" + banco + ", agencia="
				+ agencia + ", saldo=" + saldo + "]";
	}
}
