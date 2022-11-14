package ru.job4j.cycle;

public class Task154 {
    public static void loop() {
        int count = 10;
        StringBuilder q = new StringBuilder();
        while (count <= 20) {
            for (int i = 1; i <= 10; i++) {
                if (count % i == 0 && count != i) {
                    q.append(i).append(" ");
                }
            }
            q.deleteCharAt(q.length() - 1);
            System.out.println("Число: " + count + ", делители: " + q);
            count++;
            q.delete(0, q.length());
        }
    }
}