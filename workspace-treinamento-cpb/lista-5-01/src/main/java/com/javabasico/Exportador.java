package com.javabasico;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exportador {
	
	private void exportar(File fileOrigem, File fileDestino, Transformer transformer) 
			throws FileNotFoundException {
		PrintWriter out = new PrintWriter(fileDestino);
		
		Scanner s = new Scanner(fileOrigem).useDelimiter("\n");
		String line;
		
		while (s.hasNext()) {
			line = s.nextLine();
			
			out.println(
				transformer.transformarLinha(line)
			);
		}
		
		out.close();
	}
	
	public void toFormatoB(File fileOrigem, File fileDestino) 
			throws FileNotFoundException {
		exportar(fileOrigem, fileDestino, new TransformerB());
	}
	
	public void toSQL(File fileOrigem, File fileDestino) 
			throws FileNotFoundException {
		exportar(fileOrigem, fileDestino, new TransformerSQL());
	}
	
	public void toObject(File fileOrigem, File fileDestino) 
			throws IOException {
		Movimentacoes movimentacoes = new Movimentacoes();
		Movimentacao movimentacao;
		Scanner s = new Scanner(fileOrigem).useDelimiter("\n");
		String linha;
		
		while (s.hasNext()) {
			linha = s.nextLine();
			
			movimentacao = new Movimentacao();
			
			/*CPF*/
			movimentacao.setCpf(linha.substring(11,22)); 
			/*Banco*/
			movimentacao.setBanco(linha.substring(0,5));
			/*Agencia*/
			movimentacao.setAgencia(linha.substring(5,11));
			/*Saldo*/
			movimentacao.setSaldo(Float.parseFloat(linha.substring(21,39)));
			
			movimentacoes.adicionar(movimentacao);
		}
		
		ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream(
						fileDestino));
		out.writeObject(movimentacoes);
		out.close();
	}
}
