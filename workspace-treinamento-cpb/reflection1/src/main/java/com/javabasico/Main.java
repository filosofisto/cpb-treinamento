package com.javabasico;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		//Pessoa p = new Pessoa();
		//Class c = p.getClass();
		
		//String s = "sou um objeto";
		Object b = new Object();
		Class c = b.getClass();
		
		System.out.printf("Nome: %s\nNome simples: %s\n", 
				c.getName(), c.getSimpleName());
		
		Field[] fields = c.getDeclaredFields();
		for (Field f: fields) {
			System.out.printf("%s: %s\n", f.getName(), f.getType().getSimpleName());
		}
		
		Constructor[] constructors = c.getConstructors();
		System.out.println("Construtores ==================== " 
				+ constructors.length);
		for (Constructor constr: constructors) {
			for (Class paramClass: constr.getParameterTypes()) {
				System.out.printf("%s, ", paramClass.getName());
			}
			System.out.println();
		}
		
		Method[] methods = c.getDeclaredMethods();
		System.out.println("Metodos ==================== " 
				+ methods.length);
		
		for (Method m: methods) {
			System.out.printf("%s %s\n", 
					m.getReturnType().getName(), m.getName());
			
			if (m.getName().equals("length")) {
				try {
					Integer tamanho = (Integer) m.invoke(b);
					System.out.printf("%d\n", tamanho);
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
		
		//System.out.printf("Superclass: %s\n", c.getSuperclass().getName());
		
		Class[] interfaces = c.getInterfaces();
		System.out.println("Interfaces ================== "
				+ interfaces.length);
		for (Class intf: interfaces) {
			System.out.printf("%s ", intf.getSimpleName());
		}
	}
}
