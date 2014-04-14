package com.javabasico.framework;

import java.util.List;

public class ListActionExecuter {

	public void execute(List<Action> list) {
		for (Action action: list) {
			action.execute();
		}
	}
}
