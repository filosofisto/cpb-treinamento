package com.javabasico;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatador implements Formatador<Date> {

	private SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
	
	@Override
	public String format(Date objeto) {
		if (objeto != null) {
			return f.format(objeto);
		}
		
		return null;
	}
}
