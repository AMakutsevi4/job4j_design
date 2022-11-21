package ru.job4j.cycle;

public class Task118 {
    public static void loop(int num) {
        int index = 0;
        int sum = 0;
        int count = 0;
        int[] rsl = new int[String.valueOf(num).length()];
        while (num > 0) {
            rsl[index++] = num % 10;
            num = num / 10;
        }
        for (int q : rsl) {
            if (q % 2 == 0) {
                count++;
            } else {
                sum += q;
            }
        }
        System.out.println("Количество чет: " + count + ", сумма нечет: " + sum);
    }
}
