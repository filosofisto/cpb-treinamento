package com.javabasico.ageofempire.util;

import java.util.Random;

public class Sorteador {

	private static Sorteador instance = new Sorteador();
	
	private Random random;
	
	private Sorteador() {
		random = new Random();
	}
	
	public static Sorteador getInstance() {
		return instance;
	}
	
	public int sorteia(int max) {
		return random.nextInt(max);
	}
	
}
