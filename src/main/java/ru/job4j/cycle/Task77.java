package ru.job4j.cycle;

public class Task77 {
    public static void loop(int num1, int num2) {
        int count = 0;
        for (int i = 1; i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                count += i;
            }
        }
        System.out.println(count);
    }
}