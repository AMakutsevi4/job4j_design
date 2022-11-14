package ru.job4j.cycle;

public class Task155 {
    public static void loop() {
        int count = 10;
        while (count <= 20) {
            int rsl = 0;
            for (int i = 1; i <= 10; i++) {
                if (count % i == 0 && count != i) {
                    rsl += i;
                }
            }
            System.out.println("Число: " + count + ", сумма делителей: " + rsl);
            count++;
      }
    }
}
