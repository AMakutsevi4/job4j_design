package ru.job4j.condition;

public class Task54 {
    public static void transform(int number) {
        System.out.println(check(number));

    }

    public static int check(int n) {
        int rsl = 0;
        int num1 = n / 100;
        int num2 = n / 10 % 10;
        int num3 = n % 10;
        if (n % 2 == 0) {
            if (num1 == 9) {
                return num1;
            } else if (num1 % 2 == 0 && num1 > 0 && num1 < 9) {
                num1 += 1;
            } else {
                num1 -= 1;
            }
        }
        return num1;
    }
}

