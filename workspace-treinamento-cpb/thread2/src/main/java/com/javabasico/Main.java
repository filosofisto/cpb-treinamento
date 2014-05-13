package com.javabasico;


/**
 * Exemplo demonstrando utilizacao de threads paralelas.
 * 
 * @author eduardo
 *
 */
public class Main {

	public static void main(String[] args) {
		MyThread[] threads = new MyThread[10];
		//Constroi as threads
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new MyThread(i);
		}
		
		//Inicia as threads
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}
		
		System.out.println("Assincronicidade");
	}
}
