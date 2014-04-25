package com.javabasico;

public class Cafe extends AbstractProduto {

	public Cafe() {
		
	}
	
	public Cafe(Produto decorado) {
		super(decorado);
	}

	@Override
	public Double preco() {
		if (decorado == null) {
			return 1.0;
		} else {
			return decorado.preco() + 1.0;
		}
	}
}
