package ru.job4j.condition;

public class Task41 {
    public static void evenDigitsAmount(int number) {
        int count = 0;
        while (number != 0) {
            if (number % 2 == 0) {
                count++;
            }
            number = number / 10;
        }
        System.out.println(count);
    }
}
