package com.javabasico.ageofempire.personagens;

import com.javabasico.ageofempire.artefatos.Espada;
import com.javabasico.ageofempire.geo.Reino;

public class Soldado extends Guerreiro {

	public Soldado(Reino reino) {
		super(reino);
		
		setArma(new Espada());
		setPrana(120);
		setCampoVisao(40);
		setVelocidade(5);
	}
}
