package com.javabasico;

public class IdadeNegativaException extends Exception {

	private static final long serialVersionUID = 314073514866529462L;

	public IdadeNegativaException() {
		super("Data invalida");
	}

	public IdadeNegativaException(String message) {
		super(message);
	}

	public IdadeNegativaException(Throwable causa) {
		super(causa);
	}

	public IdadeNegativaException(String message, Throwable causa) {
		super(message, causa);
	}

}
