package com.javabasico;

public class LogAction implements Action {

	private Action decorated;
	
	public LogAction(Action decorated) {
		this.decorated = decorated;
	}
	
	@Override
	public void action() {
		System.out.println("Iniciando acao");
		decorated.action();
		System.out.println("Finalizando acao");
	}

}
