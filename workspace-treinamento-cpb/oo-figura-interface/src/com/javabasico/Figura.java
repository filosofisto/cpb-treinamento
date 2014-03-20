package com.javabasico;

public interface Figura {

	double perimetro();
	
	double area();
	
	Ponto getPonto();
	
	void setPonto(Ponto ponto);
	
	void mover(Ponto ponto);
	
	void desenhar();
}
