package com.javabasico.modelo;

/**
 * Esta classe representa uma Pessoa no modelo
 * do projeto XPTO.
 * bla, bla, bla, ...., demais explicacoes que nunca serao lidas.
 * 
 * @author filosofisto
 * @since 25/01/2012
 *
 */
public class Pessoa {

	/**
	 * Sexo de nascimento da pessoa.
	 */
	private Sexo sexo;
	
	/**
	 * Nome do individuo.
	 */
	private String nome;
	protected int idade;
	private Posicao posicaoAtual;
	private boolean acordado;
	
	/**
	 * Construtor.
	 */
	public Pessoa() {
		super();
		
		acordado = false;
		idade = 0;
		sexo = Sexo.FEMININO;
		
		posicaoAtual = new Posicao();
		posicaoAtual.setLatitude(0);
		posicaoAtual.setLongitude(0);
	}
	
	/**
	 * Acorda o cara. Ou a moca.
	 */
	public void acordar() {
		acordado = true;
	}
	
	public void dormir() {
		acordado = false;
	}
	
	/**
	 * Altera a posicao da pessoa.
	 * 
	 * @param posicao Nova posicao
	 */
	public void andar(Posicao posicao) {
		if (acordado) {
			posicaoAtual = posicao;
		}
	}
	
	public void setIdade(int novaIdade) {
		if (novaIdade >= 0 && novaIdade <= 120) {
			idade = novaIdade;
		}
	}
	
	public int getIdade() {
		return idade;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Posicao getPosicaoAtual() {
		return posicaoAtual;
	}

	public void setPosicaoAtual(Posicao posicaoAtual) {
		this.posicaoAtual = posicaoAtual;
	}

	public boolean isAcordado() {
		return acordado;
	}

	@Override
	public String toString() {
		return getNome();
	}
}








