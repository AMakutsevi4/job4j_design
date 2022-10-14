package ru.job4j.array;

public class Task24 {
    public static void separate(int number) {
        int num1, num2;
        num2 = number % 10;
        num1 = number - num2;
        System.out.println(num1  + "+" + num2);
    }
}
