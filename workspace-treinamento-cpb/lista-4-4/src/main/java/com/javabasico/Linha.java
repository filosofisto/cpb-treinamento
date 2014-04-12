package com.javabasico;


public class Linha implements Comparable<Linha> {

	private Time time;
	private int vitorias;
	private int derrotas;
	private int empates;
	private int golsPro;
	private int golsContra;
	
	public void vitoria() {
		vitorias++;
	}
	
	public void derrota() {
		derrotas++;
	}
	
	public void empate() {
		empates++;
	}
	
	public void golsFeitos(int gols) {
		golsPro += gols;
	}
	
	public void golsSofridos(int gols) {
		golsContra += gols;
	}
	
	public int getPontuacao() {
		return getVitorias()*3+getEmpates()*1;
	}
	
	public int getSaldoGols() {
		return getGolsPro()-getGolsContra();
	}
	
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	public int getGolsPro() {
		return golsPro;
	}
	public void setGolsPro(int golsPro) {
		this.golsPro = golsPro;
	}
	public int getGolsContra() {
		return golsContra;
	}
	public void setGolsContra(int golsContra) {
		this.golsContra = golsContra;
	}

	@Override
	public int compareTo(Linha outra) {
		int criterio = outra.getPontuacao()-getPontuacao();
		
		if (criterio == 0) {
			criterio = outra.getVitorias()-getVitorias();
			
			if (criterio == 0) {
				criterio = outra.getSaldoGols()-getSaldoGols();
			}
		}

		return criterio;
	}
}
