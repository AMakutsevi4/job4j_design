package ru.job4j.cycle;

public class Task76 {
    public static void loop(int num1, int num2) {
        int count = 0;
        for (int i = 2; i < num1; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                count++;
            }
        }
        System.out.println(count % 2 == 0 ? "Да" : "Нет");
    }
}
