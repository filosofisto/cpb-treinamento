package com.javabasico;

import java.util.HashSet;
import java.util.Set;
import static java.lang.System.out;

public class Main {
	
	public static void main(String[] args) {
		Set<Veiculo> set = new HashSet<Veiculo>();
		
		populate(set);
		show(set);
	}
	
	private static void populate(Set<Veiculo> set) {
		int renavam;
		for (int i = 1; i <= 50; i++) {
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
