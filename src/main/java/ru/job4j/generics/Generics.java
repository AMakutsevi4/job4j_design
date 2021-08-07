package ru.job4j.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        Generics gen = new Generics();
        List<Object> first = new ArrayList<>();
        List<Object> second = new ArrayList<>();
        List<Object> third = new ArrayList<>();
        first.add(new Animal());
        second.add(new Predator());
        third.add(new Tiger());

        gen.printObject(first);
        gen.printObject(second);
        gen.printObject(third);
        System.out.println();

        gen.printBoundedWildCard(first);
        gen.printBoundedWildCard(second);
        gen.printBoundedWildCard(third);
        System.out.println();

        gen.printLowerBoundedWildCard(first);
        gen.printLowerBoundedWildCard(second);
        gen.printLowerBoundedWildCard(third);
    }

    public void printObject(List<Object> list) {
        for (Object next : list) {
            System.out.println("Текущий элемент: " + next);
        }
    }

    public void printBoundedWildCard(List<?> list) {
        for (Object next : list) {
            System.out.println("Текущий элемент: " + next);
        }
    }

    public void printLowerBoundedWildCard(List<? super Object> list) {
        for (Object next : list) {
            System.out.println("Текущий элемент: " + next);
        }
    }
}

class Animal {
}

class Predator {
}

class Tiger {
}