package com.javabasico;

import static java.lang.System.out;

/**
 * Exemplo demonstrando que a linha de execucao do metodo main
 * ocorre numa thread.
 * 
 * @author eduardo
 *
 */
public class Main {

	public static void main(String[] args) {
		Thread main = Thread.currentThread();

		out.printf("id: %s, name=%s, priority=%d", 
				main.getId(),
				main.getName(),
				main.getPriority());
	}
}
