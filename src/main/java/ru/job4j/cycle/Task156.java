package ru.job4j.cycle;

public class Task156 {
    public static void loop(int num) {
        StringBuilder q = new StringBuilder();
        int count = 1;
        while (count <= num) {
            for (int i = 1; i <= num; i++) {
                if (count % i == 0) {
                    q.append('+');
                }
            }
            System.out.println(count + "" + q);
            count++;
            q.delete(0, q.length());
        }
    }
}