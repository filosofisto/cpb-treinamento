package com.javabasico.ageofempire.artefatos;

import com.javabasico.ageofempire.personagens.Personagem;

public class ArcoFlecha extends ArmaPadrao {

	private int flechas;
	
	public ArcoFlecha() {
		setFlechas(25);
	}
	
	@Override
	public void ataque(Personagem personagem) {
		if (getFlechas() > 0) {
			super.ataque(personagem);
			setFlechas(getFlechas()-1);
		}
	}
	
	@Override
	public int potencia() {
		return 5;
	}

	@Override
	public int alcance() {
		return 100;
	}

	public int getFlechas() {
		return flechas;
	}

	public void setFlechas(int flechas) {
		this.flechas = flechas;
	}

}
