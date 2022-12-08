package ru.job4j.condition;

public class Task38 {
    public static void maxDigit(int number) {
        if (number / 10 > number % 10) {
            System.out.println(number / 10);
        } else if (number / 10 < number % 10) {
            System.out.println(number % 10);
        } else {
            System.out.println("Равны");
        }
    }
}
