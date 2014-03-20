package com.javabasico;

import com.javabasico.modelo.Diretor;
import com.javabasico.modelo.Funcionario;
import com.javabasico.modelo.Pessoa;
import com.javabasico.modelo.Posicao;
import com.javabasico.modelo.Sexo;

public class Main {

	public static void main(String[] args) {
		Pessoa eu;
		eu = new Pessoa();
		eu.setNome("Eduardo");
		eu.setIdade(39);
		eu.setSexo(Sexo.MASCULINO); //masculino
		
		eu.acordar();
		
		Posicao ate = new Posicao();
		ate.setLatitude(67);
		ate.setLongitude(35.2);
		
		eu.andar(ate);
		
		System.out.println(eu.getIdade());
		
		Funcionario padrao = new Funcionario(1313, 10000);
		padrao.setNome("Joao");
		padrao.setIdade(30);
		padrao.acordar();
		
		if (padrao.isAcordado()) {
			System.out.println("Corre vai trabalhar!!!");
		}
		
		Funcionario estagiario = new Funcionario();
		estagiario.setMatricula(20);
		estagiario.setSalario(5000);
		
		Funcionario g = new Diretor(1234, 25000, 10, 1000);
		g.setNome("Fulano");
		System.out.println(g);
		System.out.println(g.salarioTotal(2000.0));
	}
}













