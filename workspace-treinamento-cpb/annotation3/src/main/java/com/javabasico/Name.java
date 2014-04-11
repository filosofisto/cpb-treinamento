package com.javabasico;

import java.lang.annotation.Target;

@Target({})
public @interface Name {

	String first();
	String last();
}
