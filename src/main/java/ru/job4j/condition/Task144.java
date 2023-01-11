package ru.job4j.condition;

public class Task144 {
    public static void loop(int num1, int num2) {
        int rsl = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                rsl = i;
            }
        }
        System.out.println(rsl);
    }
}