package com.anto;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//* Type: class
@Target({ElementType.TYPE, ElementType.METHOD}) //? Specify the type of element you want to be able to put the annotation on
@Retention(RetentionPolicy.RUNTIME) //? Runtime: during code is processing / Source: before the code is processing / Class: during compilation
public @interface VeryImportant {
}

