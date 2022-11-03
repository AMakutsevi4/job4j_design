package ru.job4j.cycle;

public class Task109 {
    public static void loop(int[] nums) {
        for (int y : nums) {
            if (y == 123) {
                System.out.println("Код принят");
                break;
            } else {
                System.out.println("Код не принят");
            }
        }
    }
}
