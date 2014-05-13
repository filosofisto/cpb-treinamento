package com.javabasico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PessoaDAO {

	private Connection connection;

	public PessoaDAO(Connection connection) {
		this.connection = connection;
	}

	public void closeConnection() {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// Ignore
			}
		}
	}

	public void incluir(Pessoa pessoa) throws SQLException {
		PreparedStatement p = null;

		try {
			p = connection.prepareStatement(PessoaSQL.INSERT.sql());

			p.setString(1, pessoa.getCpf());
			p.setString(2, pessoa.getNome());
			p.setInt(3, pessoa.getIdade());

			p.executeUpdate();
		} finally {
			if (p != null) {
				try {
					p.close();
				} catch (SQLException e) {
					// Ignore
				}
			}
		}
	}

	public void excluir(String cpf) throws SQLException {
		PreparedStatement p = null;

		try {
			p = connection.prepareStatement(PessoaSQL.DELETE.sql());

			p.setString(1, cpf);

			p.executeUpdate();
		} finally {
			if (p != null) {
				try {
					p.close();
				} catch (SQLException e) {
					// Ignore
				}
			}
		}
	}

	public void alterar(Pessoa pessoa) {

	}

	public List<Pessoa> listar() throws SQLException {
		Statement stm = null;
		ResultSet rs = null;

		try {
			stm = connection.createStatement();
			rs = stm.executeQuery(PessoaSQL.LIST.sql());

			List<Pessoa> list = new ArrayList<Pessoa>();

			while (rs.next()) {
				Pessoa p = new Pessoa();

				p.setCpf(rs.getString("CPF"));
				p.setNome(rs.getString("NOME"));
				p.setIdade(rs.getInt("IDADE"));

				list.add(p);
			}

			return list;
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// Ignore
				}
			}

			if (stm != null) {
				try {
					stm.close();
				} catch (SQLException e) {
					// Ignore
				}
			}
		}
	}

}
