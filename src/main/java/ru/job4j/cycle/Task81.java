package ru.job4j.cycle;

public class Task81 {
    public static void loop(int num) {
        int one = num / 10;
        int twp = num % 10;
        int count = 0;
        for (int i = one; i <= twp; i++) {
            count += i;
        }
        System.out.println(count);
    }
}
