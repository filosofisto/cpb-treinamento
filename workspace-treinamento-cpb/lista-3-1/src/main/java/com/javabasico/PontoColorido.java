package com.javabasico;

public class PontoColorido extends Ponto {

	private int cor;
	
	public PontoColorido() {
		super();
	}

	public PontoColorido(int x, int y) {
		super(x, y);
	}

	public int getCor() {
		return cor;
	}

	public void setCor(int cor) {
		this.cor = cor;
	}
}
