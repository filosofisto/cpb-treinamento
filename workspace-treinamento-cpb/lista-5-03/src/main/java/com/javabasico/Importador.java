package com.javabasico;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Importador {
	
	private Field field;

	public List importar(
			File fileOrigem, 
			Class type, 
			String[] campos) 
			throws FileNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, ParseException {
		Scanner s = new Scanner(fileOrigem).useDelimiter("\n");
		String line;
		List list = new ArrayList();
		
		while (s.hasNext()) {
			line = s.nextLine();
			
			list.add(processar(type, campos, line));
		}
		
		return list;
	}
	
	private Object processar(Class type, String[] campos, String line) 
			throws InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException, InvocationTargetException, ParseException, NoSuchMethodException {
		Object instancia = type.newInstance();
		
		for (String campo: campos) {
			Field field = type.getDeclaredField(campo);
			Substring substring = field.getAnnotation(Substring.class);
			if (substring != null) {
				String valor = line.substring(substring.inicio(), substring.fim());
				Object valorObj = converter(valor, field.getType());
				Method setter = setter(type, field);
				
				setter.invoke(instancia, valorObj);
			}
		}
		
		return instancia;
	}

	private Method setter(Class type, java.lang.reflect.Field field) throws NoSuchMethodException, SecurityException {
		return type.getDeclaredMethod("set" 
				+ field.getName().substring(0,1).toUpperCase()
				+ field.getName().substring(1), field.getType());
	}

	private Object converter(String valor, Class<?> type) throws ParseException {
		if (type == String.class) {
			return valor;
		} else if (type == Float.class) {
			return Float.parseFloat(valor);
		} else if (type == Integer.class) {
			return Integer.parseInt(valor);
		} else if (type == Date.class) {
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			return format.parse(valor);
		} else if (type == Boolean.class) {
			return Boolean.parseBoolean(valor);
		} else {
			throw new RuntimeException("Nao sei o que fazer, fica pra proxima versao. A pizza ja chegou");
		}
	}
}
