package com.javabasico;

public class Main {

	public static void main(String[] args) {
		String s1 = "Teste";
		String s2 = new String("Teste");
		String s3 = "Teste";
		String s4 = new String("Teste");
		
		System.out.println(
				(s1.equals(s3) 
						? "s1 equals s3" 
						: "s1 not equals s3"));
		System.out.println(
				(s1 == s3) 
						? "s1 == s3" 
						: "s1 != s3");
		System.out.println(
				(s1.equals(s2) 
						? "s1 equals s2"
						: "s1 not equals s2"));
		System.out.println(
				(s1 == s2) 
						? "s1 == s2" 
						: "s1 != s2");
		System.out.println(
				(s2.equals(s4) 
						? "s2 equals s4"
						: "s2 not equals s4"));
		System.out.println(
				(s2 == s4) 
						? "s2 == s4" 
						: "s2 != s4");
	}
}
