package com.javabasico;

public class Pessoa {

	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) 
			throws IdadeNegativaException, IdadeMuitoGrandeException {
		if (idade < 0) {
			throw new IdadeNegativaException();
		} else if (idade > 200) {
			throw new IdadeMuitoGrandeException();
		}
		this.idade = idade;
	}
	
	
}
