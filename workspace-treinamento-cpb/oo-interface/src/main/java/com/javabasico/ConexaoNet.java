package com.javabasico;

public class ConexaoNet implements Conexao {

	@Override
	public void abrirConexao() {
		System.out.println("ConexaoNet->abrirConexao()");
	}

	@Override
	public void fecharConexao() {
		System.out.println("ConexaoNet->fecharConexao()");
	}
}
