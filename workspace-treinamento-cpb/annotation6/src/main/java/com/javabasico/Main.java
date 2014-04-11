package com.javabasico;

import static java.lang.System.out;

public class Main {

	public static void main(String[] args) {
		MySubClass mySubClass = new MySubClass();
		Quality q1 = mySubClass.getClass().getAnnotation(Quality.class);
		out.printf("MySubClass quality: %s\n", q1.value().name());
		
		MyOtherSubClass myOtherSubClass = new MyOtherSubClass();
		Quality q2 = myOtherSubClass.getClass().getAnnotation(Quality.class);
		out.printf("MyOtherSubClass quality: %s\n", q2.value().name());
		
		MyOtherSubSubClass myOtherSubSubClass = new MyOtherSubSubClass();
		Quality q3 = myOtherSubSubClass.getClass().getAnnotation(Quality.class);
		out.printf("MyOtherSubSubClass quality: %s\n", q3.value().name());
	}

}
