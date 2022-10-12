package ru.job4j.array;

public class Task79 {
    public static void array(int[] nums) {
        StringBuilder s = new StringBuilder();
        for (int num : nums) {
            int k = 0;
            for (int i : nums) {
                if (num == i) {
                    k++;
                }
            }
            if (k > 1) {
                s.append(num).append(" ");
            }
        }
        if (s.length() == 0) {
            System.out.print(s);
        } else {
           System.out.println(removeDuplicates(s.toString()));
        }
    }

    public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (!result.toString().contains(String.valueOf(input.charAt(i)))) {
                result.append(input.charAt(i)).append(" ");
            }
        }
        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }
}
