package ru.job4j.cycle;

public class Task94 {
    public static void loop(int[] diameter, int[] weight) {
        StringBuilder q = new StringBuilder();
        for (int i = 0; i < diameter.length; i++) {
            if (diameter[i] <= 26 && diameter[i] >= 22
                    && weight[i] >= 71 && weight[i] <= 77) {
                q.append("Да").append(",").append(" ");
            } else {
                q.append("Нет").append(",").append(" ");
            }
        }
        q.deleteCharAt(q.length() - 1);
        q.deleteCharAt(q.length() - 1);
        System.out.println(q);
    }
}