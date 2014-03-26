package com.javabasico;

public class Main {

	public static void main(String[] args) {
		//Erro: Nao posso instanciar classe abstrata
		//Figura f = new Figura();
		
		Retangulo r = new Retangulo(10, 20);
		r.setPonto(new Ponto(1, 0));
		
		System.out.println("Retangulo->area: " + r.area());
		System.out.println("Retangulo->perimetro: " + r.perimetro());
	}

}
