package com.x25.logicajava;

public enum Automovel {

	FERRARI(Cor.VERMELHO, TipoCor.METALICO),
	FERRARI_BRANCA(Cor.BRANCO, TipoCor.SOLIDO),
	LAMBORGHINI(Cor.BRANCO, TipoCor.SOLIDO),
	PORSHE(Cor.AMARELO, TipoCor.METALICO);
	
	private final Cor cor;
	private final TipoCor tipoCor;
	
	Automovel(Cor cor, TipoCor tipoCor) {
		this.cor = cor;
		this.tipoCor = tipoCor;
	}
	
	public Cor cor() {
		return cor;
	}
	
	public boolean isMetalico() {
		return tipoCor == TipoCor.METALICO;
	}
	
	public boolean isSolid() {
		return tipoCor == TipoCor.SOLIDO;
	}
}
