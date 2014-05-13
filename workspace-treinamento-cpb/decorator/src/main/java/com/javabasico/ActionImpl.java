package com.javabasico;

public class ActionImpl implements Action {

	@Override
	public void action() {
		System.out.println("Acao original");
		throw new RuntimeException("Bingo");
	}

}
