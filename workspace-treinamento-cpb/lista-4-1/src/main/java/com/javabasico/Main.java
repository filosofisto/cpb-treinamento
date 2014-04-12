package com.javabasico;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Set<Atleta> set = new TreeSet<Atleta>(new ComparatorMedalha());
		
		Atleta a1 = new Atleta();
		a1.setCpf("1");
		a1.setNome("Pele");
		a1.setMedalhas(5);
		
		Atleta a2 = new Atleta();
		a2.setCpf("3");
		a2.setNome("Pele");
		a2.setMedalhas(7);
		
		Atleta a3 = new Atleta();
		a3.setCpf("2");
		a3.setNome("Adriano");
		a3.setMedalhas(10);
		
		set.add(a1);
		set.add(a2);
		set.add(a3);
		
		System.out.printf("Elementos: %d\n", set.size());
		
		for (Atleta a: set) {
			System.out.println(a.getNome() + " - " + a.getMedalhas());
		}
	}

}
