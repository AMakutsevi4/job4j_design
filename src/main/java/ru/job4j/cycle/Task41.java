package ru.job4j.cycle;

public class Task41 {
    public static void loop() {
        int[] rsl = new int[5];
        int count = 0;
        StringBuilder s = new StringBuilder();
        for (int j = 0; j <= 5; j++) {
            for (int i = 20; i <= 35; i++) {
                boolean one = (i % 10) % 3 == j;
                boolean two = (i % 100 / 10) % 3 == j;
                if (one && two) {
                    rsl[count++] = i;
                }
            }
        }

        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < rsl.length - 1; i++) {
                if (rsl[i] > rsl[i + 1]) {
                    isSorted = false;

                    buf = rsl[i];
                    rsl[i] = rsl[i + 1];
                    rsl[i + 1] = buf;
                }
            }

        }

        for (int j : rsl) {
            s.append(j).append(" ");
        }
        s.deleteCharAt(s.length() - 1);
        System.out.println(s);
    }
}
