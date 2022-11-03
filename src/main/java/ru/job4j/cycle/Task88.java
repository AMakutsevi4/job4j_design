package ru.job4j.cycle;

public class Task88 {
    public static void loop() {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int one = i / 10;
            int two = i % 10;
            if (3 * one + two == i) {
                count++;
                if (count == 1) {
                    System.out.print("Числа: " + i);
                } else {
                    System.out.print(" " + i);
                }
            }
        }
        System.out.println(", Количество: " + count);
    }
}
