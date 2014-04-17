package com.javabasico;

import static java.lang.System.out;

/**
 * Enum
 * @author eduardo
 *
 */
public class Main {
	
	public static void showDay(Day day) {
		switch (day.value()) {
		case 0:
			out.print("Pena que esta acabando");
			break;
		case 1:
			out.print("Bora outra vez");
			break;
		case 2:
			out.print("Pegando velocidade");
			break;
		case 3:
			out.print("Auge do ritmo");
			break;
		case 4:
			out.print("Cansado...ufa");
			break;
		case 5:
			out.print("Ta acabando, oba");
			break;
		case 6:
			out.print("Que maravilha!!!");
			break;
		default:
			out.print("#*$T%#^%$#@*$^#$(*#*$");
			break;
		}
	}

	public static void main(String[] args) {
		showDay(Day.FRIDAY);
	}
}
