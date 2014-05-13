package com.x25.logicajava;

public class Pessoa {

	private String cpf;
	private String nome;
	private Integer idade;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	@Override
	public String toString() {
		return getCpf() + " " + getNome() + " " + getIdade();
	}
	
	
}
