package com.javabasico;

import java.util.Comparator;

public class ComparatorMedalha implements Comparator<Atleta> {

	@Override
	public int compare(Atleta a1, Atleta a2) {
		return a2.getMedalhas()-a1.getMedalhas();
	}

}
