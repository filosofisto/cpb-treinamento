package com.javabasico;

public class TransformerSQL implements Transformer {

	private static final String INSERT = 
			"insert into TB001_MOVIMENTACAO(CPF,COD_BANCO,COD_AGENCIA,SALDO) " 
					+ "values ('%s','%s','%s',%s);";

	@Override
	public String transformarLinha(String linha) {
		return 
				String.format(INSERT, 
						linha.substring(11,22),
						linha.substring(0,5),
						linha.substring(5,11),
						linha.substring(21,39));
	}

}
