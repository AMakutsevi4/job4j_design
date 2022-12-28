package ru.job4j.condition;

public class Task59 {
    public static void getLinearEquation(int a, int b) {
        double x;
        if (a == 0 && b == 0) {
            System.out.println("Бесконечное множество");
        } else if (a == 0) {
            System.out.println("Нет решения");
        } else {
            System.out.println((double) -b / a);
        }
    }
}