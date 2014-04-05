package com.javabasico;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		/*MyList extrato = new MyList();
		
		extrato.add("Eduardo");
		extrato.add("Cicrano");
		
		System.out.println(extrato.indexOf("Cicrano"));
		
		extrato.clear();
		
		if (extrato.isEmpty()) {
			System.out.println("Vazio");
		}*/
		
		Collection<Integer> coll = new ArrayList<Integer>();
		
		for (int i = 1; i < 1000; i++) {
			coll.add(i);
		}
		
		//Soma dos numeros pares
		int total = 0;
		for (Integer i: coll) {
			if (i % 2 == 0) {
				total += i;
			}
		}
		
		coll.remove(10);
		List<Integer> list = (List<Integer>) coll;
		System.out.printf("Posicao do 10: %d\n", 
				list.indexOf(10));
		list.remove(0);
		System.out.printf("Primeiro elemento: %d\n", 
				list.get(0));
		
		out.printf("Soma dos numeros pares = %d\n", total);
		out.printf("Quantidade de elementos: %d", coll.size());
	}
}
