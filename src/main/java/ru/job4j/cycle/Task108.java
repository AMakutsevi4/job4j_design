package ru.job4j.cycle;

public class Task108 {
    public static void loop(int[] nums) {
        int count = 0;
        for (int e : nums) {
            if (e == 999) {
                break;
            } else {
                System.out.println(e);
                count += e;
            }
        }
        System.out.println("Сумма: " + count);
    }
}
