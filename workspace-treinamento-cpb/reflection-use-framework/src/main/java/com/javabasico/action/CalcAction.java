package com.javabasico.action;

import com.javabasico.framework.Action;

public class CalcAction implements Action {

	@Override
	public void execute() {
		System.out.println("Calculando o somatorio");

		System.out.println("Somatorio calculado com sucesso");
	}
}
