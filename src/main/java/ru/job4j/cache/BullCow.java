package ru.job4j.cache;

public class BullCow {
    public static void loop() {
        int bull = 0;
        int cow = 22;
        while (bull != 20 && cow != 0) {
            System.out.printf("Быков: %d, коров: %d%n", bull++, cow -= 2);
        }
    }
}
