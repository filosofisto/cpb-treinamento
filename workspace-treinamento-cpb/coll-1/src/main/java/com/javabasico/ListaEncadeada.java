package com.javabasico;

public class ListaEncadeada {

	private Nodo first;
	private Nodo last; 
	
	public void add(Nodo nodo) {
		if (first == null) {
			first = nodo;
			last = nodo;
		} else {
			Nodo antigoLast = last;
			antigoLast.setProximo(nodo);
			last = nodo;
		}
		
		nodo.setProximo(null);
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void add(int index, Object elemento) {
		
	}
}

class Nodo {
	
	private String valor;
	private Nodo proximo;
	
	public Nodo(String valor) {
		this.valor = valor;
	}
	
	public String getValor() {
		return valor;
	}
	
	public Nodo getProximo() {
		return proximo;
	}
	
	public void setProximo(Nodo proximo) {
		this.proximo = proximo;
	}
}
