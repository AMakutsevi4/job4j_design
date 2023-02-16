package ru.job4j.array;

import java.util.StringJoiner;

public class Task57 {

     public static void triangleType(int a, int b) {
        StringJoiner joiner = new StringJoiner(" ");
        int c = 180 - a - b;

        if (a < 90 && b < 90 && c < 90) {
            joiner.add("Остроугольный");
        }
        if (a == 90 || b == 90 || c == 90) {
            joiner.add("Прямоугольный");
        }
        if ((a > 90 || b > 90 || c > 90) && c > 0) {
            joiner.add("Тупоугольный");
        }
        if (a == b || b == c || c == a) {
            joiner.add("Равнобедренный");
        }
        if (b == c && c == a) {
            joiner.add("Равносторонний");
        }
        if (a + b > 180 || c + a > 180 || b + c > 180) {
            joiner.add("Ошибка");
        }
        System.out.println(joiner);
    }
}
