package com.javabasico;

import java.io.Serializable;
import java.util.Date;

public class Movimentacao
	extends Parent
	implements Serializable {

	private static final long serialVersionUID = -6789521245672466828L;
	
	@ToString(formatador=CPFFormatador.class)
	@Substring(inicio=11, fim=22)
	private String cpf;
	
	@Substring(inicio=0, fim=5)
	private String banco;
	
	@Substring(inicio=5, fim=11)
	private String agencia;
	
	@Substring(inicio=22, fim=40)
	private Float saldo;
	
	@ToString(formatador=DateFormatador.class)
	private Date data;
	
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
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
}
