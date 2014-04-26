package com.javabasico;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Equipe implements Serializable {

	private static final long serialVersionUID = -2321825565927245035L;
	
	private List<Pessoa> membros;

	public List<Pessoa> getMembros() {
		if (membros == null) {
			membros = new ArrayList<Pessoa>();
		}

		return membros;
	}

	public void setMembros(List<Pessoa> membros) {
		this.membros = membros;
	}
	
	public String toString() {
		StringBuilder b = new StringBuilder("Equipe\n");
		
		for (Pessoa p: getMembros()) {
			b.append("\t" + p + "\n");
		}
		
		return b.toString();
	}
}
