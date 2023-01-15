package ru.job4j.cycle;

public class Task146 {
    public static void loop(int[] nums) {
        boolean flag = true;
        int people = 0;
        int sum = 0;
        String message = "";
        while (people < nums.length && flag) {
            if (sum + nums[people] > 300 && people > 3) {
                flag = false;
                message = "Много людей и перегруз";
            } else if (sum + nums[people] > 300) {
                flag = false;
                message = "Перегруз";
            } else if (people > 3) {
                flag = false;
                message = "Много людей";
            } else if (sum + nums[people] <= 300 || people < 3) {
                message = "Нет";
                sum += nums[people];
                people++;
            }
        }
        System.out.printf("Людей: %d, вес: %d, отказ: %s\n", people, sum, message);
    }
}

