package com.javabasico;

import java.io.IOException;


public class Main {

	public static void main(String[] args) {
		int x = 3 / 0;
		System.out.printf("x = %d", x);
		
		/*try {
			int x = 3 / 0;
			System.out.printf("x = %d", x);
		} catch (Exception e) {
			System.out.println("Nao sei dividir por ZERO, vc sabe?"
					+ " Ocorreu este erro: " + e.getMessage());
			e.printStackTrace();
		}*/
	}
}
