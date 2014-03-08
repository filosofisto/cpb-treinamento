package com.javabasico;

public class Main {

	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("Parametros: <salario> <idade> <filhos>");
			System.exit(-1);
		}
		
		double salario = Double.parseDouble(args[0]);
		int idade = Integer.parseInt(args[1]);
		int filhos = Integer.parseInt(args[2]);
		
		double beneficio = calculaBeneficio(salario, idade, filhos);
		System.out.printf("Salario: %g, Idade: %d, Filhos: %d, Beneficio: %g, Valor Final: %g",
				salario, idade, filhos, beneficio, (salario+beneficio));
	}
	
	private static double calculaBeneficio(double salario, int idade, int filhos) {
		//O valor inicial do beneficio eh 15% do salario original
		double beneficio = salario * 15 / 100;
		
		//Se a idade eh superior a 50 anos, o beneficio eh acrescido de 3.75%
		if (idade > 50) {
			beneficio += salario * 3.75 / 100;
		}
		
		//Para 1 filho acrescentar $100, para 2 filhos mais $250, 3 filhos mais $320
		// 4 ou 5 filhos acrescenta $380
		//Mais do que 5 filhos acrescenta $420
		if (filhos > 0) {
			switch (filhos) {
			case 1: 
				beneficio += 100;
				break;
			case 2:
				beneficio += 250;
				break;
			case 3:
				beneficio += 320;
				break;
			case 4:
			case 5:
				beneficio += 380;
				break;
			default:
				beneficio += 420;
			}
		}
		
		return beneficio;
	}
}
