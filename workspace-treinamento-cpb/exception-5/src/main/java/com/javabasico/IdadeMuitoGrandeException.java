package com.javabasico;

public class IdadeMuitoGrandeException extends Exception {

	private static final long serialVersionUID = 314073514866529462L;

	public IdadeMuitoGrandeException() {
		super("Data invalida");
	}

	public IdadeMuitoGrandeException(String message) {
		super(message);
	}

	public IdadeMuitoGrandeException(Throwable causa) {
		super(causa);
	}

	public IdadeMuitoGrandeException(String message, Throwable causa) {
		super(message, causa);
	}

}
