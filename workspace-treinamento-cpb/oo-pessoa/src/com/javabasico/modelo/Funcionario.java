package com.javabasico.modelo;

public class Funcionario extends Pessoa {

	private int matricula;
	private double salario;
	private double planoSaude; 

	public Funcionario() {
		super();
		
		setPlanoSaude(500);
	}
	
	public Funcionario(int matricula, double salario) {
		this(salario);
		setMatricula(matricula);
	}
	
	public Funcionario(int matricula) {
		this();
		
		setMatricula(matricula);
	}
	
	public Funcionario(double salario) {
		this();
		
		setSalario(salario);
	}
	
	public double salarioTotal() {
		return getSalario()+getPlanoSaude();
	}
	
	public double salarioTotal(double adicional) {
		return salarioTotal()+adicional;
	}

	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getPlanoSaude() {
		return planoSaude;
	}
	public void setPlanoSaude(double planoSaude) {
		this.planoSaude = planoSaude;
	}
}
