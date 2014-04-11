package com.javabasico;

import static java.lang.System.out;

public class Main {

	public static void main(String[] args) {
		MyClass clazz = new MyClass();
		
		Author author = clazz.getClass().getAnnotation(Author.class);
		Reviewer reviewer = clazz.getClass().getAnnotation(Reviewer.class);
		
		out.printf("Author: %s, %s\n", author.value().last(), author.value().first());
		out.printf("Revisor: %s, %s\n", reviewer.value().last(), reviewer.value().first());
	}

}
