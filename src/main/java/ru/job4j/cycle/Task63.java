package ru.job4j.cycle;

public class Task63 {
    public static void loop(int[] answers) {
        int count = 0;
        for (int i : answers) {
            if (i == 1) {
                count++;
            }
        }
        if (count > answers.length / 2) {
            System.out.println(count + ", Да");
        } else {
            System.out.println(count + ", Нет");
        }
    }
}

