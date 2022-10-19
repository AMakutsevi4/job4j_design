package ru.job4j.condition;

public class Task21 {
    public static void signCheck(int number1, int number2) {
        if (number1 == 0 || number2 == 0) {
            System.out.println("Некорректно");
        } else if (number1 > 0 && number2 > 0 || number1 < 0 && number2 < 0) {
            System.out.println("Одинаковые");
        } else {
            System.out.println("Разные");
        }
    }
}