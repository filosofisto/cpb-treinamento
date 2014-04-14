package com.javabasico.action;

import com.javabasico.framework.Action;

public class HelloAction implements Action {

	@Override
	public void execute() {
		System.out.println("Hello");
	}

}
