package com.javabasico;

public class Main {

	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria();
		c1.setSaldo(15000);
		
		ContaBancaria c2 = new ContaBancaria();
		c2.setSaldo(25000);
		
		c1.deposita(10000);
		try {
			c1.retira(5000);
		} catch (SaldoInsuficienteException e) {
			System.out.println("Ops!! Saldo insuficiente");
		}
		
		for (Operacao op: c1.extrato()) {
			System.out.println(op);
		}
		
		//c1.transfere(13000, c2);
	}
}
