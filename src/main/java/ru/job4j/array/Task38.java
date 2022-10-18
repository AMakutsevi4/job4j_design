package ru.job4j.array;

public class Task38 {
    public static void leftShift(int number) {
        int num2, num3, num4;
            num2 = number % 1000 / 100;
        num3 = number % 100 / 10;
        num4 = number % 10;
        int rsl = Integer.parseInt("" + num2 + num3 + num4 + 0);
        System.out.println(rsl);
    }
}
