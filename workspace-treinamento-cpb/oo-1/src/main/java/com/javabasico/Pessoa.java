package com.javabasico;

public class Pessoa {

	private String nome;
	private String cpf;
	
	public Pessoa() {
		setNome("");
		setCpf("");
	}
	
	public Pessoa(String nome) {
		this();
		setNome(nome);
	}
	
	public Pessoa(String nome, String cpf) {
		this(nome);
		setCpf(cpf);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
