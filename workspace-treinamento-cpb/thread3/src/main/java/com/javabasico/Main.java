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
		
		//Constrói as runnables e threads
		for (int i = 0; i < runnables.length; i++) {
			runnables[i] = new MyRunnable();
			threads[i] = new Thread(runnables[i]);
		}
		
		//Starta as threads
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}
	}
}
