package com.javabasico;

import java.util.Comparator;

public class ComparatorCPF implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa o1, Pessoa o2) {
		return o1.getCpf().compareTo(o2.getCpf());
	}

}
