package com.javabasico;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Scheduler {

	private List<Thread> fila;
	
	public Scheduler() {
		fila = new ArrayList<Thread>();
	}
	
	public void executar() {
		while (true) {
			Random rnd = new Random();
			int pos = rnd.nextInt(fila.size());
			
			fila.get(pos).run();
		}
	}
	
	public void add(Thread thread) {
		fila.add(thread);
	}
}
