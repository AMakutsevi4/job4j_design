package ru.job4j.condition;

import java.util.StringJoiner;

public class Task165 {
    public static void loop(int num) {
        for (int i = 2; i <= num; i++) {

            for (int j = 2; j <= i; j++) {

                if (j < i && i % j == 0) {
                    break;
                }
                if (i % j == 0 && i % num == 0) {
                    System.out.println(i + " - простое число");
                }
            }
        }

    }
}