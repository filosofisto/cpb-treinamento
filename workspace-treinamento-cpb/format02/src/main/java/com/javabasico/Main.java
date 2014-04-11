package com.javabasico;

import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.System.out;

public class Main {

	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat fd = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat fh = new SimpleDateFormat("hh:mm:ss a");
		
		out.println(now.toString());
		out.println(fd.format(now));
		out.println(fh.format(now));
	}

}
