package com.javabasico;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Quality {

	enum Level { BAD, INDIFFERENT, GOOD }
	
	Level value() default Level.INDIFFERENT;
}
