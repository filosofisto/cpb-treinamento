package com.javabasico;

import java.io.File;
import java.io.IOException;



public class Main {

	public static void main(String[] args) {
		try {
			DirComand cmd = new DirComand();
			Teclado t = new Teclado();
			
			for (;;) {
				String comando = t.lerComando();
				
				if ("exit".equals(comando)) {
					break;
				} else {
					File file = new File(comando);
					StringBuilder b = new StringBuilder();
					cmd.dir(b, file);
					System.out.println(b);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
