package com.javabasico;

import com.javabasico.ageofempire.geo.Reino;
import com.javabasico.ageofempire.personagens.Arqueiro;
import com.javabasico.ageofempire.personagens.Cavaleiro;
import com.javabasico.ageofempire.personagens.Guerreiro;
import com.javabasico.ageofempire.personagens.Soldado;

public class Main {

	public static void main(String[] args) {
		Reino persas = new Reino("Persas");
		Reino turcos = new Reino("Turcos");
		
		Guerreiro arcPersa = new Arqueiro(persas);
		Guerreiro solTurco = new Soldado(persas);
		Guerreiro cav = new Cavaleiro(turcos);
		
		arcPersa.atacar(cav);
	}
}
