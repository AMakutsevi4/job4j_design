package ru.job4j.cycle;

public class Task107 {
    public static void loop(int[] nums) {
        int count = 0;
        for (int e : nums) {
            if (e == 999) {
                break;
            } else {
                System.out.println(e);
                count++;
            }
        }
        System.out.println("Значений: " + count);
    }
}
