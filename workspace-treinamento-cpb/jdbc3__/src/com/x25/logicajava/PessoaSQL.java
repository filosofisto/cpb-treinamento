package com.x25.logicajava;

public enum PessoaSQL {

	INSERT("INSERT INTO PESSOA(CPF,NOME,IDADE) VALUES(?,?,?)"),
	UPDATE("UPDATE PESSOA SET NOME=?,IDADE=? WHERE (CPF=?)"),
	DELETE("DELETE FROM PESSOA WHERE (CPF=?)"),
	LIST("SELECT * FROM PESSOA ORDER BY NOME");
	
	private String sql;
	
	PessoaSQL(String sql) {
		this.sql = sql;
	}
	
	public String sql() {
		return sql;
	}
}
