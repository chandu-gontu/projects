package com.collection;

import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyAnnotation{
	String value() default "Verizon";
	int count() default 999;
}

