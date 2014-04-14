package com.javabasico;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		CadastroLivro cad = new CadastroLivroList();
		
		Livro l1 = new Livro();
		l1.setAutor("Eduardo");
		l1.setTitulo("Aprenda Java em 121 dias");
		l1.setIsbn("12372354620938");
		
		Livro l2 = new Livro();
		l2.setAutor("James Gosling");
		l2.setTitulo("Java Specification Language");
		l2.setIsbn("1237235434976782368");
		
		Livro l3 = new Livro();
		l3.setAutor("Emerson");
		l3.setTitulo("C++ Completo e Total");
		l3.setIsbn("7809435r37487432");
		
		cad.incluir(l2);
		cad.incluir(l3);
		cad.incluir(l1);
		
		System.out.println(cad);
		
		try {
			Livro livroEm = cad.obter("7809435r37487432");
			System.out.println(livroEm);
		} catch (Exception e) {
			//Ignore o prazo ta curto
		}
		
		String isbn = "5651348648371516858";
		try {
			Livro livroNotFound = cad.obter(isbn);
			System.out.println(livroNotFound);
		} catch (Exception e) {
			System.out.println("Livro " + isbn + " nao encontrado");
		}
		
		Livro livroAlterado = new Livro();
		livroAlterado.setAutor("Luciano");
		livroAlterado.setTitulo("C++ Incompleto e Parcial");
		livroAlterado.setIsbn("7809435r37487432");
		
		try {
			cad.alterar(livroAlterado);
			System.out.println();
			System.out.println(cad);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		List<Livro> livrosJava = cad.consultarPorTitulo("Java");
		if (!livrosJava.isEmpty()) {
			for (Livro liv: livrosJava) {
				System.out.println(liv);
			}
		}
		
		System.out.println();
		
		List<Livro> livrosGosling = cad.consultarPorAutor("Gosling");
		if (!livrosGosling.isEmpty()) {
			for (Livro liv: livrosGosling) {
				System.out.println(liv);
			}
		}
	}
}
