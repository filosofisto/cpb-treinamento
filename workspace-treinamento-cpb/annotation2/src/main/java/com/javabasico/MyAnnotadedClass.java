package com.javabasico;

@RequestForEnhancement (
	id=1, 
	date="10/10/2000", 
	engineer="Fulano de Tal", 
	synopsis="Comentarios: TODO"
)
public class MyAnnotadedClass {

	@RequestForEnhancement(date="", id=2, synopsis="")
	private int valor;
}
