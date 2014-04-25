package com.javabasico;

import static java.lang.System.out;

public class Main {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("Pele");
		p.setEstadoCivil(EstadoCivil.UNIAO_ESTAVEL);
		
		out.println(p.getEstadoCivil());
		out.println("Vive junto: " 
				+ p.getEstadoCivil().isViveJunto());
	}
}
