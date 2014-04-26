package com.javabasico;

import java.io.Serializable;

public class Pessoa implements Serializable {

	private static final long serialVersionUID = -6556432044645627956L;
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return getNome();
	}
}
