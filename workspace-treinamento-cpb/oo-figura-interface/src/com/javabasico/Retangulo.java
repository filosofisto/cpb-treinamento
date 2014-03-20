package com.javabasico;

public class Retangulo extends AbstractFigura {

	private double base;
	private double altura;
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double perimetro() {
		return 2*(base+altura);
	}

	@Override
	public double area() {
		return base*altura;
	}

	@Override
	public void desenhar() {
		System.out.println("DESENHAR QUADRADO");
	}

}
