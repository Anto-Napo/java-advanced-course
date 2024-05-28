package com.anto;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        //? Annotations are metadata, they give some data about a variable, a function etc...
        //? It should always be placed on top of the element. It begins with a '@'

        @SuppressWarnings("unused") //? Here, it removes the warning for something
        int age = 50;

        Cat myCat = new Cat("Stella");
        if(myCat.getClass().isAnnotationPresent(VeryImportant.class)) { //? To check if an annotation is present on an element
            System.out.println("The class is important");
        } else {
            System.out.println("The class isn't important");
        }

        for (Method method : myCat.getClass().getDeclaredMethods()) { //? Example of use with custom
            if(method.isAnnotationPresent(VeryImportant.class)) {
                try {
                    method.invoke(myCat);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        for (Method method : myCat.getClass().getDeclaredMethods()) { //? Example of use with parameters
            if(method.isAnnotationPresent(RunMultiple.class)) {
                try {
                    RunMultiple annotation = method.getAnnotation(RunMultiple.class);
                    for(int i = 0; i < annotation.times(); i++) {
                        method.invoke(myCat);
                    }
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        for(Field field : myCat.getClass().getDeclaredFields()) { //? Example of use with fields
            if(field.isAnnotationPresent(ImportantString.class)) {
                try {
                    Object objectValue = field.get(myCat);
                    if(objectValue instanceof String stringValue) { //? Will convert the object to String
                        System.out.println(stringValue.toUpperCase());
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}