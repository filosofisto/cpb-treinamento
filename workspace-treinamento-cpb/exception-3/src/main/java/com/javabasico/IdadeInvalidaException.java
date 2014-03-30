package com.javabasico;

public class IdadeInvalidaException extends Exception {

	private static final long serialVersionUID = 314073514866529462L;

	public IdadeInvalidaException() {
		super("Idade invalida");
	}

	public IdadeInvalidaException(String message) {
		super(message);
	}

	public IdadeInvalidaException(Throwable causa) {
		super(causa);
	}

	public IdadeInvalidaException(String message, Throwable causa) {
		super(message, causa);
	}

}
