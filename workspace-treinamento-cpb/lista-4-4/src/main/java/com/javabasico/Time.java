package com.javabasico;

public class Time {

	private String nome;
	
	public Time(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Time) {
			Time outro = (Time) obj;
			
			return getNome().equals(outro.getNome());
		}
		
		return false;
	}
}
