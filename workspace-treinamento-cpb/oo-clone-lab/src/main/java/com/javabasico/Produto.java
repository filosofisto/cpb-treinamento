package com.javabasico;

public class Produto implements Cloneable {

	private String codigo;
	private String descricao;
	private String unidadeMedida;
	
	public Produto(
			String codigo, 
			String descricao, 
			String unidadeMedida) {
		super();
		
		this.codigo = codigo;
		this.descricao = descricao;
		this.unidadeMedida = unidadeMedida;
	}



	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	@Override
	public Produto clone() {
		try {
			return (Produto) super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
	
}
