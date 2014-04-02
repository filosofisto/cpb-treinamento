package com.javabasico;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Ponto3D extends Ponto {

	private int z;
	
	public Ponto3D() {
		
	}
	
	public Ponto3D(int x, int y, int z) {
		super(x,y);
		setZ(z);
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Ponto3D) {
			Ponto3D p = (Ponto3D) obj;
			
			return getX() == p.getX() 
					&& getY() == p.getY()
					&& getZ() == p.getZ();
		}
		
		return false;
	}
	
	public double distancia(Ponto3D p) {
		return sqrt(
				pow(abs(getX()-p.getX()), 2) + 
				pow(abs(getY()-p.getY()), 2) +
				pow(abs(getZ()-p.getZ()), 2)
			);
	}
}
