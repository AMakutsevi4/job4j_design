package ru.job4j.condition;

public class Task57 {
    public static void triangleType(int a, int b) {
        int c = 180 - a - b;

        if (a < 90 && b < 90 && c < 90 && a != b && b != c && a != c) {
            System.out.println("Остроугольный");
        }
        if (a == 90 || b == 90 || c == 90) {
            System.out.println("Прямоугольный");
        }
        if (a > 90 && a + b < 180 || b > 90 && b + c < 180 || c > 90 && a + c < 180) {
            System.out.println("Тупоугольный");
        }
        if (a == b || a == c || b == c) {
            System.out.println("Равнобедренный");
        }
        if (a == 60 && b == 60 && c == 60) {
            System.out.println("Равносторонний");
        }
        if (a + b > 180 || c + a > 180 || b + c > 180) {
            System.out.println("Ошибка");
        }
    }
}
