package ru.job4j.condition;

public class Task79 {
    public static void getCentury(int num) {
        if (num < 1500 || num > 2000) {
            System.out.println("Не попадает в диапазон");
        } else {
            System.out.println(num / 100 + (num % 10 > 0 ? 1 : 0));
        }
    }
}
