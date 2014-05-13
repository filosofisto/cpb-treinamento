package com.javabasico;

public class ExceptionAction implements Action {

	private Action decorated;
	
	public ExceptionAction(Action decorated) {
		this.decorated = decorated;
	}
	
	@Override
	public void action() {
		try {
			decorated.action();
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

}
