package ru.job4j.cycle;

public class Task91 {
    public static void loop(int n1, int n2, int n3) {
        int count = 1;
        int index = n3 - n2;
        StringBuilder q = new StringBuilder();
        if (n1 - n2 != n2 - n3) {
            System.out.println("Нет");
        } else {
            while (count < 4) {
                if (n1 - n2 == n2 - n3) {
                    q.append(n3 + index * count).append(" ");
                    count++;
                }
            }
            q.deleteCharAt(q.length() - 1);
            System.out.println(q);
        }
    }
}