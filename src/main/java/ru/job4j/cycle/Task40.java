package ru.job4j.cycle;

public class Task40 {
    public static void loop() {
       StringBuilder q = new StringBuilder();
       for (int i = 20; i < 40; i++) {
           int one = i % 10;
           int two = i % 100 / 10;
           if (one != 0 && one % 3 == 0 && two % 3 == 0) {
               q.append(i).append(" ");
           }
        }
       q.deleteCharAt(q.length() - 1);
        System.out.println(q);
    }
}
