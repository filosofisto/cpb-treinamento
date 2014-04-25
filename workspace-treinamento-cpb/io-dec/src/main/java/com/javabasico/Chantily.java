package com.javabasico;

public class Chantily extends AbstractProduto {

	public Chantily() {
		
	}
	
	public Chantily(Produto decorado) {
		super(decorado);
	}

	@Override
	public Double preco() {
		if (decorado == null) {
			return 0.5;
		} else {
			return decorado.preco() + 0.5;
		}
	}

}
