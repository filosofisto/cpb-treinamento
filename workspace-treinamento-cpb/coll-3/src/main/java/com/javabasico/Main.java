package com.javabasico;

import static java.lang.System.out;

import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
		Set<Veiculo> set = new TreeSet();
		
		populate(set);
		show(set);
	}
	
	private static void populate(Set<Veiculo> set) {
		int renavam;
		for (int i = 50; i >= 1; i--) {
			if (i % 2 == 0) {
				renavam = i-1;
			} else {
				renavam = i;
			}
			
			Veiculo v = new Veiculo(renavam);
			boolean adicionou = set.add(v);
			out.printf("Adicionou veiculo %d, %b\n", renavam, adicionou);
		}
	}

	private static void show(Set<Veiculo> set) {
		for (Veiculo v: set) {
			if (v != null) { 
				out.printf("veiculo: %s\n", v.getRenavam());
			} else {
				out.println("veiculo null");
			}
		}
	}
}
