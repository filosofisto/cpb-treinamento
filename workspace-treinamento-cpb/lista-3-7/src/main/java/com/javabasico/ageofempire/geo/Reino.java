package com.javabasico.ageofempire.geo;

public class Reino {

	private String nome;

	public Reino(String nome) {
		setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Reino) {
			Reino outro = (Reino) obj;
			
			return getNome().equals(outro.getNome());
		}
		
		return false;
	}
}
