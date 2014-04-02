package com.javabasico;

public class Conectar {

	public void calcular(String tipoConexao) {
		FabricaConexao fabricaConexao = new FabricaConexao();
		Conexao c = fabricaConexao.obterConexao(tipoConexao);
		
		c.abrirConexao();
		
		//bla bla bla
		
		c.fecharConexao();
	}
}
