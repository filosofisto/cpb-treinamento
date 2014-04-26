package com.javabasico;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Projeto implements Serializable {
	
	private static final long serialVersionUID = 7557299738287248337L;
	
	private Pessoa gerente;
	private List<Tarefa> tarefas;
	//private Equipe equipe;
	private transient String bla;
	private String novoAttr;
	private int novoInt;
	
	public Pessoa getGerente() {
		return gerente;
	}
	public void setGerente(Pessoa gerente) {
		this.gerente = gerente;
	}
	public List<Tarefa> getTarefas() {
		if (tarefas == null) {
			tarefas = new ArrayList<Tarefa>();
		}

		return tarefas;
	}
	public void setTarefas(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}
	/*public Equipe getEquipe() {
		return equipe;
	}
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}*/
	
	public String toString() {
		StringBuilder b = new StringBuilder();
		b.append("Gerente: " + getGerente() + "\n");
		b.append("Tarefas\n");
		
		for (Tarefa t: getTarefas()) {
			b.append("\t" + t + "\n");
		}
		
		//b.append(getEquipe());
		
		return b.toString();
	}
	public String getNovoAttr() {
		return novoAttr;
	}
	public void setNovoAttr(String novoAttr) {
		this.novoAttr = novoAttr;
	}
	public int getNovoInt() {
		return novoInt;
	}
	public void setNovoInt(int novoInt) {
		this.novoInt = novoInt;
	}
	
	
}
