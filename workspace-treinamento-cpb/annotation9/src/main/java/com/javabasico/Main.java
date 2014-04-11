package com.javabasico;


public class Main {

	public static void main(String[] args) {
		method1();
		method2();
	}

	@SuppressWarnings("deprecation")
	public static void method1() {
		MyClass myClass = new MyClass();
		myClass.oldMethod();
	}
	
	@SuppressWarnings("deprecation")
	public static void method2() {
		VeryOldClass veryOldClass = new VeryOldClass();
		veryOldClass.m1();
		veryOldClass.m2();
	}
}
