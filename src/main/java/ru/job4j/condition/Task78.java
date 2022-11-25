package ru.job4j.condition;

import java.util.StringJoiner;

public class Task78 {
    public static void divWithoutRemainder(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        if (num / 100 > 0 && num % (num / 100) == 0) {
            joiner.add(String.valueOf(num / 100));
        }
        if (num / 10 % 10 > 0 && num % (num / 10 % 10) == 0) {
            joiner.add(String.valueOf(num / 100 % 10));
        }
        if (num % 10 > 0 && num % (num % 10) == 0) {
            joiner.add(String.valueOf(num % 10));
        }
        System.out.println(joiner.length() > 0 ? joiner : "Таких чисел нет");
    }
}
