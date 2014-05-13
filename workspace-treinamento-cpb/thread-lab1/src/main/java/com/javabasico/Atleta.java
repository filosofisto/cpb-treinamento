package com.javabasico;

import java.util.Random;

public class Atleta extends Thread {

	private int raia;
	private int distancia;
	
	public Atleta(int raia) {
		this.raia = raia;
	}
	
	@Override
	public void run() {
		Random rnd = new Random();
		
		while (distancia < 100) {
			distancia += rnd.nextInt(10)+1;
			
			Thread.yield();
		}
		
		System.out.println("Chegou atleta raia " + raia);
	}
}
