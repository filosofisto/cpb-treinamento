package com.javabasico;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface PrettyPrinter {

	Class<? extends Formatter> value();
}
