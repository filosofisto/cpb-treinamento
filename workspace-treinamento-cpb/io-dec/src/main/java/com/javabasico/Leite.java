package com.javabasico;

public class Leite extends AbstractProduto {

	public Leite() {
		
	}
	
	public Leite(Produto decorado) {
		super(decorado);
	}

	@Override
	public Double preco() {
		if (decorado == null) {
			return 0.4;
		} else {
			return decorado.preco() + 0.4;
		}
	}

}
