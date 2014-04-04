package com.javabasico.ageofempire.personagens;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

import com.javabasico.ageofempire.geo.Mapa;
import com.javabasico.ageofempire.geo.Posicao;
import com.javabasico.ageofempire.geo.Reino;
import com.javabasico.ageofempire.util.Sorteador;

public abstract class Personagem {

	private int velocidade;
	private int prana;
	private Posicao posicao;
	private float campoVisao;
	private Reino reino;
	
	public Personagem(Reino reino) {
		setPosicao(new Posicao(
				Sorteador.getInstance().sorteia(Mapa.MAX_X), 
				Sorteador.getInstance().sorteia(Mapa.MAX_Y)
			)
		);
		setReino(reino);
	}
	
	public boolean isVivo() {
		return prana > 0;
	}
	
	public boolean isMorto() {
		return !isVivo();
	}
	
	public Posicao getPosicao() {
		return posicao;
	}
	
	public void mover(Posicao posicao) {
		setPosicao(posicao);
	}
	
	protected void setPosicao(Posicao posicao) {
		this.posicao = posicao;
	}
	
	public int getPrana() {
		return prana;
	}
	
	public void setPrana(int prana) {
		this.prana = prana;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public float getCampoVisao() {
		return campoVisao;
	}

	public void setCampoVisao(float campoVisao) {
		this.campoVisao = campoVisao;
	}
	
	public boolean estaNoCampoVisao(Personagem outro) {
		float dist = calcDistancia(outro);
		
		return dist <= campoVisao;
	}

	private float calcDistancia(Personagem outro) {
		float catetoX = (float) pow(
			abs( 
				getPosicao().getX()-outro.getPosicao().getX()
			), 2);
		float catetoY = (float) pow(
				abs( 
					getPosicao().getY()-outro.getPosicao().getY()
				), 2);
		
		return (float) sqrt(catetoX+catetoY);
	}

	public Reino getReino() {
		return reino;
	}

	public void setReino(Reino reino) {
		this.reino = reino;
	}
	
	public boolean isInimigo(Personagem outro) {
		return !getReino().equals(outro.getReino());
	}
}
