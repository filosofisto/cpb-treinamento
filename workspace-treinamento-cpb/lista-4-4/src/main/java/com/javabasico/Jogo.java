package com.javabasico;

public class Jogo {

	private Time time1;
	private Time time2;
	private int gols1;
	private int gols2;
	
	public Jogo(Time time1, Time time2, int gols1, int gols2) {
		super();
		this.time1 = time1;
		this.time2 = time2;
		this.gols1 = gols1;
		this.gols2 = gols2;
	}
	public Time getTime1() {
		return time1;
	}
	public void setTime1(Time time1) {
		this.time1 = time1;
	}
	public Time getTime2() {
		return time2;
	}
	public void setTime2(Time time2) {
		this.time2 = time2;
	}
	public int getGols1() {
		return gols1;
	}
	public void setGols1(int gols1) {
		this.gols1 = gols1;
	}
	public int getGols2() {
		return gols2;
	}
	public void setGols2(int gols2) {
		this.gols2 = gols2;
	}
	
	
}
