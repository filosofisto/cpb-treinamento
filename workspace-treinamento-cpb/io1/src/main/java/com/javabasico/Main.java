package com.javabasico;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		String dirName = "c:\\curso-java";
		File dir = new File(dirName);
		
		for (File f: dir.listFiles()) {
			if (f.isDirectory()) {
				System.out.println(f.getAbsolutePath()+"\\");
			} else {
				System.out.printf("%s - %d bytes\n",
						f.getAbsolutePath(),
						f.length());
			}
		}
	}

}
