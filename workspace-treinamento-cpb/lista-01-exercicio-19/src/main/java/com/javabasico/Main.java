package com.javabasico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] times = {
			"Internacional", "Gremio", "Corinthians", "Palmeiras",
			"Sao Paulo", "Santos", "Flamengo", "Vasco", "Fluminense",
			"Atletico", "Cruzeiro", "Coritiba", "Figueirense", "Criciuma",
			"Goias", "Nautico", "Chapecoense", "Avai", "Sport", "Brasiliense"
		};
		
		int[][] tabela = new int[20][];
		for (int i = 0; i < tabela.length; i++) {
			tabela[i] = new int[6];
		}
		
		while(true) {
			menu();
			String opcao = scanner.next();
			processaOpcao(opcao, times, tabela, scanner);
		}
	}
	
	private static void processaOpcao(
			String opcao, String[] times, 
			int[][] tabela, 
			Scanner scanner) {
		if (opcao.equals("I")) {
			informaJogo(times, tabela, scanner);
		} else if (opcao.equals("R")) {
			exibeResultado(times, tabela);
		} else if (opcao.equals("S")) {
			System.exit(0);
		} else {
			System.out.println("Opcao invalida");
		}
	}

	private static void exibeResultado(String[] times, int[][] tabela) {
		System.out.println("Time\t\tVit Der Emp GP GC Pts");
		System.out.println("===========================");
		
		for (int i = 0; i < times.length; i++) {
			System.out.printf("%s %d  %d  %d  %d  %d  %d\n", 
					times[i], tabela[i][0], tabela[i][1], tabela[i][2]
					, tabela[i][3], tabela[i][4], tabela[i][5]);
		}
	}

	private static void informaJogo(
			String[] times, 
			int[][] tabela, 
			Scanner scanner) {
		for (int i = 0; i < times.length; i++) {
			System.out.printf("[%d] - %s\n", i, times[i]);
		}
		
		System.out.println("Codigo do Time 1: ");
		int cod1 = scanner.nextInt();
		System.out.println("Codigo do Time 2: ");
		int cod2 = scanner.nextInt();
		System.out.println("Gols do Time 1: ");
		int g1 = scanner.nextInt();
		System.out.println("Gols do Time 2: ");
		int g2 = scanner.nextInt();
		
		if (g1 > g2) {
			//Incrementa o numero de vitorias do vencedor
			tabela[cod1][0]++;
			//Incrementa a pontuacao do vencedor em 3 pts
			tabela[cod1][5] += 3;
			//Incrementa o numero de derrotas para o perdedor
			tabela[cod2][1]++;
		} else if (g2 > g1) {
			//Incrementa o numero de vitorias do vencedor
			tabela[cod2][0]++;
			//Incrementa a pontuacao do vencedor em 3 pts
			tabela[cod2][5] += 3;
			//Incrementa o numero de derrotas para o perdedor
			tabela[cod1][1]++;
		} else {
			//Empate
			tabela[cod1][2]++;
			tabela[cod2][2]++;
			tabela[cod1][5]++;
			tabela[cod2][5]++;
		}
		
		//Gols
		tabela[cod1][3] += g1;
		tabela[cod1][4] += g2;
		tabela[cod2][3] += g2;
		tabela[cod2][4] += g1;
	}

	private static void menu() {
		System.out.println("(I) Incluir Jogo\n(R) Resultado\n(S)Sair");
	}
}
