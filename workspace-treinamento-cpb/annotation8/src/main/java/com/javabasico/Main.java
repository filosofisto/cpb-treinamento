package com.javabasico;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"rawtypes", "serial"})
public class Main implements Serializable {

	public static void main(String[] args) {

	}

	public static List method() {
		return new ArrayList<String>();
	}
	
	public static List method2() {
		return new ArrayList<String>();
	}
	
	@Override
	public boolean equals(Object other) {
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	

}
