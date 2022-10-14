package ru.job4j.array;

public class Task17 {
    public static void calculate(int base, int height) {
        double area = 0.5 * base * height;
        double perimeter = 2 * (base + height);
        System.out.printf("%.1f%n%.1f", area, perimeter);
    }
}