package ru.job4j.array;

public class Task78 {
    public static void array(int[] nums) {
        StringBuilder s = new StringBuilder();
        for (int num : nums) {
          int  k = 0;
            for (int i : nums) {
                if (num == i) {
                    k++;
                }
            }
            if (k == 1) {
                s.append(num).append(" ");
            }
        }
        if (s.length() == 0) {
            System.out.print(s);
        } else {
            s.deleteCharAt(s.length() - 1);
            System.out.println(s);
        }
    }
}
