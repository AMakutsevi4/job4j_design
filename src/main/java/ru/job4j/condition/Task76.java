package ru.job4j.condition;

public class Task76 {
    public static void sameNumAmount(int num) {
        int count = 0;
        int one = num / 100;
        int two = num / 10 % 10;
        int three = num % 10;
        if (one == two) {
            count++;
        }
        if (one == three) {
            count++;
        }
        if (two == three) {
            count++;
        }
        if (count == 0) {
            System.out.println(1);
        }
        if (count == 1) {
            System.out.println(2);
        }
        if (count == 3) {
            System.out.println(3);
        }
    }
}
