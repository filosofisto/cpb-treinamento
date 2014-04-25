package com.javabasico;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Wildcards
 * 
 * @author eduardo
 *
 */
public class Main {

	public static void main(String[] args) {
		Collection<String> col = 
				new ArrayList<String>();
		col.add("Primeiro");
		col.add("Segundo");
	
		//Compile error
		//printCollection(col);
		
		printCollectionWild(col);
	}

	public static void printCollection(
			Collection<Object> col) {
		for (Object c : col) {
			System.out.println(c.toString());
		}
	}
	
	public static void printCollectionWild(
			Collection<?> col) {
		for (Object c : col) {
			System.out.println(c.toString());
		}
	}
}
