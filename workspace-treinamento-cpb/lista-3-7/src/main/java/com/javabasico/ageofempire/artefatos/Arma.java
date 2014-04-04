package com.javabasico.ageofempire.artefatos;

import com.javabasico.ageofempire.personagens.Personagem;

public interface Arma {

	int potencia();
	int alcance();
	void ataque(Personagem personagem);
}
