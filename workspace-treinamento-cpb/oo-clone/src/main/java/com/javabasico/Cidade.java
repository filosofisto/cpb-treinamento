package com.javabasico;

public class Cidade implements Cloneable {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	protected Cidade clone() {
		try {
			return (Cidade) super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
	
}
