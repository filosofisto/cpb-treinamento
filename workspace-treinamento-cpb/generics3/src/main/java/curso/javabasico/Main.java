package curso.javabasico;

import curso.javabasico.tiger.ListaEncadeada;
import curso.javabasico.tiger.Pessoa;

public class Main {

	public static void main(String[] args) {
		ListaEncadeada<Pessoa> listPessoas = 
			new ListaEncadeada<Pessoa>();
		
		Pessoa p1 = new Pessoa("Fulano");
		Pessoa p2 = new Pessoa("Ciclano");
		
		listPessoas.add(p1);
		listPessoas.add(p2);
		
		System.out.println("Pessoas: " + listPessoas);
		
		ListaEncadeada<Integer> listIntegers = new ListaEncadeada<Integer>();
		
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(2);
		
		listIntegers.add(i1);
		listIntegers.add(i2);
		
		System.out.println("Integers: " + listIntegers); 
	}
}
