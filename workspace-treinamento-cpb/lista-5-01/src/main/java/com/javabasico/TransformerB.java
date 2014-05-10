package com.javabasico;

public class TransformerB implements Transformer {

	@Override
	public String transformarLinha(String linha) {
		return 
				/*CPF*/
				linha.substring(11,22) + ";" +
				/*Banco*/
				linha.substring(0,5) + ";" +
				/*Agencia*/
				linha.substring(5,11) + ";" +
				/*Saldo*/
				linha.substring(21,39);
	}

}
