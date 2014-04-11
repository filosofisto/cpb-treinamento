package com.x25.logicajava;

import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		try {
			Class classPessoa = Class.forName("com.x25.logicajava.Pessoa");
			Object obj = classPessoa.newInstance();
			
			Method set = classPessoa.getMethod("setNome", String.class);
			set.invoke(obj, "Fulano");
			
			Method get = classPessoa.getMethod("getNome");
			Object resGet = get.invoke(obj);
			
			System.out.println(resGet);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
