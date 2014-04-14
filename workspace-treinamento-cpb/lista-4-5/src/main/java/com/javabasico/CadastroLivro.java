package com.javabasico;

import java.util.List;

public interface CadastroLivro {

	void incluir(Livro livro);

	void alterar(Livro livro) throws Exception;

	void excluir(String isbn);

	Livro obter(String isbn) throws Exception;

	List<Livro> consultarPorTitulo(String titulo);

	List<Livro> consultarPorAutor(String autor);
}