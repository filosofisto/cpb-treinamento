package com.javabasico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class PessoaDAO 
	extends AbstractDAO<Pessoa, String> {

	public PessoaDAO(Connection connection) {
		super(connection);
	}

	@Override
	protected String insertSQL() {
		return PessoaSQL.INSERT.sql();
	}

	@Override
	protected void bindInsert(
			PreparedStatement p, 
			Pessoa entidade) throws SQLException {
		p.setString(1, entidade.getCpf());
		p.setString(2, entidade.getNome());
		p.setInt(3, entidade.getIdade());
	}

}
