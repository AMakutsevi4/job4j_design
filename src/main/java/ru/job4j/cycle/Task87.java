package ru.job4j.cycle;

public class Task87 {
    public static void loop() {
        int i = 10;
        while (i++ != 70) {
            if (Math.pow((i / 10 + i % 10), 3.0) == Math.pow(i, 2)) {
                System.out.println(i);
            }
        }
    }
}
