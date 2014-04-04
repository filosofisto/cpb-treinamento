package com.javabasico;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
	
	public static void main(String[] args) {
		Collection coll = new ArrayList();
		
		for (int i = 1; i < 1000; i++) {
			coll.add(i);
		}
		
		//Soma dos numeros pares
		/*int total = 0;
		for (Integer i: coll) {
			if (i % 2 == 0) {
				total += i;
			}
		}
		
		out.printf("Soma dos numeros pares = %d",
				total);*/
	}
}
