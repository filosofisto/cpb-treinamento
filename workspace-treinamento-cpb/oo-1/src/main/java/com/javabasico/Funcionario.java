package com.javabasico;

public class Funcionario extends Pessoa {

	private int matricula;
	private double salario;
	
	public Funcionario() {
		inicializa();
	}
	
	public Funcionario(String nome) {
		super(nome);
		inicializa();
	}
	
	public Funcionario(String nome, String cpf) {
		super(nome, cpf);
		inicializa();
	}
	
	public Funcionario(String nome, String cpf, 
			int matricula, double salario) {
		super(nome, cpf);
		setMatricula(matricula);
		setSalario(salario);
	}
	
	private void inicializa() {
		setMatricula(0);
		setSalario(0);
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
}
