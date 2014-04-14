package com.javabasico;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractCadastroLivro 
	implements CadastroLivro {

	private Collection<Livro> livros;
	private Map<String, Livro> mapLivros;
	
	public AbstractCadastroLivro() {
		livros = collectionFactory();
		mapLivros = new HashMap<String, Livro>();
	}

	protected abstract Collection<Livro> 
		collectionFactory();

	public void incluir(Livro livro) {
		livros.add(livro);
		mapLivros.put(livro.getIsbn(), livro);
	}
	
	public void alterar(Livro livro) throws Exception {
		Livro livroEncontrado = obter(livro.getIsbn());
		if (livroEncontrado != null) {
			livroEncontrado.setAutor(livro.getAutor());
			livroEncontrado.setTitulo(livro.getTitulo());
		}
	}
	
	public void excluir(String isbn) {
		Livro livro = mapLivros.remove(isbn);
		if (livro != null) {
			livros.remove(livro);
		}
	}
	
	public Livro obter(String isbn) throws Exception {
		if (!mapLivros.containsKey(isbn)) {
			throw new Exception("Livro nao encontrado");
		}
		
		return mapLivros.get(isbn);
	}
	
	public List<Livro> consultarPorTitulo(String titulo) {
		List<Livro> ret = new ArrayList<Livro>();
		
		for (Livro livro: livros) {
			if (livro.getTitulo().contains(titulo)) {
				ret.add(livro);
			}
		}
		
		Comparator<Livro> c = new Comparator<Livro>() {

			@Override
			public int compare(Livro o1, Livro o2) {
				return o1.getTitulo().compareTo(o2.getTitulo());
			}
		};
		
		Collections.sort(ret, c);
		
		return ret;
	}
	
	public List<Livro> consultarPorAutor(String autor) {
		List<Livro> ret = new ArrayList<Livro>();
		
		for (Livro livro: livros) {
			if (livro.getAutor().contains(autor)) {
				ret.add(livro);
			}
		}
		
		Comparator<Livro> c = new Comparator<Livro>() {

			@Override
			public int compare(Livro o1, Livro o2) {
				return o1.getAutor().compareTo(o2.getAutor());
			}
		};
		
		Collections.sort(ret, c);
		
		return ret;
	}
	
	@Override
	public String toString() {
		StringBuilder ret = new StringBuilder();
		
		for (Livro livro: livros) {
			ret.append(livro + "\n");
		}
		
		return ret.toString();
	}
}
