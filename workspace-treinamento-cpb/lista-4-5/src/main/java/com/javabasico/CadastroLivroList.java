package com.javabasico;

import java.util.ArrayList;
import java.util.Collection;

public class CadastroLivroList 
	extends AbstractCadastroLivro {

	@Override
	protected Collection<Livro> collectionFactory() {
		return new ArrayList<Livro>();
	}

	
}