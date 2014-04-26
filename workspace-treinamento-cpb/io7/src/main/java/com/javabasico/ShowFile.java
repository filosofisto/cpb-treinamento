package com.javabasico;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ShowFile {
	
	public void type(File file) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(file));
		String linha;
		int linhas = 0;
		while ((linha = in.readLine()) != null) {
			System.out.println(linha);
			linhas++;
		}
		/*Scanner scanner = new Scanner(file).useDelimiter("\n"); 
		int linhas = 0;
		
		while (scanner.hasNext()) {
			System.out.println(scanner.nextLine());
			linhas++;
		}
		
		scanner.close();*/
		
		System.out.printf("Linhas: %d\n", linhas);
	}

}
