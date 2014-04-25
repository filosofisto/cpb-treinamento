package com.javabasico;

public abstract class AbstractProduto implements Produto {

	protected Produto decorado;
	
	public AbstractProduto() {
		
	}
	
	public AbstractProduto(Produto decorado) {
		this.decorado = decorado;
	}
}
