package ru.job4j.loop;

import java.util.Locale;

public class Task145 {
    public static void loop(int num1, double num2) {
        StringBuilder builder = new StringBuilder();
        int index = 0;
        double current = num1;
        while (current > num2) {
            current = Math.sqrt(current);
            if (current <= 1 + num2) {
                break;
            }
            builder.append(String.format(Locale.ENGLISH, "%.1f", current)).append(" ");
            index++;
        }
        builder.deleteCharAt(builder.length() - 1);
        System.out.println("Промежуточные: " + builder + ", Количество: " + index);
    }
}