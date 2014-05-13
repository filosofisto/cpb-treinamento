package com.javabasico;

public class Main {

	public static void main(String[] args) {
		ConnectionPool pool = new ConnectionPool(2);
		
		ConnUse[] uses = new ConnUse[5];
		
		for (int i = 0; i < uses.length; i++) {
			uses[i] = new ConnUse(pool);
		}
		
		for (int i = 0; i < uses.length; i++) {
			uses[i].start();
		}
	}
}
