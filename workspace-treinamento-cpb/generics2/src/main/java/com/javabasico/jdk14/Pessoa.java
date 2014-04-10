package com.javabasico.jdk14;

public class Pessoa {

	private String nome;
	
	public Pessoa(String nome) {
		setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return nome;
	}
}
