package ru.job4j.cycle;

public class Task106 {
    public static void loop(int[] nums) {
        for (int e : nums) {
            if (e == 0) {
                break;
            } else {
                System.out.println(e);
            }
        }
    }
}
