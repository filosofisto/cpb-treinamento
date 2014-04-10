package com.javabasico.jdk14;

public class ListaEncadeadaPessoa {

	private WrapperPessoa first;
	private WrapperPessoa last;
	
	public void add(Pessoa object) {
		WrapperPessoa newLast = new WrapperPessoa(object);
		
		if (first == null) {
			first = newLast;
			last = newLast;
		} else {
			last.setNext(newLast);
			last = newLast;
		}
	}
	
	public String toString() {
		StringBuffer buf = new StringBuffer();
		
		WrapperPessoa actual = first;
		while (actual != null) {
			buf.append(actual.toString() + ", ");
			actual = actual.getNext();
		}
		
		return buf.toString();
	}
}

class WrapperPessoa {
	
	private WrapperPessoa next;
	private Pessoa data;
	
	public WrapperPessoa(Pessoa data) {
		this.data = data;
	}
	
	public Pessoa getData() {
		return data;
	}

	public WrapperPessoa getNext() {
		return next;
	}

	public void setNext(WrapperPessoa next) {
		this.next = next;
	}
	
	public String toString() {
		if (getData() != null) {
			return getData().toString();
		} else {
			return "null";
		}
	}
}
