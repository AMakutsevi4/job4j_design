package ru.job4j.condition;

public class Task58 {
    public static void isWinning(int number) {
        int[] test = new int[6];
        int one = 0;
        int two = 0;
        int index = 0;
        while (number != 0) {
            test[index++] = number % 10;
            number /= 10;
        }
        for (int i = 0; i < 3; i++) {
            one += test[i];
        }
        for (int i = 3; i < test.length; i++) {
            two += test[i];
        }
        System.out.println(one == two ? "Да" : "Нет");
    }
}

