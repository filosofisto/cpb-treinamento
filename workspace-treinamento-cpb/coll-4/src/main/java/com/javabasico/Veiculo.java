package com.javabasico;

public class Veiculo implements Comparable<Veiculo> {

	private Integer renavam;
	private String marca;
	private String fabricante;
	
	public Veiculo(Integer renavam) {
		setRenavam(renavam);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Veiculo) {
			Veiculo other = (Veiculo) obj;
			
			return getRenavam().equals(other.getRenavam());
		}
		
		return false;
	}
	
	public int hashCode() {
		return getRenavam().hashCode();
	}
	
	public Integer getRenavam() {
		return renavam;
	}
	public void setRenavam(Integer renavam) {
		this.renavam = renavam;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public int compareTo(Veiculo other) {
		return getRenavam().compareTo(other.getRenavam());
	}
}
