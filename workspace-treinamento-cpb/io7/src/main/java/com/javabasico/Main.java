package com.javabasico;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try {
			Teclado t = new Teclado();
			ShowFile showFile = new ShowFile();
			
			for (;;) {
				String fileName = t.lerComando();
				
				if ("exit".equals(fileName)) {
					break;
				} else {
					File file = new File(fileName);
					showFile.type(file);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
