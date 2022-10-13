package ru.job4j.type;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inches = input.nextInt();
        double centimeters = inches * 2.54;
        System.out.printf("%.2f", centimeters);
    }
}