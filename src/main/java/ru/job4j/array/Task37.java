package ru.job4j.array;

public class Task37 {
    public static void leftShift(int number) {
        int num2 = number % 100 / 10;
        int num3 = number % 10;
        if (num2 == 0 && num3 == 0) {
            System.out.println(0);
        }
        if (num2 != 0) {
            System.out.println(String.valueOf(num2) + num3 + 0);
        }
        if (num2 == 0 && num3 != 0) {
            System.out.println(num3 + "" + 0);
        }
    }
}
