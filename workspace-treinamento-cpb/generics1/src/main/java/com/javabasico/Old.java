package com.javabasico;

import java.util.ArrayList;
import java.util.List;

/**
 * Container types.
 * 
 * @author eduardo
 *
 */
public class Old {

	void exemplo() {
		List list = new ArrayList();
		
		list.add("Primeiro");
		list.add("Segundo");
		list.add(new Object());
		list.add(1);
		
		List numeros = new ArrayList();
		numeros.add(10);
		numeros.add(20);
		numeros.add(30);
		
		for (int i = 0; i < numeros.size(); i++) {
			Integer valor = (Integer) numeros.get(i);
		}
	}
}
