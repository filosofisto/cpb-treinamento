package com.javabasico;

public enum EstadoCivil {
    
	CASADO("Casado"), 
    DIVORCIADO("Divorciado"), 
    SEPARADO("Separado"), 
    SOLTEIRO("Solteiro"), 
    VIUVO("Viúvo"), 
    UNIAO_ESTAVEL("União Estável");
	
	private String descricao;
	
	private EstadoCivil(String descricao) {
		this.descricao = descricao;
	}
	
	public boolean isViveJunto() {
		return this == CASADO
				|| this == UNIAO_ESTAVEL;
	}
	
	@Override
	public String toString() {
		return descricao;
	}
}
