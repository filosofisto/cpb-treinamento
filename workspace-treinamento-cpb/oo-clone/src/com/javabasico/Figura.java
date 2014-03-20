package com.javabasico;

public abstract class Figura implements Cloneable {

	private Ponto ponto;

	public abstract double perimetro();
	
	public abstract double area();
	
	public Ponto getPonto() {
		return ponto;
	}
	public void setPonto(Ponto ponto) {
		this.ponto = ponto;
	}

	@Override
	protected Object clone() {
		try {
			Figura fClone = (Figura) super.clone();
			/*Ponto pClone = (Ponto) ponto.clone();
			fClone.setPonto(pClone);*/
			
			return fClone;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
	
}
