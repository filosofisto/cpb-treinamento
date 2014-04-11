package com.javabasico;

import static java.lang.System.out;

public class Main {

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		MyGoodClass myGoodClass = new MyGoodClass();
		
		Quality q1 = myClass.getClass().getAnnotation(Quality.class);
		Quality q2 = myGoodClass.getClass().getAnnotation(Quality.class);
		
		out.printf("MyClass quality: %s\n", q1.value().name());
		out.printf("MyGoodClass quality: %s\n", q2.value().name());
	}
}
