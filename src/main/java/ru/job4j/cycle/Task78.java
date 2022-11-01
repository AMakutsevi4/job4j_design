package ru.job4j.cycle;

public class Task78 {
    public static void loop(int[] days, int[] values) {
        int x = 0;
        int y = 0;
        for (int value : values) {
            if (value > 5) {
                x++;
            }
        }
        for (int i = 0; i < days.length; i++) {
            if (days[i] == 2 && values[i] < 6) {
                y++;
            }
        }
        System.out.println("Опасно: " + x + ", спокойный вторник: " + y);
    }
}

