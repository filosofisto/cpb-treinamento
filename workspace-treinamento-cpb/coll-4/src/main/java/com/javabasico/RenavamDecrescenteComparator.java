package com.javabasico;

import java.util.Comparator;

public class RenavamDecrescenteComparator 
	implements Comparator<Veiculo> {

	@Override
	public int compare(Veiculo v1, Veiculo v2) {
		return -v1.compareTo(v2);
	}

}
