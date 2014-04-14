package com.javabasico;

import java.util.Collection;
import java.util.LinkedHashSet;

public class CadastroLivroSet 
	extends AbstractCadastroLivro {

	@Override
	protected Collection<Livro> collectionFactory() {
		return new LinkedHashSet<Livro>();
	}
}
