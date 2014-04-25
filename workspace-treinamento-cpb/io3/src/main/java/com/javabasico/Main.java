package com.javabasico;

import java.io.File;
import static java.lang.System.out;

public class Main {

	public static void main(String[] args) {
		String dirName = 
				"/home/filosofisto/CPB/cpb-treinamento";
		File root = new File(dirName);
		
		list(root);
	}
	
	static void list(File dir) {
		out.println(dir.getAbsolutePath());
		
		for (File f: dir.listFiles()) {
			if (f.isDirectory()) {
				list(f);
			}
		}
		
		for (File f: dir.listFiles()) {
			if (f.isFile()) {
				out.println(f.getAbsolutePath());
			}
		}
		
	}

}
