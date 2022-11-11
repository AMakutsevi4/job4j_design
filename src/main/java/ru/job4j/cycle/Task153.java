package ru.job4j.cycle;

public class Task153 {
    public static void loop() {
        int bull = 0;
        int cow = 20;
        while (bull != 20 && cow != -2) {
            System.out.println("Быков: " + bull++ + ", коров: " + cow);
            cow = cow - 2;
        }
    }
}
