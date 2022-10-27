package ru.job4j.cycle;

public class Task39 {
    public static void loop() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 200; i <= 210; i++) {
            int sum = i % 10 + i % 100 / 10 + i % 1000 / 100;
            if (i % sum == 0) {
                stringBuilder.append(i).append(" ");
            }
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        System.out.println(stringBuilder);
    }
}