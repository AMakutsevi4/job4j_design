package ru.job4j.cycle;

public class Task97 {
    public static void loop(int[] num) {
        int rsl = 500;
        int index = 0;
        for (int i = 0; i < num.length; i++) {
            if (rsl > num[i]) {
                rsl = num[i];
                index = i;
            }
        }
        System.out.println("Время: " + rsl + ", номер: " + index);
    }
}
