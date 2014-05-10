package com.javabasico;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Movimentacoes implements Serializable {

	private static final long serialVersionUID = 1855261952526787501L;
	
	private List<Movimentacao> lista;
	
	public Movimentacoes() {
		lista = new ArrayList<Movimentacao>();
	}
	
	public void adicionar(Movimentacao movimentacao) {
		lista.add(movimentacao);
	}
	
	public List<Movimentacao> getLista() {
		return lista;
	}
}
