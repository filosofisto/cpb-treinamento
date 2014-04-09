package com.javabasico;

public class ListaEncadeada implements Iterator {

	private Nodo first;
	private Nodo last; 
	private Nodo actual;
	private int size;
	
	public void add(Nodo nodo) {
		if (first == null) {
			first = nodo;
			last = nodo;
			actual = first;
		} else {
			Nodo antigoLast = last;
			antigoLast.setProximo(nodo);
			last = nodo;
		}
		
		nodo.setProximo(null);
		
		size++;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public boolean hasNext() {
		return actual != null;
	}
	
	public Object next() {
		Nodo ret = actual;
		
		if (actual != null) {
			actual = actual.getProximo();
		}
		
		return ret;
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
	
	@Override
	public String toString() {
		return valor;
	}
}
