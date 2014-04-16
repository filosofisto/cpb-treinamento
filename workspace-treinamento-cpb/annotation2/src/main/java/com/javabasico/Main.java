package com.javabasico;

import static java.lang.System.out;

public class Main {

	public static void main(String[] args) {
		MyAnnotadedClass clazz = new MyAnnotadedClass();
		
		RequestForEnhancement annot =
			clazz.getClass().getAnnotation(RequestForEnhancement.class);
		
		out.printf("Anotacao: id=%d, synopsis=%s, engineer=%s, date=%s",
				annot.id(), annot.synopsis(), annot.engineer(), annot.date());
	}

}
