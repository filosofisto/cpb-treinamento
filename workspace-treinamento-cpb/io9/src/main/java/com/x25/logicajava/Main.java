package com.x25.logicajava;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		File dir = new File("/home/filosofisto/CPB/cpb-treinamento/workspace-treinamento-cpb/io9/target");

		for (File f: dir.listFiles(new NaoVazios())) {
			System.out.println(f);
		}

	}
}
