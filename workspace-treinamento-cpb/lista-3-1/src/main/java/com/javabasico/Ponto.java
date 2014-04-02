package com.javabasico;

import static java.lang.Math.sqrt;
import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class Ponto {
	
	public static final Ponto ORIGEM = new Ponto(0,0);
	
	private static int count = 0;
	
	private int x, y;
	
	public Ponto() {
		count++;
	}
	
	public Ponto(int x, int y) {
		count++;
		
		setY(y);
		setX(x);
	}
	
	public static int getCount() {
		return count;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Ponto) {
			Ponto p = (Ponto) obj;
			
			return getX() == p.getX() && getY() == p.getY();
		}
		
		return false;
	}

	@Override
	public String toString() {
		return "(x=" + x + ", y=" + y + ")";
	}

	@Override
	public Ponto clone() throws CloneNotSupportedException {
		return (Ponto) super.clone();
	}
	
	public double distancia(Ponto p) {
		return sqrt(
					pow(abs(getX()-p.getX()), 2) + 
					pow(abs(getY()-p.getY()), 2)
				);
	}
}
