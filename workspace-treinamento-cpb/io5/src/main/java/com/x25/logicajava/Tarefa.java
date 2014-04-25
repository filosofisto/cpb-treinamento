package com.x25.logicajava;

import java.io.Serializable;
import java.util.Date;

public class Tarefa implements Serializable {
	
	private static final long serialVersionUID = 7292408037891070511L;
	
	private int id;
	private String descricao;
	private Date data;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String toString() {
		return getId() + "-" + getDescricao();
	}

}
