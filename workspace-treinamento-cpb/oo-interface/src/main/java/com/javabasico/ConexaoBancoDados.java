package com.javabasico;

public class ConexaoBancoDados implements Conexao {

	@Override
	public void abrirConexao() {
		System.out.println("ConexaoBancoDados->abirConexao()");
	}

	@Override
	public void fecharConexao() {
		System.out.println("ConexaoBancoDados->fecharConexao()");
	}
}
