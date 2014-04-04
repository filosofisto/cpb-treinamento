package com.javabasico.ageofempire.personagens;

import com.javabasico.ageofempire.artefatos.ArcoFlecha;
import com.javabasico.ageofempire.geo.Reino;

public class Arqueiro extends Guerreiro {

	public Arqueiro(Reino reino) {
		super(reino);
		
		setArma(new ArcoFlecha());
		setPrana(100);
		setCampoVisao(500);
		setVelocidade(10);
	}
}
