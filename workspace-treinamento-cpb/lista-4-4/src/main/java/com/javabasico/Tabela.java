package com.javabasico;

import java.util.ArrayList;
import java.util.List;

public class Tabela {

	private List<Linha> linhas;
	
	public Tabela() {
		linhas = new ArrayList<Linha>();
	}
	
	public Linha pesquisarLinha(Time time) {
		for (Linha linha: linhas) {
			if (linha.getTime().equals(time)) {
				return linha;
			}
		}
		
		return null;
	}
	
	public void adicionarLinha(Linha linha) {
		linhas.add(linha);
	}
	
	@Override
	public String toString() {
		StringBuilder ret = new StringBuilder();
		
		ret.append("======================================");
		ret.append("Time          Pts Vit Emp Der GP GC SG");
		ret.append("======================================");
		
		for (Linha linha: linhas) {
			ret.append(linha.getTime().getNome()
					+ " " + linha.getPontuacao()
					+ " " + linha.getVitorias()
					+ " " + linha.getEmpates()
					+ " " + linha.getDerrotas()
					+ " " + linha.getGolsPro()
					+ " " + linha.getGolsContra()
					+ " " + linha.getSaldoGols()
					+ "\n");
		}
		
		return ret.toString();
	}
}
