package ru.job4j.cycle;

public class Task68 {
    public static void loop(int num1, int num2) {
        int first = 0;
        int second = 0;
        for (int i = 1; i <= 10; i++) {
            if (num1 % i == 0) {
                first++;
            }
            if (num2 % i == 0) {
                second++;
            }
        }
        if (first == second) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}