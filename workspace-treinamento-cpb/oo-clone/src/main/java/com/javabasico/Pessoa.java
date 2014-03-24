package com.javabasico;

public class Pessoa implements Cloneable {

	private String nome;
	private int idade;
	private Cidade cidade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	@Override
	protected Pessoa clone() {
		try {
			return (Pessoa) super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
	/*//Solucao
	@Override
	protected Pessoa clone() {
		try {
			Cidade cidadeClone = getCidade().clone();
			Pessoa clone = (Pessoa) super.clone();
			clone.setCidade(cidadeClone);
			
			return clone;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}*/
}
