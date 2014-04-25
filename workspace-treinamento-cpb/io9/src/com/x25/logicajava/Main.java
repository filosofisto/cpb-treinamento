package com.x25.logicajava;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		File dir = new File("c:/curso-java");

		for (File f: dir.listFiles(new SoJava())) {
			System.out.println(f);
		}

	}
}
