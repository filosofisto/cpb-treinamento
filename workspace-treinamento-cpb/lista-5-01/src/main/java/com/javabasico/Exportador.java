package com.javabasico;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exportador {

	public void toFormatoB(File file, File destino) 
			throws FileNotFoundException {
		PrintWriter out = new PrintWriter(destino);
		
		Scanner s = new Scanner(file).useDelimiter("\n");
		String line;
		
		while (s.hasNext()) {
			line = s.nextLine();
			
			out.println(
					/*CPF*/
					line.substring(11,22) + ";" +
					/*Banco*/
					line.substring(0,5) + ";" +
					/*Agencia*/
					line.substring(5,11) + ";" +
					/*Saldo*/
					line.substring(21,39)
			);
		}
		
		out.close();
	}
}
