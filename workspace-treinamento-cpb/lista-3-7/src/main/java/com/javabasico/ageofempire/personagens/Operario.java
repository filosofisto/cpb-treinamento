package com.javabasico.ageofempire.personagens;

import com.javabasico.ageofempire.geo.Reino;

public class Operario extends Personagem {

	public Operario(Reino reino) {
		super(reino);
	}

	private boolean trabalhando;

	public boolean isTrabalhando() {
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
}
