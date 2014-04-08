package com.javabasico;

public class Runner {

	public void run(Operation operation) {
		long t1 = System.currentTimeMillis();
		operation.execute();
		long t2 = System.currentTimeMillis();
		
		System.out.printf(
				"Operacao: %s, tempo: %dms\n", 
				operation.getDescricao(), 
				t2-t1);
	}
}
