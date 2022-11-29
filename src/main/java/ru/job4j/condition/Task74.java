package ru.job4j.condition;

public class Task74 {
    public static void innerNum(int num2, int num4) {
        int one = num4 / 1000;
        int two = num4 / 100 % 10;
        int three = num4 / 10 % 10;
        int four = num4 % 10;
        if (Integer.parseInt("" + one + two) == num2
                || Integer.parseInt("" + two + three) == num2
                || Integer.parseInt("" + three + four) == num2) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
