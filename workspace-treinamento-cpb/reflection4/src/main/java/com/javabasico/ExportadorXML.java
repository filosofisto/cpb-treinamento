package com.javabasico;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class ExportadorXML {

	public String exportar(List<?> list, String rootElement) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		StringBuilder buf = new StringBuilder();
		buf.append("<?xml version=\"1.0\"?>\n");
		
		buf.append(
			"<" + rootElement + ">\n"
		);
		
		for (Object obj: list) {
			buf.append(exportarObj(obj) + "\n");
		}
		
		buf.append(
			"</" + rootElement + ">\n"
		);
		
		return buf.toString();
	}
	
	private String exportarObj(Object obj) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		StringBuilder buf = new StringBuilder();
		
		Class cls = obj.getClass();
		
		buf.append(
			"\t<" + cls.getSimpleName().toLowerCase() + ">\n"
		);
		
		Field[] fields = cls.getDeclaredFields();
		
		for (Field field: fields) {
			buf.append("\t\t<" + field.getName() + ">");
			
			Method getter = getter(cls, field);
			Object value = getter.invoke(obj);
			
			if (value != null) {
				buf.append(value);
			}
			
			buf.append("</" + field.getName() + ">\n");
		}
		
		buf.append(
			"\t</" + cls.getSimpleName().toLowerCase() + ">"
		);
		
		return buf.toString();
	}
	
	public String exportar(Object obj) 
			throws IllegalArgumentException, IllegalAccessException, NoSuchMethodException, SecurityException, InvocationTargetException {
		StringBuilder buf = new StringBuilder();
		buf.append("<?xml version=\"1.0\"?>\n");
		
		Class cls = obj.getClass();
		
		buf.append(
			"<" + cls.getSimpleName().toLowerCase() + ">\n"
		);
		
		Field[] fields = cls.getDeclaredFields();
		
		for (Field field: fields) {
			buf.append("\t<" + field.getName() + ">");
			
			Method getter = getter(cls, field);
			Object value = getter.invoke(obj);
			
			if (value != null) {
				buf.append(value);
			}
			
			buf.append("</" + field.getName() + ">\n");
		}
		
		buf.append(
			"</" + cls.getSimpleName().toLowerCase() + ">"
		);
		
		return buf.toString();
	}
	
	private Method getter(Class cls, Field field) 
			throws NoSuchMethodException, SecurityException {
		return cls.getMethod(
				"get"
				+ field.getName().substring(0,1).toUpperCase()
				+ field.getName().substring(1));
	}
}
