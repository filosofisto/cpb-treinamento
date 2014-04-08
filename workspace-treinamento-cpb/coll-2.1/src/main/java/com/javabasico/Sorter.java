package com.javabasico;

import java.util.Comparator;
import java.util.List;

public class Sorter<T> {

	@SuppressWarnings("unchecked")
	public void sort(List<T> list) {
		if (list.size() > 0) {
			if (!(list.get(0) instanceof Comparable)) {
				throw new RuntimeException(
						"Nao implementa Comparable, nao sou advinho!!!");
			}
			int len = list.size()-1;
			for (int i = 0; i < len; i++) {
				T actual = list.get(i);
				Comparable<T> c = (Comparable<T>) actual; 
				int pos = i;
				
				for (int j = i+1; j < list.size(); j++) {
					if (c.compareTo(list.get(j)) > 0) {
						actual = list.get(j);
						c = (Comparable<T>) actual;
						pos = j;
					}
				}
				
				list.set(pos, list.get(i));
				list.set(i, actual);
			}
		}
	}
	
	public void sort(List<T> list, Comparator<T> comparator) {
		int len = list.size()-1;
		for (int i = 0; i < len; i++) {
			T actual = list.get(i);
			int pos = i;
			
			for (int j = i+1; j < list.size(); j++) {
				if (comparator.compare(actual, list.get(j)) > 0) {
					actual = list.get(j);
					pos = j;
				}
			}
			
			list.set(pos, list.get(i));
			list.set(i, actual);
		}
	}
}
