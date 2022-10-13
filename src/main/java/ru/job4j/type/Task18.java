package ru.job4j.type;

import java.util.Scanner;

public class Task18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double r = input.nextDouble();
        // периметр квадрата
        System.out.println(a * 4);
        // длина окружности
        double circumference = Math.PI * 2 * r;
        System.out.println(String.format("%.1f", circumference));
        // площадь круга
        double area = Math.PI * (r * r);
        System.out.println(String.format("%.1f", area));
    }
}
