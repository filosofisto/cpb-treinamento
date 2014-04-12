package com.javabasico;

import java.util.Scanner;

public class Gerenciador {

	private Scanner scanner;
	private Tabela tabela;

	public void executar() {
		inicializarAplicacao();

		while (true) {
			exibirMenu();
			String opcao = selecionarOpcao();
			processaOpcao(opcao);
		}
	}

	private void finalizaAplicacao() {
		scanner.close();
		System.exit(0);
	}

	private void inicializarAplicacao() {
		tabela = new Tabela();
		
		inicializarConsole();
	}

	private void processaOpcao(String opcao) {
		if (opcao.equals("I")) {
			Jogo jogo = informaJogo();
			processaJogo(jogo);
		} else if (opcao.equals("R")) {
			exibeResultado();
		} else if (opcao.equals("S")) {
			finalizaAplicacao();
		} else {
			System.out.println("Opcao invalida");
		}
	}

	private void exibeResultado() {
		System.out.println(tabela);
	}

	private void processaJogo(Jogo jogo) {
		Linha linhaTime1 = tabela.pesquisarLinha(
				jogo.getTime1());
		if (linhaTime1 == null) {
			linhaTime1 = new Linha();
			linhaTime1.setTime(jogo.getTime1());
			tabela.adicionarLinha(linhaTime1);
		}
		Linha linhaTime2 = tabela.pesquisarLinha(
				jogo.getTime2());
		if (linhaTime2 == null) {
			linhaTime2 = new Linha();
			linhaTime2.setTime(jogo.getTime2());
			tabela.adicionarLinha(linhaTime2);
		}
		
		if (jogo.getGols1() > jogo.getGols2()) {
			linhaTime1.vitoria();
			linhaTime2.derrota();
		} else if (jogo.getGols2() > jogo.getGols1()) {
			linhaTime2.vitoria();
			linhaTime1.derrota();
		} else {
			linhaTime1.empate();
			linhaTime2.empate();
		}
		
		linhaTime1.golsFeitos(jogo.getGols1());
		linhaTime1.golsSofridos(jogo.getGols2());
		linhaTime2.golsFeitos(jogo.getGols2());
		linhaTime2.golsSofridos(jogo.getGols1());
	}

	private Jogo informaJogo() {
		System.out.println("Time 1: ");
		String time1 = scanner.next();
		System.out.println("Time 2: ");
		String time2 = scanner.next();
		System.out.println("Gols do " + time1 + ": ");
		int g1 = scanner.nextInt();
		System.out.println("Gols do " + time2 + ": ");
		int g2 = scanner.nextInt();
		
		Jogo jogo = new Jogo(
			new Time(time1),
			new Time(time2),
			g1,
			g2
		);
		
		return jogo;
	}

	private String selecionarOpcao() {
		return scanner.next();
	}

	private void inicializarConsole() {
		scanner = new Scanner(System.in);
	}

	private void exibirMenu() {
		System.out.println("(I) Incluir Jogo\n(R) Resultado\n(S)Sair");
	}
}
