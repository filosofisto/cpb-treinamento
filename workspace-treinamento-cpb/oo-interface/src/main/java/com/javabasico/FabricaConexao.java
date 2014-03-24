package com.javabasico;

public class FabricaConexao {

	public Conexao obterConexao(String tipoConexao) {
		if ("banco".equals(tipoConexao)) {
			return new ConexaoBancoDados();
		} else if ("rede".equals(tipoConexao)) {
			return new ConexaoNet();
		} else {
			return null;
		}
	}
}
