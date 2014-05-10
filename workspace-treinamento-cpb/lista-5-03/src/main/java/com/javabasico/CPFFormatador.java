package com.javabasico;

public class CPFFormatador implements Formatador<String> {

	@Override
	public String format(String objeto) {
		if (objeto != null) {
			return objeto.substring(0,3)
					+ "." 
					+ objeto.substring(3,6)
					+ "." 
					+ objeto.substring(6,9)
					+ "-"
					+ objeto.substring(9);
		}
		return null;
	}

}
