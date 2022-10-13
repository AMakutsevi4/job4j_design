package ru.job4j.type;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit = input.nextDouble();
        double celsius = 5 * (fahrenheit - 32) / 9;
        System.out.printf("%.1f", celsius);
    }
}