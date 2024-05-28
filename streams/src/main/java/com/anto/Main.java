package com.anto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<People> people = new ArrayList<>();

        people.add(new People("John", 120));
        people.add(new People("Anto", 150));
        people.add(new People("Mark", 50));
        people.add(new People("Jack", 100));

        //? Better way to do it
        List<People> hundredClub = people.stream()
                .filter(person -> person.getBillions() >= 100)
                .toList();

        List<People> sortedNames = people.stream()
                .sorted(Comparator.comparing(person -> person.getName()))
                .toList();

        List<People> sortedHundredClub = people.stream()
                .filter(person -> person.getBillions() >= 100)
                .sorted(Comparator.comparing(person -> person.getName()))
                .toList();

        //? Basic way to do it
        /*
        List<People> hundredClub = new ArrayList<>();

        for(People p : people) {
            if(p.getBillions() >= 100) {
                hundredClub.add(p);
            }
        }
        */

        hundredClub.forEach(person -> System.out.println(person.getName()));
        System.out.println('\n');
        sortedNames.forEach(person -> System.out.println(person.getName()));
        System.out.println('\n');
        sortedHundredClub.forEach(person -> System.out.println(person.getName()));
    }
}