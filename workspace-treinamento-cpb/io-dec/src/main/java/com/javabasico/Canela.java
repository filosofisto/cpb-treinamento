package com.javabasico;

public class Canela extends AbstractProduto {

	public Canela() {
		
	}
	
	public Canela(Produto decorado) {
		super(decorado);
	}

	@Override
	public Double preco() {
		if (decorado == null) {
			return 0.1;
		} else {
			return decorado.preco() + 0.1;
		}
	}

}
