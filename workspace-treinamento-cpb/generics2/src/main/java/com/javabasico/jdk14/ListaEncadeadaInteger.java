package com.javabasico.jdk14;

public class ListaEncadeadaInteger {

	private WrapperInteger first;
	private WrapperInteger last;
	
	public void add(Integer object) {
		WrapperInteger newLast = new WrapperInteger(object);
		
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
		
		WrapperInteger actual = first;
		while (actual != null) {
			buf.append(actual.toString() + ", ");
			actual = actual.getNext();
		}
		
		return buf.toString();
	}
}

class WrapperInteger {
	
	private WrapperInteger next;
	private Integer data;
	
	public WrapperInteger(Integer data) {
		this.data = data;
	}
	
	public Integer getData() {
		return data;
	}

	public WrapperInteger getNext() {
		return next;
	}

	public void setNext(WrapperInteger next) {
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
