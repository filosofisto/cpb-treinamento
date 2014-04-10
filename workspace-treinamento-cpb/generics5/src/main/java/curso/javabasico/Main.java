package curso.javabasico;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Metodos Genericos
 * 
 * @author eduardo
 *
 */
public class Main {

	public static void main(String[] args) {
		Object[] objects = { new Object(), new Object() };
		Collection<Object> cObjects = new ArrayList<Object>();
		fromArrayToCollection(objects, cObjects);
		
		Integer[] integers = { 1, 2 };
		Collection<Integer> cIntegers = new ArrayList<Integer>();
		fromArrayToCollection(integers, cIntegers);
		
		String[] strings = { "eu", "tu", "ele" };
		Collection<String> cStrings = new ArrayList<String>();
		fromArrayToCollection(strings, cStrings);
	}

	// compile time error
	/*static void fromArrayToCollection(Object[] a, Collection<?> c) { 
		for (Object o : a) {			
			c.add(new Object()); 
		}
	}*/
	static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
		for (T e: a) {
			c.add(e);
		}
	}
}