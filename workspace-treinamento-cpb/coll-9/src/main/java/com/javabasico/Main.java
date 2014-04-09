package com.javabasico;


public class Main {
	
	public static void main(String[] args) {
		MyList extrato = new MyList();
		//ListaEncadeada extrato = new ListaEncadeada();
		
		extrato.add(/*new Nodo(*/"Eduardo");
		extrato.add(/*new Nodo(*/"Cicrano");
		extrato.add(/*new Nodo(*/"Priscila");
		extrato.add(/*new Nodo(*/"Claudinho");
		extrato.add(/*new Nodo(*/"Marco");
		
		while (extrato.hasNext()) {
			System.out.println(extrato.next());
		}
		
		/*for (int i = 0; i < extrato.size(); i++) {
			System.out.println(extrato.get(i));
		}*/

		/*Nodo actual = extrato.getNext();
		
		while (actual != null) {
			System.out.println(actual.getValor());
			actual = extrato.getNext();
		}*/
	}
}
