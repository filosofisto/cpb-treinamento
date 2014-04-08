package com.javabasico;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(new Pessoa("123456789", "Priscila", 20));
		//pessoas.add(new Pessoa("123456780", "PRISCILA", 20));
		pessoas.add(new Pessoa("223456789", "Eduardo", 20));
		//pessoas.add(new Pessoa("023456789", "Hayder", 23));
		pessoas.add(new Pessoa("113456789", "Marcos", 30));
		
		//Collections.sort(pessoas, new ComparatorIdadeNome());
		
		Sorter<Pessoa> sorter = new Sorter<Pessoa>();
		//sorter.sort(pessoas, new ComparatorCPF());
		sorter.sort(pessoas);
		
		for (Pessoa p: pessoas) {
			System.out.printf("%s - %s - %d\n", 
					p.getNome(), p.getCpf(), p.getIdade());
		}
	}
}
