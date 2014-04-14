package com.javabasico;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import static java.lang.System.out;

public class Main {

	public static void main(String[] args) {
		NumberFormat fbr = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		NumberFormat fus = NumberFormat.getCurrencyInstance(Locale.US);
		
		Double valor = 10575.459543;
		
		out.println(fbr.format(valor));
		out.println(fus.format(valor));
		
		try {
			NumberFormat converter = NumberFormat.getInstance(
					Locale.US);
			
			String strValor = "xxxx";
			Number v2 = converter.parse(strValor);
			
			out.printf("Valor: %f\n", v2);
			out.println("Conversao ok");
		} catch (ParseException e) {
			out.println("Erro ao converter para numero");
		} 
	}

}
