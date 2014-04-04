package com.javabasico.ageofempire.artefatos;

import com.javabasico.ageofempire.personagens.Personagem;

public abstract class ArmaPadrao implements Arma {

	@Override
	public void ataque(Personagem personagem) {
		personagem.setPrana(
				personagem.getPrana()-potencia());
	}
}
