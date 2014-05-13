package com.javabasico;


public class Main {

	public static void main(String[] args) {
		Action action = new ExceptionAction( 
				//new LogAction(
						new ActionImpl()
				//)
		);
		action.action();
	}
}
