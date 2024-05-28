package com.anto;

@VeryImportant //! Custom annotation
public class Cat {
    @ImportantString
    String name;
    int age;

    public Cat(String name) {
        this.name = name;
    }

    @RunImmediately
    public void meow() {
        System.out.println("Meow");
    }

    @RunMultiple(times = 3) //! Parameters
    public void eat() {
        System.out.println("Munch");
    }
}
