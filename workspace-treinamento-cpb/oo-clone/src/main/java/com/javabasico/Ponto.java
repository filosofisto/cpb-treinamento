package com.javabasico;

public class Ponto implements Cloneable {

	private int x, y;
	
	public Ponto(int x, int y) {
		super();
		
		this.x = x;
		this.y = y;
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
			Ponto outro = (Ponto) obj;
			
			return getX() == outro.getX()
					&& getY() == outro.getY();
		}
		
		return false;
	}
	
	@Override
	public Ponto clone() {
		try {
			return (Ponto) super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	@Override
	public String toString() {
		return "Ponto [x=" + x + ", y=" + y + "]";
	}
}
