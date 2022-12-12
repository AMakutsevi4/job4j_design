package ru.job4j.condition;

public class Task45 {
    public static void changeToRoundNum(int number) {
        if (number % 10 == 0) {
            System.out.println("Увеличено до " + (number));
        } else {
            System.out.println(number % 2 == 0 ? "Увеличено до " + (number - number % 10 + 10) : "Уменьшено до " + (number - number % 10));
        }
    }
}
