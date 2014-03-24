package com.javabasico;

public class Ponto implements Cloneable {

	private double x, y;
	
	public Ponto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Ponto) {
			Ponto outro = (Ponto) obj;

			return getX() == outro.getX() && getY() == outro.getY();
		}
		
		return false;
	}

	@Override
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	@Override
	public String toString() {
		return "["+getX()+", "+getY()+"]";
	}

	
	
	
}
