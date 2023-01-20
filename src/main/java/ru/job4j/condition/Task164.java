package ru.job4j.condition;

public class Task164 {
    public static void loop() {
        int index = 10;
        while (Math.pow(index, 2) < 289) {
            System.out.printf("%d ", index++);
        }
        System.out.println(index);
    }
}