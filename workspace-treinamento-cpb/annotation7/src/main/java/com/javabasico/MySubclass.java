package com.javabasico;

/**
 * Exemplo demonstrando @Override
 * 
 * @author eduardo
 *
 */
public class MySubclass {

	/*@Override //a anotação causa erro de compilação
	public boolean equals(MySubclass other) {
		return false;
	}*/

	@Override 
	public boolean equals(Object obj) {
		return false;
	}
}
