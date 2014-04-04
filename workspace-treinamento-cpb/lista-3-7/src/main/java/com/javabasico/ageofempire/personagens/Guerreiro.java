package com.javabasico.ageofempire.personagens;

import com.javabasico.ageofempire.artefatos.Arma;
import com.javabasico.ageofempire.geo.Reino;

public abstract class Guerreiro 
	extends Personagem {

	public Guerreiro(Reino reino) {
		super(reino);
	}

	private Arma arma;
	
	public void atacar(Personagem personagem) {
		if (personagem.isVivo() 
				&& estaNoCampoVisao(personagem)
				&& isInimigo(personagem)) {
			arma.ataque(personagem);
		}
	}
	
	protected void setArma(Arma arma) {
		this.arma = arma;
	}
}
