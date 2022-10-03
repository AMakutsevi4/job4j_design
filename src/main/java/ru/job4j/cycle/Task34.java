package ru.job4j.cycle;

public class Task34 {
    public static void loop(int num) {
        StringBuilder q = new StringBuilder();
        int count = 0;
        for (int i = num + 1; i < 1000; i++) {
            if (count != 5 && i % 2 != 0) {
                count++;
                q.append(i).append(" ");
            }
        }
        q.deleteCharAt(q.length() - 1);
        System.out.println(q);
    }

}


