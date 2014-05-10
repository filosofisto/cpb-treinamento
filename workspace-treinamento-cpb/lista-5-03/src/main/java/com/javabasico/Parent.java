package com.javabasico;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Parent {

	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder();
		
		Field[] fields = getClass().getDeclaredFields();
		for (Field field: fields) {
			ToString toString = field.getAnnotation(ToString.class);
			if (toString != null) {
				try {
					Method getter = getter(getClass(), field);
					Object obj = getter.invoke(this);
					Formatador f = (Formatador) 
							toString.formatador().newInstance();
					String str = f.format(obj);
					if (str != null) {
						buf.append("[" + field.getName() + ": " + str + "] ");
					}
					
				} catch (NoSuchMethodException e) {
					
				} catch (SecurityException e) {
					
				} catch (IllegalAccessException e) {

				} catch (IllegalArgumentException e) {

				} catch (InvocationTargetException e) {

				} catch (InstantiationException e) {

				}
			}
		}
		
		return buf.toString();
	}
	
	private Method getter(Class type, Field field) 
			throws NoSuchMethodException, SecurityException {
		return type.getDeclaredMethod("get" 
				+ field.getName().substring(0,1).toUpperCase()
				+ field.getName().substring(1));
	}
}
