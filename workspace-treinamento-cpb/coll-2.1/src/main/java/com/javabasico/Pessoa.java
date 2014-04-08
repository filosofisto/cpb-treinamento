package com.javabasico;

public class Pessoa implements Comparable<Pessoa> {

	private String cpf;
	private String nome;
	private Integer idade;
	
	public Pessoa(String cpf, String nome, Integer idade) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
	}
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
	public int compareTo(Pessoa outra) {
		return getNome().compareTo(outra.getNome());
	}
}


