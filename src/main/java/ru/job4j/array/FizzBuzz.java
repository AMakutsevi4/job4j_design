package ru.job4j.array;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> array = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                array.add("FizzBuzz");
            } else if (i % 3 == 0) {
                array.add("Fizz");
            } else if (i % 5 == 0) {
                array.add("Buzz");
            } else {
                array.add(Integer.toString(i));
            }
        }
       return array;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }
}
