package com.javabasico;

import com.javabasico.jdk14.ListaEncadeadaInteger;
import com.javabasico.jdk14.ListaEncadeadaPessoa;
import com.javabasico.jdk14.Pessoa;

/**
 * Demonstra o problema dos templates.
 * 
 * @author eduardo
 *
 */
public class Main {

	public static void main(String[] args) {
		ListaEncadeadaPessoa listPessoas = new ListaEncadeadaPessoa();
		
		Pessoa p1 = new Pessoa("Fulano");
		Pessoa p2 = new Pessoa("Ciclano");
		
		listPessoas.add(p1);
		listPessoas.add(p2);
		
		System.out.println("Pessoas: " + listPessoas);
		
		ListaEncadeadaInteger listIntegers = new ListaEncadeadaInteger();
		
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(2);
		
		listIntegers.add(i1);
		listIntegers.add(i2);
		
		System.out.println("Integers: " + listIntegers); 
	}
}
