package ru.job4j.cycle;

public class Task62 {
    public static void loop(int amount, int[] grades) {
        int count = 0;
        for (int i : grades) {
            if (i > 0 && i <= 2) {
                count++;
            }
        }
        if (count >= (amount / 2) + 1) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
