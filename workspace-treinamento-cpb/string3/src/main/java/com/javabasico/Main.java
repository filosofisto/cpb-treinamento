package com.javabasico;

public class Main {

	public static void main(String[] args) {
		long t1 = System.currentTimeMillis();
		
		string();
		
		long t2 = System.currentTimeMillis();
		
		long difString = t2-t1;
		System.out.printf("Dif String: " + difString + "ms\n");
		
		t1 = System.currentTimeMillis();
		
		stringBuilder();
		
		t2 = System.currentTimeMillis();
		
		long difStringBuilder = t2-t1;
		System.out.printf("Dif StringBuilder: " + difStringBuilder + "ms\n");
		
		System.out.printf("Diferenca Percentual: %f", (float)difStringBuilder/(float)difString*100.0);
	}

	private static void string() {
		String str = "";
		
		for (int i = 0; i < 10000; i++) {
			str = str + i;
		}
	}
	
	private static void stringBuilder() {
		StringBuilder str = new StringBuilder();
		
		for (int i = 0; i < 10000; i++) {
			str.append(i);
		}
	}
}
