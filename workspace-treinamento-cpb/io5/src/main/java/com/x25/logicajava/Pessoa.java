package com.x25.logicajava;

import java.io.Serializable;

public class Pessoa implements Serializable {

	private static final long serialVersionUID = -4359724068950145968L;
	
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
