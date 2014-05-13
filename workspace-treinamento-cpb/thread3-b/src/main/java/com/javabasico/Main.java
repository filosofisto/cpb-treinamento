package com.javabasico;


/**
 * Exemplo utilizando threads em paralelas, mas utilizando
 * a interface Runnable.
 * 
 * @author eduardo
 *
 */
public class Main {

	public static void main(String[] args) {
		MyRunnable[] runnables = new MyRunnable[10];
		Thread[] threads = new Thread[10];
		Scheduler s = new Scheduler();
		
		//Constroi as runnables e threads
		for (int i = 0; i < runnables.length; i++) {
			threads[i] = new Thread(new MyRunnable());
			s.add(threads[i]);
		}
		
		s.executar();
	}
}
