package ru.job4j.condition;

public class Task168 {
    public static void loop(int num1, int num2, int num3) {
        sumDigit(num1);
        divided(num1);
        sumDigit(num2);
        divided(num2);
        sumDigit(num3);
        divided(num3);
        sumAllDigits(num1, num2, num3);
    }

    public static void sumDigit(int x) {
        int rsl1 = 0;
        int sum = 0;
        if (x < 10) {
            rsl1 = 1;
            sum = x;
        } else {
            while (x > 0) {
                sum += x % 10;
                x = x / 10;
                rsl1++;
            }
        }
        System.out.printf("Цифр: %d, сумма цифр: %d, ", rsl1, sum);
    }

    public static void divided(int r) {
        int divided = 0;
        if (r < 10) {
            divided = 2;
        } else {
            for (int i = 1; i <= r; i++) {
                if (r % i == 0) {
                    divided++;
                }
            }
        }
        System.out.printf("делителей: %d%n", divided);
    }

    public static void sumAllDigits(int a, int b, int c) {
        int sumAll = 0;
        int[] array = {a, b, c};
        for (int e : array) {
            if (e < 10) {
                sumAll += e;
            } else {
                while (e > 0) {
                    sumAll += e % 10;
                    e = e / 10;
                }
            }
        }
        System.out.printf("Сумма всех цифр: %d%n", sumAll);
    }
}