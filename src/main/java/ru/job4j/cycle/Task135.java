package ru.job4j.cycle;

public class Task135 {
    public static void loop(int num) {
        StringBuilder q = new StringBuilder();
        while (num > 0) {
            if (num % 10 != 0) {
                q.append(num % 10);
            }
            num = num / 10;
        }
        System.out.println(q);
    }
}