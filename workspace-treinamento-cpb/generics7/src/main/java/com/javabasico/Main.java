package com.javabasico;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Collection<Integer> cInt = new ArrayList<Integer>();
		cInt.add(8);
		cInt.add(9);
		cInt.add(10);
		
		System.out.println("cInt media=" + media(cInt));
		
		Collection<Float> cFloat = new ArrayList<Float>();
		cFloat.add(8f);
		cFloat.add(9f);
		cFloat.add(10f);
		
		System.out.println("cFloat media=" + media(cFloat));
	}
	
	static <T extends Number> Number media(Collection<T> dados) {
		Double total = new Double(0);
		
		for (T t: dados) {
			total += t.doubleValue();
		}
		
		return total / dados.size();
	}

}
