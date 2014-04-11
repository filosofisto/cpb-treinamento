package com.javabasico;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target((ElementType.TYPE))
public @interface RequestForEnhancement {
	int id(); // Unique ID number associated with RFE
	String synopsis(); // Synopsis of RFE
	String engineer() default "automatic"; // Name of engineer who implemented RFE
	String date() default "unimplemented"; // Date RFE was implemented
}
