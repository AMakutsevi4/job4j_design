package ru.job4j.cycle;

public class Task65 {
    public static void loop(int[] nums) {
        int one = 0;
        int two = 0;
        for (int num : nums) {
            if (num == 0) {
                break;
            }
            if (num > 0) {
                one++;
            }
            if (num < 0) {
                two++;
            }
        }
        if (one == two) {
            System.out.println("Да");
        }
        if (one != two) {
            System.out.println("Нет");
        }
    }
}
