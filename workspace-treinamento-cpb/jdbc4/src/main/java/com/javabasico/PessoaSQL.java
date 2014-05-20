package com.javabasico;

public enum PessoaSQL {

	INSERT("INSERT INTO cpb_treinamento.PESSOA(CPF,NOME,IDADE) VALUES(?,?,?)"),
	UPDATE("UPDATE cpb_treinamento.PESSOA SET NOME=?,IDADE=? WHERE (CPF=?)"),
	DELETE("DELETE FROM cpb_treinamento.PESSOA WHERE CPF=?"),
	READ("SELECT * FROM cpb_treinamento.PESSOA WHERE CPF=?"),
	LIST("SELECT * FROM cpb_treinamento.PESSOA ORDER BY NOME");
	
	private String sql;
	
	PessoaSQL(String sql) {
		this.sql = sql;
	}
	
	public String sql() {
		return sql;
	}
}
