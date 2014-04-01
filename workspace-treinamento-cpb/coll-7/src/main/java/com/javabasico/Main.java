package com.javabasico;


public class Main {
	
	public static void main(String[] args) {
		MyBrowser navegador = new MyBrowser();
		navegador.go(new Page("http://www.google.com"));
		navegador.go(new Page("http://www.hotmail.com"));
		navegador.go(new Page("http://www.gmail.com"));
		navegador.go(new Page("http://www.x25.com.br"));
		
		System.out.println(navegador.currentPage());
		navegador.back();
		System.out.println(navegador.currentPage());
		navegador.back();
		System.out.println(navegador.currentPage());
		navegador.back();
		System.out.println(navegador.currentPage());
	}
}
