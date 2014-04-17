package com.javabasico;

public class Pessoa implements Cloneable, Comparable<Pessoa> {

	private String nome;
	private Integer idade;
	
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
	public boolean equals(Object obj) {
		if (obj instanceof Pessoa) {
			Pessoa outra = (Pessoa) obj;
			
			return outra.getNome().equals(getNome());
		}

		return false;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public int compareTo(Pessoa pessoa) {
		return pessoa.getNome().compareTo(getNome());
	}
}
