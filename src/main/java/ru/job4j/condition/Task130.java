package ru.job4j.condition;

public class Task130 {
    public static void loop(int num) {
        int count = 0;
        while (num != 0) {
            if (num % 10 == 0) {
                count++;
            }
            num /= 10;
        }
        System.out.println(count);
    }
}