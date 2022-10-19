package ru.job4j.condition;

public class Task28 {
    public static void isEnough(int pupils, int desks) {

        System.out.println((pupils / 2) <= desks
                ? "Да" : "Нет");
    }
}
