package com.javabasico;

public class Atleta implements Comparable<Atleta> {

	private String cpf;
	private String nome;
	private String modalidade;
	private int medalhas;
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
	public String getModalidade() {
		return modalidade;
	}
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	public int getMedalhas() {
		return medalhas;
	}
	public void setMedalhas(int medalhas) {
		this.medalhas = medalhas;
	}
	
	@Override
	public int hashCode() {
		return getCpf().hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Atleta) {
			Atleta outro = (Atleta) obj;
			
			return getCpf().equals(outro.getCpf());
		}
		
		return false;
	}

	@Override
	public int compareTo(Atleta outro) {
		return getNome().compareTo(outro.getNome());
	}
}
