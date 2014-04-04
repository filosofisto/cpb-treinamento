package com.javabasico.ageofempire.personagens;

import com.javabasico.ageofempire.artefatos.Lanca;
import com.javabasico.ageofempire.geo.Reino;

public class Cavaleiro extends Guerreiro {

	public Cavaleiro(Reino reino) {
		super(reino);
		
		setArma(new Lanca());
		setPrana(200);
		setCampoVisao(70);
		setVelocidade(300);
	}
}
