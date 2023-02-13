package ru.job4j.condition;

public class Task158 {
    public static void loop(int num) {
        String rsl = "Нет";
        for (int i = 1; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                if (Math.pow(i, 2) + Math.pow(j, 2) == num) {
                    rsl = "Да";
                    break;
                }
            }
        }
        System.out.println(rsl);
    }
}