package com.javabasico;

import static java.lang.System.out;

/**
 * Enum
 * @author eduardo
 *
 */
public class Main {

	public static void main(String[] args) {
		//---------------------------------------------------
		for (Day day: Day.values()) {
			out.printf("toString(): %s, name(): %s, ordinal(): %d\n", 
					day.toString(),
					day.name(),
					day.ordinal());
		}

		//----------------------------------------------------
		Day day = Day.FRIDAY;
		
		switch (day) {
		case SUNDAY:
			out.print("Pena que está acabando");
			break;
		case MONDAY:
			out.print("Bora outra vez");
			break;
		case TUESDAY:
			out.print("Pegando velocidade");
			break;
		case WEDNESDAY:
			out.print("Auge do ritmo");
			break;
		case THURSDAY:
			out.print("Cansado...ufa");
			break;
		case FRIDAY:
			out.print("Ta acabando, oba");
			break;
		case SATURDAY:
			out.print("Que maravilha!!!");
			break;
		default:
			break;
		}
		//-------------------------------------------
		Day newDay = Day.valueOf("SUNDAY");
		out.printf("newDay\ntoString(): %s, name(): %s, ordinal(): %d\n", 
				newDay.toString(),
				newDay.name(),
				newDay.ordinal());
	}

}
