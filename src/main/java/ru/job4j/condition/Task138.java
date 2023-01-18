package ru.job4j.condition;

public class Task138 {
    public static void loop() {
        int index = 10;
        int rsl = 0;
        while (index < 99) {
         if (index % (index % 10 + index / 10) == 0) {
                rsl = index;
            }
            index++;
        }
        System.out.println(rsl);
    }
}
