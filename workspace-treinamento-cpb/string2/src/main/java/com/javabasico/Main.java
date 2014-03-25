package com.javabasico;

public class Main {

	public static void main(String[] args) {
		//NullPointerException
		/*Object x = null;
		System.out.println(x.hashCode());*/
		
		String s1 = null;
		if ("Teste".equals(s1)) {
		//if (s1.equals("Teste")) {
			System.out.println("Igual");
		} else {
			System.out.println("Diferente");
		}
		
		System.out.println("Tamanho de Brasil: " 
				+ ("Brasil".length()));
		
		String s2 = "Java";
		for (int i=0; i < s2.length(); i++) {
			System.out.println(s2.charAt(i));
		}
		System.out.println("Ultimo: " 
				+ s2.charAt(s2.length()-1));
		
		String s3 = "java";
		if (s2.equals(s3)) {
			System.out.println(s2 + " equals " + s3);
		} else {
			System.out.println(s2 + " not equals " + s3);
		}
		
		if (s2.equalsIgnoreCase(s3)) {
			System.out.println(s2 + " equalsIgnoreCase " + s3);
		} else {
			System.out.println(s2 + " not equalsIgnoreCase " + s3);
		}
		
		String s4 = s2.concat(" eh uma grande linguagem");
		System.out.println(s4);
		
		if (s4.endsWith("linguagem")) {
			System.out.println("Termina com linguagem");
		}
		if (s4.startsWith("Java")) {
			System.out.println("Inicia com Java");
		}
		
		//Java eh uma grande linguagem
		System.out.println(s4.indexOf("grande"));
		System.out.println(s4.indexOf("xpto"));
		
		for (byte b: s4.getBytes()) {
			System.out.println(b);
		}
		
		String s5 = "";
		if (s5.isEmpty()) {
			System.out.println("s5 vazia");
		}
		
		String s6 = "O Brazil eh bom e os brazileiros tambem. zico joga muito";
		String s7 = s6.replaceAll("Braz", "Bras").replaceAll("braz", "bras");
		System.out.println(s7);
		
		String[] palavras = s7.split(" ");
		for (String s: palavras) {
			System.out.println(s);
		}
		
		System.out.println(s7.toUpperCase());
		System.out.println(s7.toLowerCase());
		
		float f = -12;
		//ERRO->Math m = new Math();
		System.out.println(Math.abs(f));
		
		String s8 = "Qualquer";
		//INCORRETO->System.out.println(s8.valueOf(f));
		System.out.println(String.valueOf(f));
	}
}
















