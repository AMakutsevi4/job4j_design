package ru.job4j.cycle;

public class Task112 {
    public static void loop(int num, int[] nums) {
        int count = 0;
        for (int e : nums) {
            num -= e;
            if (num > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
