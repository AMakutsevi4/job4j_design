package ru.job4j.cycle;

public class Task73 {
    public static void loop(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum +=i;
            }
        }
        System.out.println(num == sum ? "Да": "Нет");

    }
}