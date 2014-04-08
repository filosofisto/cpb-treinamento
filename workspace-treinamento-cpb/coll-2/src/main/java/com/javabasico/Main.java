package com.javabasico;

import java.util.HashSet;
import java.util.Set;

import static java.lang.System.out;

public class Main {
	
	public static void main(String[] args) {
		long t1 = System.currentTimeMillis();
		
		Set<Veiculo> set = new HashSet<Veiculo>();
		
		populate(set);
		show(set);
		
		long t2 = System.currentTimeMillis();
		System.out.printf("Tempo de processamento: %dms", (t2-t1));
	}
	
	private static void populate(Set<Veiculo> set) {
		int renavam;
		for (int i = 1; i <= 5000; i++) {
			if (i % 2 == 0) {
				renavam = i-1;
			} else {
				renavam = i;
			}
			
			Veiculo v = new Veiculo(renavam);
			boolean adicionou = set.add(v);
			out.printf("Adicionou veiculo %d, %b\n", 
					renavam, adicionou);
		}
		
		set.add(null);
		set.add(null);
		set.add(null);
	}

	private static void show(Set<Veiculo> set) {
		for (Veiculo v: set) {
			if (v != null) { 
				out.printf("veiculo: %s\n", v.getRenavam());
			} else {
				out.println("veiculo: null");
			}
		}
	}
}
