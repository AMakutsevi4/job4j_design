package ru.job4j.condition;

public class Task55 {
    public static void apartmentPlace(int number) {
        int floor = number / 3;
        int room = number % 3;
        System.out.println(room == 0 ? floor + System.lineSeparator() + 3 : floor + 1 + System.lineSeparator() + room);

    }
}
