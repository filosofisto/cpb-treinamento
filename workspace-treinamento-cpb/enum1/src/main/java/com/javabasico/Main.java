package com.javabasico;

import static java.lang.System.out;

/**
 * Enum
 * @author eduardo
 *
 */
public class Main {
	
	public static void showDay(int day) {
		switch (day) {
		case Day.SUNDAY:
			out.print("Pena que esta acabando");
			break;
		case Day.MONDAY:
			out.print("Bora outra vez");
			break;
		case Day.TUESDAY:
			out.print("Pegando velocidade");
			break;
		case Day.WEDNESDAY:
			out.print("Auge do ritmo");
			break;
		case Day.THURSDAY:
			out.print("Cansado...ufa");
			break;
		case Day.FRIDAY:
			out.print("Ta acabando, oba");
			break;
		case Day.SATURDAY:
			out.print("Que maravilha!!!");
			break;
		default:
			out.print("#*$T%#^%$#@*$^#$(*#*$");
			break;
		}
	}

	public static void main(String[] args) {
		//showDay(Day.FRIDAY);
		
		//Problema
		showDay(5000);
	}

}
