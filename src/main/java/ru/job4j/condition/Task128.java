package ru.job4j.condition;

public class Task128 {
    public static void loop(int num) {
        var count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        System.out.println(count);
    }
}
