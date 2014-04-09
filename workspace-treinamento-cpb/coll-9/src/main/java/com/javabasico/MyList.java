package com.javabasico;


public class MyList implements Iterator {

	private Object[] array;
	private int free;
	private int actual;
	
	public MyList() {
		array = new Object[100];
		free = 0;
	}
	
	public boolean add(Object elemento) {
		if (free < array.length) {
			array[free++] = elemento;
			return true;
		} else {
			aumentaCapacidade();
			add(elemento);
		}
		
		return false;
	}

	private void aumentaCapacidade() {
		Object[] newArray = new Object[array.length*2];
		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}
		
		array = newArray;
	}

	public void add(int index, Object elemento) {
		if (index < array.length) {
			array[index] = elemento;
		}
	}

	public void clear() {
		array = new Object[100];
		free = 0;
	}
	
	public Object get(int index) {
		return array[index];
	}

	public int indexOf(Object elemento) {
		for (int i = 0; i < free; i++) {
			if (elemento.equals(array[i])) {
				return i;
			}
		}
		
		return -1;
 	}

	public boolean isEmpty() {
		return free == 0;
	}
	
	public int size() {
		return free;
	}

	@Override
	public boolean hasNext() {
		return actual < free;
	}

	@Override
	public Object next() {
		return array[actual++];
	}
}
