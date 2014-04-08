package com.javabasico;

import java.util.Comparator;

public class ComparatorIdadeNome 
	implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa o1, Pessoa o2) {
		int result = o1.getIdade().compareTo(o2.getIdade());
		
		if (result == 0) {
			result = o1.getNome().compareToIgnoreCase(
					o2.getNome());
			
			/*if (result == 0) {
				result = o1.getCpf().compareTo(o2.getCpf());
			}*/
		}
		
		return result;
	}

}
